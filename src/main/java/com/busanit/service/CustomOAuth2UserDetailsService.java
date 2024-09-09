package com.busanit.service;

import com.busanit.constant.Role;
import com.busanit.domain.OAuth2MemberDTO;
import com.busanit.entity.Member;
import com.busanit.entity.Point;
import com.busanit.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log4j2
public class CustomOAuth2UserDetailsService extends DefaultOAuth2UserService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final MemberService memberService;
    private final PointService pointService;

    // 매서드 재정의로 만듦
    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

        ClientRegistration clientRegistration = userRequest.getClientRegistration();
        String clientName = clientRegistration.getClientName();

        OAuth2User oAuth2User = super.loadUser(userRequest);
        Map<String, Object> paramMap = oAuth2User.getAttributes();

        String email = null;
        if(clientName.equals("Google")){
            email = getGoogleEmail(paramMap);
        }
        else if(clientName.equals("naver")){
            email = getNaverEmail(paramMap);
        }

        return generateDTO(email, paramMap);
    }

    private String getGoogleEmail(Map<String, Object> paramMap){
        String email = (String) paramMap.get("email");

        return email;
    }

    private String getNaverEmail(Map<String, Object> paramMap){
        Map<String, Object> resultMap = (Map<String, Object>) paramMap.get("response");
        String email = (String) resultMap.get("email");

        return email;
    }

    private OAuth2MemberDTO generateDTO(String email, Map<String, Object> paramMap){
        Optional<Member> result = memberRepository.findByEmail(email);
        String temporaryName = "USER-"+RandomStringUtils.randomAlphanumeric(10);

        // DB에 해당 이메일과 사용자가 없다면 자동으로 회원 가입 처리
        if(result.isEmpty()){
            // 회원 추가
            // id = 이메일 주소 / 패스워드는 1111
            Member member = Member.builder()
                    .name(temporaryName)
                    .email(email)
                    .password(passwordEncoder.encode("1111"))
                    .age("1")
                    .role(Role.USER)
                    .social(true)
                    .grade_code(4)
                    .checkedTermsE(true)
                    .checkedTermsS(false)
                    .build();

            // DB에 회원정보 저장(회원가입 처리)
            memberRepository.save(member);

            // 회원가입으로 member 생성 후 해당 멤버 id를 FK로 point란 생성
            pointService.savePoint(Point.createPoint(memberService.findUserIdx(email)));

            OAuth2MemberDTO oAuth2MemberDTO = new OAuth2MemberDTO(
                    temporaryName, "1111", email, true, "1",
                    Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")), true, false);
            oAuth2MemberDTO.setAttr(paramMap);

            return oAuth2MemberDTO;
        } else { // 이미 가입된 회원은 기존 정보를 반환
            Member member = result.get();
            OAuth2MemberDTO oAuth2MemberDTO = new OAuth2MemberDTO(
                    member.getName(), member.getPassword(), member.getEmail(), member.isSocial(), member.getAge(),
                    Arrays.asList(new SimpleGrantedAuthority("ROLE_" + member.getRole())), member.getCheckedTermsE(), member.getCheckedTermsS());

            return oAuth2MemberDTO;
        }
    }

    public void updatePasswordAndAge(String password, String age, String email){
        memberRepository.updatePasswordAndAge(password, age, email);
    }
}

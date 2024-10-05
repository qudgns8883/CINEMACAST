package com.busanit.config;

import com.busanit.handler.CustomFormLoginSuccessHandler;
import com.busanit.handler.CustomSocialLoginSuccessHandler;
import com.busanit.service.MemberService;
import jakarta.servlet.DispatcherType;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {

    private final MemberService memberService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        return http
                .csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable()) // csrf 끄기
                .cors(httpSecurityCorsConfigurer -> httpSecurityCorsConfigurer.disable()) // cors 끄기


                .authorizeHttpRequests(authorizeHttpRequestConfigurer -> authorizeHttpRequestConfigurer
                        .anyRequest().permitAll() // 모든 요청을 허용
                )
                .formLogin(formLoginConfigurer -> formLoginConfigurer
                        .loginPage("/member/login") // login 기본페이지 (주석 처리하면 기본 시큐리티 페이지로 사용 가능)
                        //.loginProcessingUrl("/loginProcess")
                        .usernameParameter("email")
                        .failureUrl("/member/login/error") // 로그인 실패했을때 이동할 url
//                        .defaultSuccessUrl("/main") // 성공했을때 이동할 url
                        .successHandler(authenticationFormLoginSuccessHandler())
                ) // loginForm and login Process setting

//                .oauth2Login(OAuth2LoginConfigurer -> OAuth2LoginConfigurer
//                        .loginPage("/member/login")
//                        .failureUrl("/member/login/error")
////                        .defaultSuccessUrl("/board/list")
//                        .successHandler(authenticationSocialLoginSuccessHandler())
//                )   // social login setting

                .logout(logoutConfigurer -> logoutConfigurer
                        .logoutUrl("/member/logout")
                        .invalidateHttpSession(true) // 세션 무효화
                        .deleteCookies("JSESSIONID") // 쿠키 삭제
                        .clearAuthentication(true) // 인증 정보 삭제
                        .logoutSuccessUrl("/member/login") // 로그아웃 성공 시 이동할 URL
                )

                .build();
    }


    // 패스워드 암호화
    @Bean
    public PasswordEncoder passwordEncoder(){
        // BCryptPasswordEncoder의 해시 함수를 이용해서 비밀번호 암호화
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationSuccessHandler authenticationFormLoginSuccessHandler(){
        return new CustomFormLoginSuccessHandler();
    }

//    @Bean
//    public AuthenticationSuccessHandler authenticationSocialLoginSuccessHandler(){
//        return new CustomSocialLoginSuccessHandler(passwordEncoder());
//    }
}

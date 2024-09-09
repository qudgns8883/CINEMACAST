package com.busanit.entity;

import com.busanit.constant.Role;
import com.busanit.domain.MemberRegFormDTO;
import com.busanit.entity.chat.ChatRoom;
import com.busanit.entity.chat.ChatRoomReadStatus;
import com.busanit.entity.chat.Message;

import com.busanit.entity.movie.Comment;
import com.busanit.entity.movie.Movie;
import com.busanit.entity.movie.MovieReaction;
import com.busanit.entity.movie.ReactionType;
import com.busanit.entity.movie.*;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "member")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseTimeEntity {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //로그인 시 아이디로 이메일 사용
    @Column(unique = true)
    private String email;

    private String password;

    private String age;

    //Role 값을 String 값으로 저장
    @Enumerated(EnumType.STRING)
    private Role role;

    // 소셜 로그인 여부
    private boolean social;

    @Column(nullable = false)
    private Integer grade_code;

    private Boolean checkedTermsE;

    private Boolean checkedTermsS;

    //보낸 메세지
    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL)
    private List<Message> sentMessages = new ArrayList<>();

    //받은 메세지
    @OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL)
    private List<Message> receivedMessages = new ArrayList<>();

    //멤버별 메세지 읽음 상태를 관리
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<ChatRoomReadStatus> readStatuses = new ArrayList<>();

    @ManyToMany(mappedBy = "members", cascade = CascadeType.ALL)
    private List<ChatRoom> chatRooms = new ArrayList<>();

    // 영화 찜
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<FavoriteMovie> favoriteMovies = new ArrayList<>();

    //댓글 연관관계
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Comment> comment = new ArrayList<>();

    //리액션 관계 ( 재밌어요 슬퍼요 재미없어요 등..)
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MovieReaction> reactions = new ArrayList<>();
    //문의 관계
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Inquiry> inquiries = new ArrayList<>();

    // 포인트
    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    List<Point> pointList;

    //멤버와 이벤트게시글 연관관계
    @ManyToMany(mappedBy = "members", fetch = FetchType.LAZY)
    private List<Event> events;

    //문의 연관관계
    public void addInquiry(Inquiry inquiry) {
        inquiries.add(inquiry);
        inquiry.setMember(this);
    }

    //보낸메세지 연관관계
    public void addSentMessage(Message message) {
        this.sentMessages.add(message);
        if (message.getSender() != this) {
            message.setSender(this);
        }
    }

    public void addReceivedMessage(Message message) {
        this.receivedMessages.add(message);
        if (message.getReceiver() != this) {
            message.setReceiver(this);
        }
    }

    // 리액션 연관관계 및 그외 메서드 시작
    @Transactional
    public void addReaction(Movie movie, ReactionType reactionType) {
        MovieReaction reaction = new MovieReaction(this, movie, reactionType);
        reactions.add(reaction);
        movie.getReactions().add(reaction);
    }

    public void removeReaction(Movie movie) {
        for (Iterator<MovieReaction> iterator = reactions.iterator(); iterator.hasNext();) {
            MovieReaction reaction = iterator.next();

            if (reaction.getMember().equals(this) && reaction.getMovie().equals(movie)) {
                iterator.remove();
                reaction.getMovie().getReactions().remove(reaction);
                reaction.setMember(null);
                reaction.setMovie(null);
            }
        }
    }
    // 리액션 연관관계 및 그외 메서드 끝
    public void addComment(Comment comment){
        this.comment.add(comment);
        comment.setMember(this);
    }

    // 찜하기 연관관계 메서드
    public void addFavoriteMovie(FavoriteMovie favoriteMovie) {
        favoriteMovies.add(favoriteMovie);
        favoriteMovie.setMember(this);
    }

    public void removeFavoriteMovie(FavoriteMovie favoriteMovie) {
        favoriteMovies.remove(favoriteMovie);
        favoriteMovie.setMember(null);
    }

    // 일반 폼 회원 생성
    public static Member createMember(MemberRegFormDTO regFormDTO, PasswordEncoder passwordEncoder) {
        String password = passwordEncoder.encode(regFormDTO.getPassword());
        return Member.builder()
                .name(regFormDTO.getName())
                .email(regFormDTO.getEmail())
                .password(password)
                .age(regFormDTO.getAge())
                .role(Role.USER)
                .social(false)
                .grade_code(4)
                .checkedTermsE(regFormDTO.getCheckedTermsE() != null ? regFormDTO.getCheckedTermsE() : true) // 회원가입시 약관에 동의한 것으로 간주함
                .checkedTermsS(regFormDTO.getCheckedTermsS() != null ? regFormDTO.getCheckedTermsS() : false)
                .build();
    }

    // 관리자 생성
    public static Member createMember2(MemberRegFormDTO regFormDTO, PasswordEncoder passwordEncoder) {
        String password = passwordEncoder.encode(regFormDTO.getPassword());
        return Member.builder()
                .name(regFormDTO.getName())
                .email(regFormDTO.getEmail())
                .password(password)
                .age(regFormDTO.getAge())
                .role(Role.ADMIN)
                .social(false)
                .grade_code(1)
                .checkedTermsE(true)
                .checkedTermsS(false)
                .build();
    }

    // 마이페이지 개인정보수정
    public static Member toEntity(MemberRegFormDTO regFormDTO) {
        return Member.builder()
                .id(regFormDTO.getId())
                .name(regFormDTO.getName())
                .email(regFormDTO.getEmail())
                .password(regFormDTO.getPassword())
                .age(regFormDTO.getAge())
                .role(Role.USER)
                .social(regFormDTO.isSocial())
                .grade_code(regFormDTO.getGrade_code())
                .checkedTermsE(regFormDTO.getCheckedTermsE())
                .checkedTermsS(regFormDTO.getCheckedTermsS())
                .build();
    }
}

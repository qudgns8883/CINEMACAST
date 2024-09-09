package com.busanit.entity;

import com.busanit.domain.PointDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Point extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String impUid;

    private String content;

    private Boolean contentType; // 결제취소면 false, 나머지 true

    private String pointType; // + or -

    private Integer points; // 해당 포인트

    private Integer currentPoints; // 합계

    private Integer totalPoints; // 누적

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    // 신규 가입시 적립
    public static Point createPoint(Long memberId) {
        Member member = Member.builder().id(memberId).build();
        return Point.builder()
                .impUid("이벤트")
                .content("신규 가입 적립")
                .contentType(true)
                .pointType("+")
                .points(3000)
                .currentPoints(3000)
                .totalPoints(3000)
                .member(member)
                .build();
    }

    public static Point toEntity(Long memberId, PointDTO pointDTO) {
        Member member = Member.builder().id(memberId).build();
        return Point.builder()
                .id(pointDTO.getId())
                .impUid(pointDTO.getImpUid())
                .content(pointDTO.getContent())
                .contentType(pointDTO.getContentType())
                .pointType(pointDTO.getPointType())
                .points(pointDTO.getPoints())
                .currentPoints(pointDTO.getCurrentPoints())
                .totalPoints(pointDTO.getTotalPoints())
                .member(member)
                .build();
    }
}

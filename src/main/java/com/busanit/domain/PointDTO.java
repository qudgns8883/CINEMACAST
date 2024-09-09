package com.busanit.domain;

import com.busanit.entity.Point;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Slice;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class PointDTO {
    private Long id;
    private Long member_id;
    private String impUid;
    private String content;
    private Boolean contentType;
    private String pointType;
    private Integer points;
    private Integer currentPoints;
    private Integer totalPoints;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;

    public static PointDTO toDTO(Point point) {
        return PointDTO.builder()
                .id(point.getId())
                .impUid(point.getImpUid())
                .content(point.getContent())
                .contentType(point.getContentType())
                .pointType(point.getPointType())
                .points(point.getPoints())
                .currentPoints(point.getCurrentPoints())
                .totalPoints(point.getTotalPoints())
                .regDate(point.getRegDate())
                .updateDate(point.getUpdateDate())
                .build();
    }

    // Slice<Entity> -> Slice<DTO> 변환
    public static Slice<PointDTO> toDTOList(Slice<Point> pointList) {
        Slice<PointDTO> pointDTOList = pointList.map(entity -> PointDTO.builder()
                .id(entity.getId())
                .impUid(entity.getImpUid())
                .content(entity.getContent())
                .contentType(entity.getContentType())
                .pointType(entity.getPointType())
                .points(entity.getPoints())
                .currentPoints(entity.getCurrentPoints())
                .totalPoints(entity.getTotalPoints())
                .regDate(entity.getRegDate())
                .updateDate(entity.getUpdateDate())
                .build());

        return pointDTOList;
    }
}

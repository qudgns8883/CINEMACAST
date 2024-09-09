package com.busanit.domain;

import com.busanit.entity.Theater;
import com.busanit.entity.TheaterNumber;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheaterNumberDTO {
    private Long id;
    private String theaterIdx;
    private Long theaterNumber; // 지점내 상영관 고유 번호
    private Long seatsPerTheater; // 상영관 별 좌석 수
    private List<SeatDTO> seats; // 상영관에 속한 좌석 정보
    private String region;
    private String theaterName;

    public static TheaterNumberDTO toDTO(TheaterNumber theaterNumber) {
        return TheaterNumberDTO.builder()
                .id(theaterNumber.getId())
                .theaterIdx(theaterNumber.getTheaterIdx())
                .theaterNumber(theaterNumber.getTheaterNumber())
                .seatsPerTheater(theaterNumber.getSeatsPerTheater())
                .seats(theaterNumber.getSeats().stream()
                        .map(SeatDTO::toDTO)
                        .collect(Collectors.toList()))
                .region(theaterNumber.getTheater().getRegion())
                .theaterName(theaterNumber.getTheater().getTheaterName())
                .build();
    }
    public void removeSeats() {
        this.seats.clear(); // 좌석 목록 초기화
    }

}

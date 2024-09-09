package com.busanit.service;

import com.busanit.domain.PointDTO;
import com.busanit.entity.Point;
import com.busanit.repository.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PointService {
    private final PointRepository pointRepository;

    // 포인트 적립
    public void savePoint(Point point) {
        pointRepository.save(point);
    }

    // 결제 완료 마이너스 포인트 내역
    public Point getMinusPoint(String impUid, Boolean contentType) {
        return pointRepository.findMinusPoint(impUid, contentType);
    }

    // 결제 완료 플러스 포인트 내역
    public Point getPlusPoint(String impUid, Boolean contentType) {
        return pointRepository.findPlusPoint(impUid, contentType);
    }

    // 포인트 내역(리스트)
    public Slice<PointDTO> getPointInfo(Long member_id, Pageable pageable) {
        Slice<Point> pointList = pointRepository.findByMember_Id(member_id, pageable);

        return PointDTO.toDTOList(pointList);
    }
}

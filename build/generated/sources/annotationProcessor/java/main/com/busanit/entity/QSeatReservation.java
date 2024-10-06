package com.busanit.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSeatReservation is a Querydsl query type for SeatReservation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSeatReservation extends EntityPathBase<SeatReservation> {

    private static final long serialVersionUID = 747754623L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSeatReservation seatReservation = new QSeatReservation("seatReservation");

    public final SimplePath<SeatReservationId> id = createSimple("id", SeatReservationId.class);

    public final BooleanPath isReserved = createBoolean("isReserved");

    public final DateTimePath<java.time.LocalDateTime> reservationTime = createDateTime("reservationTime", java.time.LocalDateTime.class);

    public final StringPath reservedBy = createString("reservedBy");

    public final QSchedule schedule;

    public final QSeat seat;

    public QSeatReservation(String variable) {
        this(SeatReservation.class, forVariable(variable), INITS);
    }

    public QSeatReservation(Path<? extends SeatReservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSeatReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSeatReservation(PathMetadata metadata, PathInits inits) {
        this(SeatReservation.class, metadata, inits);
    }

    public QSeatReservation(Class<? extends SeatReservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.schedule = inits.isInitialized("schedule") ? new QSchedule(forProperty("schedule"), inits.get("schedule")) : null;
        this.seat = inits.isInitialized("seat") ? new QSeat(forProperty("seat"), inits.get("seat")) : null;
    }

}


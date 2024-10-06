package com.busanit.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSeat is a Querydsl query type for Seat
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSeat extends EntityPathBase<Seat> {

    private static final long serialVersionUID = 1191599373L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSeat seat = new QSeat("seat");

    public final StringPath id = createString("id");

    public final BooleanPath isAvailable = createBoolean("isAvailable");

    public final StringPath seatColumn = createString("seatColumn");

    public final ListPath<SeatReservation, QSeatReservation> seatReservations = this.<SeatReservation, QSeatReservation>createList("seatReservations", SeatReservation.class, QSeatReservation.class, PathInits.DIRECT2);

    public final NumberPath<Long> seatRow = createNumber("seatRow", Long.class);

    public final QTheaterNumber theaterNumber;

    public QSeat(String variable) {
        this(Seat.class, forVariable(variable), INITS);
    }

    public QSeat(Path<? extends Seat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSeat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSeat(PathMetadata metadata, PathInits inits) {
        this(Seat.class, metadata, inits);
    }

    public QSeat(Class<? extends Seat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.theaterNumber = inits.isInitialized("theaterNumber") ? new QTheaterNumber(forProperty("theaterNumber"), inits.get("theaterNumber")) : null;
    }

}


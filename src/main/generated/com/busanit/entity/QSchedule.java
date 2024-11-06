package com.busanit.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSchedule is a Querydsl query type for Schedule
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSchedule extends EntityPathBase<Schedule> {

    private static final long serialVersionUID = 348675487L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSchedule schedule = new QSchedule("schedule");

    public final NumberPath<Long> availableSeats = createNumber("availableSeats", Long.class);

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final TimePath<java.time.LocalTime> endTime = createTime("endTime", java.time.LocalTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.busanit.entity.movie.QMovie movie;

    public final ListPath<SeatReservation, QSeatReservation> seatReservations = this.<SeatReservation, QSeatReservation>createList("seatReservations", SeatReservation.class, QSeatReservation.class, PathInits.DIRECT2);

    public final StringPath sessionType = createString("sessionType");

    public final TimePath<java.time.LocalTime> startTime = createTime("startTime", java.time.LocalTime.class);

    public final BooleanPath status = createBoolean("status");

    public final QTheaterNumber theaterNumber;

    public final NumberPath<Long> totalSeats = createNumber("totalSeats", Long.class);

    public QSchedule(String variable) {
        this(Schedule.class, forVariable(variable), INITS);
    }

    public QSchedule(Path<? extends Schedule> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSchedule(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSchedule(PathMetadata metadata, PathInits inits) {
        this(Schedule.class, metadata, inits);
    }

    public QSchedule(Class<? extends Schedule> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.movie = inits.isInitialized("movie") ? new com.busanit.entity.movie.QMovie(forProperty("movie"), inits.get("movie")) : null;
        this.theaterNumber = inits.isInitialized("theaterNumber") ? new QTheaterNumber(forProperty("theaterNumber"), inits.get("theaterNumber")) : null;
    }

}


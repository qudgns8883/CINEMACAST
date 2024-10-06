package com.busanit.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTheaterNumber is a Querydsl query type for TheaterNumber
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTheaterNumber extends EntityPathBase<TheaterNumber> {

    private static final long serialVersionUID = -765359950L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTheaterNumber theaterNumber1 = new QTheaterNumber("theaterNumber1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Seat, QSeat> seats = this.<Seat, QSeat>createList("seats", Seat.class, QSeat.class, PathInits.DIRECT2);

    public final NumberPath<Long> seatsPerTheater = createNumber("seatsPerTheater", Long.class);

    public final QTheater theater;

    public final StringPath theaterIdx = createString("theaterIdx");

    public final NumberPath<Long> theaterNumber = createNumber("theaterNumber", Long.class);

    public QTheaterNumber(String variable) {
        this(TheaterNumber.class, forVariable(variable), INITS);
    }

    public QTheaterNumber(Path<? extends TheaterNumber> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTheaterNumber(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTheaterNumber(PathMetadata metadata, PathInits inits) {
        this(TheaterNumber.class, metadata, inits);
    }

    public QTheaterNumber(Class<? extends TheaterNumber> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.theater = inits.isInitialized("theater") ? new QTheater(forProperty("theater")) : null;
    }

}


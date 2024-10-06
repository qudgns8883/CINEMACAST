package com.busanit.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTheater is a Querydsl query type for Theater
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTheater extends EntityPathBase<Theater> {

    private static final long serialVersionUID = 2008853513L;

    public static final QTheater theater = new QTheater("theater");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final StringPath region = createString("region");

    public final NumberPath<Long> theaterCount = createNumber("theaterCount", Long.class);

    public final StringPath theaterName = createString("theaterName");

    public final StringPath theaterNameEng = createString("theaterNameEng");

    public final ListPath<TheaterNumber, QTheaterNumber> theaterNumbers = this.<TheaterNumber, QTheaterNumber>createList("theaterNumbers", TheaterNumber.class, QTheaterNumber.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> updateDate = createDateTime("updateDate", java.time.LocalDateTime.class);

    public QTheater(String variable) {
        super(Theater.class, forVariable(variable));
    }

    public QTheater(Path<? extends Theater> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTheater(PathMetadata metadata) {
        super(Theater.class, metadata);
    }

}


package com.busanit.entity.movie;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMovieDetail is a Querydsl query type for MovieDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieDetail extends EntityPathBase<MovieDetail> {

    private static final long serialVersionUID = 74535899L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMovieDetail movieDetail = new QMovieDetail("movieDetail");

    public final StringPath certification = createString("certification");

    public final QMovie movie;

    public final NumberPath<Long> movieDetailId = createNumber("movieDetailId", Long.class);

    public final StringPath popularity = createString("popularity");

    public final StringPath releaseDate = createString("releaseDate");

    public final StringPath runtime = createString("runtime");

    public final StringPath video = createString("video");

    public QMovieDetail(String variable) {
        this(MovieDetail.class, forVariable(variable), INITS);
    }

    public QMovieDetail(Path<? extends MovieDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMovieDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMovieDetail(PathMetadata metadata, PathInits inits) {
        this(MovieDetail.class, metadata, inits);
    }

    public QMovieDetail(Class<? extends MovieDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.movie = inits.isInitialized("movie") ? new QMovie(forProperty("movie"), inits.get("movie")) : null;
    }

}


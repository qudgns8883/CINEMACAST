package com.busanit.entity.movie;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFavoriteMovie is a Querydsl query type for FavoriteMovie
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFavoriteMovie extends EntityPathBase<FavoriteMovie> {

    private static final long serialVersionUID = -5557074L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFavoriteMovie favoriteMovie = new QFavoriteMovie("favoriteMovie");

    public final DateTimePath<java.time.LocalDateTime> favoritedAt = createDateTime("favoritedAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> FavoriteId = createNumber("FavoriteId", Long.class);

    public final com.busanit.entity.QMember member;

    public final QMovie movie;

    public QFavoriteMovie(String variable) {
        this(FavoriteMovie.class, forVariable(variable), INITS);
    }

    public QFavoriteMovie(Path<? extends FavoriteMovie> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFavoriteMovie(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFavoriteMovie(PathMetadata metadata, PathInits inits) {
        this(FavoriteMovie.class, metadata, inits);
    }

    public QFavoriteMovie(Class<? extends FavoriteMovie> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.busanit.entity.QMember(forProperty("member")) : null;
        this.movie = inits.isInitialized("movie") ? new QMovie(forProperty("movie"), inits.get("movie")) : null;
    }

}


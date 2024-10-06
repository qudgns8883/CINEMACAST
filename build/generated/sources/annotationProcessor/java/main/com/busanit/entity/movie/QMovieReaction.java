package com.busanit.entity.movie;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMovieReaction is a Querydsl query type for MovieReaction
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieReaction extends EntityPathBase<MovieReaction> {

    private static final long serialVersionUID = 997284659L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMovieReaction movieReaction = new QMovieReaction("movieReaction");

    public final com.busanit.entity.QMember member;

    public final QMovie movie;

    public final NumberPath<Long> reactionId = createNumber("reactionId", Long.class);

    public final EnumPath<ReactionType> reactionType = createEnum("reactionType", ReactionType.class);

    public QMovieReaction(String variable) {
        this(MovieReaction.class, forVariable(variable), INITS);
    }

    public QMovieReaction(Path<? extends MovieReaction> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMovieReaction(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMovieReaction(PathMetadata metadata, PathInits inits) {
        this(MovieReaction.class, metadata, inits);
    }

    public QMovieReaction(Class<? extends MovieReaction> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.busanit.entity.QMember(forProperty("member")) : null;
        this.movie = inits.isInitialized("movie") ? new QMovie(forProperty("movie"), inits.get("movie")) : null;
    }

}


package com.busanit.entity.movie;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMovieActor is a Querydsl query type for MovieActor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieActor extends EntityPathBase<MovieActor> {

    private static final long serialVersionUID = 692311339L;

    public static final QMovieActor movieActor = new QMovieActor("movieActor");

    public final StringPath actorGender = createString("actorGender");

    public final NumberPath<Long> actorId = createNumber("actorId", Long.class);

    public final StringPath actorName = createString("actorName");

    public final StringPath actorProfilePic = createString("actorProfilePic");

    public final ListPath<Movie, QMovie> movies = this.<Movie, QMovie>createList("movies", Movie.class, QMovie.class, PathInits.DIRECT2);

    public QMovieActor(String variable) {
        super(MovieActor.class, forVariable(variable));
    }

    public QMovieActor(Path<? extends MovieActor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovieActor(PathMetadata metadata) {
        super(MovieActor.class, metadata);
    }

}


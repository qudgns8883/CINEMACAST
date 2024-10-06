package com.busanit.entity.movie;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMovieStillCut is a Querydsl query type for MovieStillCut
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieStillCut extends EntityPathBase<MovieStillCut> {

    private static final long serialVersionUID = -890148732L;

    public static final QMovieStillCut movieStillCut = new QMovieStillCut("movieStillCut");

    public final ListPath<Movie, QMovie> movies = this.<Movie, QMovie>createList("movies", Movie.class, QMovie.class, PathInits.DIRECT2);

    public final NumberPath<Long> movieStillCutId = createNumber("movieStillCutId", Long.class);

    public final StringPath stillCuts = createString("stillCuts");

    public QMovieStillCut(String variable) {
        super(MovieStillCut.class, forVariable(variable));
    }

    public QMovieStillCut(Path<? extends MovieStillCut> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovieStillCut(PathMetadata metadata) {
        super(MovieStillCut.class, metadata);
    }

}


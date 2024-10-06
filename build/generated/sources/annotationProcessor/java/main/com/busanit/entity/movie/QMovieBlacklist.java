package com.busanit.entity.movie;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMovieBlacklist is a Querydsl query type for MovieBlacklist
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovieBlacklist extends EntityPathBase<MovieBlacklist> {

    private static final long serialVersionUID = -987903661L;

    public static final QMovieBlacklist movieBlacklist = new QMovieBlacklist("movieBlacklist");

    public final NumberPath<Long> blackId = createNumber("blackId", Long.class);

    public final NumberPath<Long> movieId = createNumber("movieId", Long.class);

    public QMovieBlacklist(String variable) {
        super(MovieBlacklist.class, forVariable(variable));
    }

    public QMovieBlacklist(Path<? extends MovieBlacklist> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovieBlacklist(PathMetadata metadata) {
        super(MovieBlacklist.class, metadata);
    }

}


package com.busanit.entity.movie;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMovie is a Querydsl query type for Movie
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovie extends EntityPathBase<Movie> {

    private static final long serialVersionUID = -2000378134L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMovie movie = new QMovie("movie");

    public final ListPath<MovieActor, QMovieActor> actors = this.<MovieActor, QMovieActor>createList("actors", MovieActor.class, QMovieActor.class, PathInits.DIRECT2);

    public final ListPath<Comment, QComment> comment = this.<Comment, QComment>createList("comment", Comment.class, QComment.class, PathInits.DIRECT2);

    public final ListPath<FavoriteMovie, QFavoriteMovie> favoritedBy = this.<FavoriteMovie, QFavoriteMovie>createList("favoritedBy", FavoriteMovie.class, QFavoriteMovie.class, PathInits.DIRECT2);

    public final ListPath<Genre, QGenre> genres = this.<Genre, QGenre>createList("genres", Genre.class, QGenre.class, PathInits.DIRECT2);

    public final ListPath<MovieImage, QMovieImage> images = this.<MovieImage, QMovieImage>createList("images", MovieImage.class, QMovieImage.class, PathInits.DIRECT2);

    public final BooleanPath modified = createBoolean("modified");

    public final QMovieDetail movieDetail;

    public final NumberPath<Long> movieId = createNumber("movieId", Long.class);

    public final StringPath overview = createString("overview");

    public final ListPath<MovieReaction, QMovieReaction> reactions = this.<MovieReaction, QMovieReaction>createList("reactions", MovieReaction.class, QMovieReaction.class, PathInits.DIRECT2);

    public final ListPath<MovieStillCut, QMovieStillCut> stillCuts = this.<MovieStillCut, QMovieStillCut>createList("stillCuts", MovieStillCut.class, QMovieStillCut.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public QMovie(String variable) {
        this(Movie.class, forVariable(variable), INITS);
    }

    public QMovie(Path<? extends Movie> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMovie(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMovie(PathMetadata metadata, PathInits inits) {
        this(Movie.class, metadata, inits);
    }

    public QMovie(Class<? extends Movie> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.movieDetail = inits.isInitialized("movieDetail") ? new QMovieDetail(forProperty("movieDetail"), inits.get("movieDetail")) : null;
    }

}


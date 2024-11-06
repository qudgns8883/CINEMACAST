package com.busanit.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1800702046L;

    public static final QMember member = new QMember("member1");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final StringPath age = createString("age");

    public final ListPath<com.busanit.entity.chat.ChatRoom, com.busanit.entity.chat.QChatRoom> chatRooms = this.<com.busanit.entity.chat.ChatRoom, com.busanit.entity.chat.QChatRoom>createList("chatRooms", com.busanit.entity.chat.ChatRoom.class, com.busanit.entity.chat.QChatRoom.class, PathInits.DIRECT2);

    public final BooleanPath checkedTermsE = createBoolean("checkedTermsE");

    public final BooleanPath checkedTermsS = createBoolean("checkedTermsS");

    public final ListPath<com.busanit.entity.movie.Comment, com.busanit.entity.movie.QComment> comment = this.<com.busanit.entity.movie.Comment, com.busanit.entity.movie.QComment>createList("comment", com.busanit.entity.movie.Comment.class, com.busanit.entity.movie.QComment.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final ListPath<Event, QEvent> events = this.<Event, QEvent>createList("events", Event.class, QEvent.class, PathInits.DIRECT2);

    public final ListPath<com.busanit.entity.movie.FavoriteMovie, com.busanit.entity.movie.QFavoriteMovie> favoriteMovies = this.<com.busanit.entity.movie.FavoriteMovie, com.busanit.entity.movie.QFavoriteMovie>createList("favoriteMovies", com.busanit.entity.movie.FavoriteMovie.class, com.busanit.entity.movie.QFavoriteMovie.class, PathInits.DIRECT2);

    public final NumberPath<Integer> grade_code = createNumber("grade_code", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Inquiry, QInquiry> inquiries = this.<Inquiry, QInquiry>createList("inquiries", Inquiry.class, QInquiry.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final ListPath<Point, QPoint> pointList = this.<Point, QPoint>createList("pointList", Point.class, QPoint.class, PathInits.DIRECT2);

    public final ListPath<com.busanit.entity.movie.MovieReaction, com.busanit.entity.movie.QMovieReaction> reactions = this.<com.busanit.entity.movie.MovieReaction, com.busanit.entity.movie.QMovieReaction>createList("reactions", com.busanit.entity.movie.MovieReaction.class, com.busanit.entity.movie.QMovieReaction.class, PathInits.DIRECT2);

    public final ListPath<com.busanit.entity.chat.ChatRoomReadStatus, com.busanit.entity.chat.QChatRoomReadStatus> readStatuses = this.<com.busanit.entity.chat.ChatRoomReadStatus, com.busanit.entity.chat.QChatRoomReadStatus>createList("readStatuses", com.busanit.entity.chat.ChatRoomReadStatus.class, com.busanit.entity.chat.QChatRoomReadStatus.class, PathInits.DIRECT2);

    public final ListPath<com.busanit.entity.chat.Message, com.busanit.entity.chat.QMessage> receivedMessages = this.<com.busanit.entity.chat.Message, com.busanit.entity.chat.QMessage>createList("receivedMessages", com.busanit.entity.chat.Message.class, com.busanit.entity.chat.QMessage.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public final EnumPath<com.busanit.constant.Role> role = createEnum("role", com.busanit.constant.Role.class);

    public final ListPath<com.busanit.entity.chat.Message, com.busanit.entity.chat.QMessage> sentMessages = this.<com.busanit.entity.chat.Message, com.busanit.entity.chat.QMessage>createList("sentMessages", com.busanit.entity.chat.Message.class, com.busanit.entity.chat.QMessage.class, PathInits.DIRECT2);

    public final BooleanPath social = createBoolean("social");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}


package com.busanit.entity.chat;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatRoomReadStatus is a Querydsl query type for ChatRoomReadStatus
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatRoomReadStatus extends EntityPathBase<ChatRoomReadStatus> {

    private static final long serialVersionUID = 1471639657L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChatRoomReadStatus chatRoomReadStatus = new QChatRoomReadStatus("chatRoomReadStatus");

    public final QChatRoom chatRoom;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> lastReadTimestamp = createDateTime("lastReadTimestamp", java.time.LocalDateTime.class);

    public final com.busanit.entity.QMember member;

    public QChatRoomReadStatus(String variable) {
        this(ChatRoomReadStatus.class, forVariable(variable), INITS);
    }

    public QChatRoomReadStatus(Path<? extends ChatRoomReadStatus> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChatRoomReadStatus(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChatRoomReadStatus(PathMetadata metadata, PathInits inits) {
        this(ChatRoomReadStatus.class, metadata, inits);
    }

    public QChatRoomReadStatus(Class<? extends ChatRoomReadStatus> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chatRoom = inits.isInitialized("chatRoom") ? new QChatRoom(forProperty("chatRoom")) : null;
        this.member = inits.isInitialized("member") ? new com.busanit.entity.QMember(forProperty("member")) : null;
    }

}


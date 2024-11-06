package com.busanit.entity.chat;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatRoom is a Querydsl query type for ChatRoom
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatRoom extends EntityPathBase<ChatRoom> {

    private static final long serialVersionUID = 1386531937L;

    public static final QChatRoom chatRoom = new QChatRoom("chatRoom");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.busanit.entity.Member, com.busanit.entity.QMember> members = this.<com.busanit.entity.Member, com.busanit.entity.QMember>createList("members", com.busanit.entity.Member.class, com.busanit.entity.QMember.class, PathInits.DIRECT2);

    public final ListPath<Message, QMessage> messages = this.<Message, QMessage>createList("messages", Message.class, QMessage.class, PathInits.DIRECT2);

    public final ListPath<ChatRoomReadStatus, QChatRoomReadStatus> readStatuses = this.<ChatRoomReadStatus, QChatRoomReadStatus>createList("readStatuses", ChatRoomReadStatus.class, QChatRoomReadStatus.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final StringPath type = createString("type");

    public QChatRoom(String variable) {
        super(ChatRoom.class, forVariable(variable));
    }

    public QChatRoom(Path<? extends ChatRoom> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChatRoom(PathMetadata metadata) {
        super(ChatRoom.class, metadata);
    }

}


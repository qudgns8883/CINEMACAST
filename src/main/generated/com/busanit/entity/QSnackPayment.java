package com.busanit.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSnackPayment is a Querydsl query type for SnackPayment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSnackPayment extends EntityPathBase<SnackPayment> {

    private static final long serialVersionUID = 1204057312L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSnackPayment snackPayment = new QSnackPayment("snackPayment");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final StringPath content = createString("content");

    public final NumberPath<Long> count = createNumber("count", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final NumberPath<Long> price = createNumber("price", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public final NumberPath<Long> snack_id = createNumber("snack_id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    public QSnackPayment(String variable) {
        this(SnackPayment.class, forVariable(variable), INITS);
    }

    public QSnackPayment(Path<? extends SnackPayment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSnackPayment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSnackPayment(PathMetadata metadata, PathInits inits) {
        this(SnackPayment.class, metadata, inits);
    }

    public QSnackPayment(Class<? extends SnackPayment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}


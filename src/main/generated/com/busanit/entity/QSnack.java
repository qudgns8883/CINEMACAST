package com.busanit.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSnack is a Querydsl query type for Snack
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSnack extends EntityPathBase<Snack> {

    private static final long serialVersionUID = -1714857402L;

    public static final QSnack snack = new QSnack("snack");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public final StringPath snack_alt = createString("snack_alt");

    public final StringPath snack_detail = createString("snack_detail");

    public final StringPath snack_image = createString("snack_image");

    public final StringPath snack_nm = createString("snack_nm");

    public final NumberPath<Long> snack_price = createNumber("snack_price", Long.class);

    public final StringPath snack_set = createString("snack_set");

    public final NumberPath<Long> snack_stock = createNumber("snack_stock", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    public QSnack(String variable) {
        super(Snack.class, forVariable(variable));
    }

    public QSnack(Path<? extends Snack> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSnack(PathMetadata metadata) {
        super(Snack.class, metadata);
    }

}


create table item_quantity
(
    id           bigint primary key auto_increment,
    menu_item_id bigint             not null,
    quantity     int                not null,
    price        int                not null,
    constraint fk_menu_item_id foreign key (menu_item_id)
        references menu_item (id)
);

create table order_table
(
    order_id              bigint primary key auto_increment,
    total_price           int,
    order_items_id        bigint,
    order_time            time,
    special_note          varchar(200),
    payment_id            bigint,
    delivery_time_minutes int,
    user_id               bigint
);

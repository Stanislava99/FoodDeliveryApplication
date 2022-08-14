create table `order`
(
   id bigint primary key auto_increment,
   username varchar(50) not null,
   user_address varchar(100) not null,
   total_price int not null,
   order_time datetime not null,
   special_note varchar(256)
)ENGINE=InnoDB;

create table item_quantity
(
    item_quantity_id bigint primary key auto_increment,
    item_id bigint not null,
    quantity int not null,
    price int not null
)ENGINE=InnoDB;




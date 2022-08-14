create table restaurant
(
    restaurant_id bigint primary key auto_increment,
    name    varchar(50) not null,
    address varchar(100),
    city    varchar(30) not null,
    description varchar(256) not null
);

create table item
(
    item_id bigint primary key auto_increment,
    name varchar(50) not null,
    description varchar(200) not null,
    price double not null
);



SET sql_mode = '';

create table if not exists restaurant
(
    id   int primary key auto_increment,
    name varchar(50) not null,
    address varchar(100),
    city varchar(30) not null
)engine=innodb ;

create table if not exists  menu_item
(
    id            int primary key auto_increment,
    restaurant_id int,
    name          varchar(50)        not null,
    description   varchar(200),
    price         int                not null,
    constraint fk_restaurant_id foreign key (restaurant_id)
        references restaurant (id)
)engine=innodb;

INSERT INTO restaurant(name, address, city)
VALUES
    ('Amigos', 'City Mall', 'Skopje'),
    ('Baba Cana', 'Kasapski', 'Kumanovo'),
    ('Pelister', 'Plostad', 'Skopje'),
    ('Rustikana', 'Gradski Park', 'Skopje'),
    ('Vizijana', null, 'Kumanovo'),
    ('Baking Bread', 'Partizanska', 'Skopje');


INSERT INTO menu_item(restaurant_id,name,description,price) VALUES (1,'Tampico',null,300);
INSERT INTO menu_item(restaurant_id,name,description,price) VALUES (1,'Roll de Pollo','Mexican Dish',200);
INSERT INTO menu_item(restaurant_id,name,description,price) VALUES (2,'Pleskavica',null,100);
INSERT INTO menu_item(restaurant_id,name,description,price) VALUES (2,'Stek',null,90);
INSERT INTO menu_item(restaurant_id,name,description,price) VALUES (4,'Hamburger',null,200);
INSERT INTO menu_item(restaurant_id,name,description,price) VALUES (4,'Topla Daska',null,450);
INSERT INTO menu_item(restaurant_id,name,description,price) VALUES (5,'The Hank',null,250);

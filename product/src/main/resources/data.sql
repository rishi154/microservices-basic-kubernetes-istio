create table product(id number primary key, name varchar2(50), address varchar2(50), phone varchar(50), date_created date, date_modified date, status varchar2(50),description  varchar2(50), price number,quantity number,merchant_id varchar2(50));

create sequence product_id_sequence start with 1 increment by 1;

insert into product (description, date_created, date_modified, status, price, quantity, merchant_id, id) values ('Product 1', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'In Stock', 1.0, 1000, 8, nextval('product_id_sequence'));

insert into product (description, date_created, date_modified, status, price, quantity, merchant_id, id) values ('Product 2', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'In Stock', 1.0, 1000, 1, nextval('product_id_sequence'));

insert into product (description, date_created, date_modified, status, price, quantity, merchant_id, id) values ('Product 3', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'In Stock', 1.0, 1000, 1, nextval('product_id_sequence'));

insert into product (description, date_created, date_modified, status, price, quantity, merchant_id, id) values ('Product 4', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'In Stock', 1.0, 1000, 3, nextval('product_id_sequence'));

insert into product (description, date_created, date_modified, status, price, quantity, merchant_id, id) values ('Product 5', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'In Stock', 1.0, 1000, 3, nextval('product_id_sequence'));

insert into product (description, date_created, date_modified, status, price, quantity, merchant_id, id) values ('Product 6', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'In Stock', 1.0, 1000, 2, nextval('product_id_sequence'));

insert into product (description, date_created, date_modified, status, price, quantity, merchant_id, id) values ('Product 7', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'In Stock', 1.0, 1000, 8, nextval('product_id_sequence'));

insert into product (description, date_created, date_modified, status, price, quantity, merchant_id, id) values ('Product 8', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'In Stock', 1.0, 1000, 8, nextval('product_id_sequence'));

insert into product (description, date_created, date_modified, status, price, quantity, merchant_id, id) values ('Product 9', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'In Stock', 1.0, 1000, 8, nextval('product_id_sequence'));


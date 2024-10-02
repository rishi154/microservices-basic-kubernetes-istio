/*create table customer(id number primary key, name varchar2(50), address varchar2(50), phone varchar(50), date_created date, date_modified date, status varchar2(50));*/


insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 1', '134567890', 'ACTIVE', 1, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 2', '134567890', 'ACTIVE', 1, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 3', '134567890', 'ACTIVE', 3, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 4', '134567890', 'ACTIVE', 3, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 5', '134567890', 'ACTIVE', 2, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 6', '1234567890', 'ACTIVE', 8, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 7', '2345678901', 'ACTIVE', 8, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 8', '3456789012', 'ACTIVE', 8, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 9', '1234567890', 'ACTIVE', 8, nextval('customer_id_sequence'));

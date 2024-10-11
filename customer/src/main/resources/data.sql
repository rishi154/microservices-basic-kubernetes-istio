create table customer ( date_created timestamp(6), date_modified timestamp(6), id bigint not null,   merchant_id bigint,  address varchar(255),name varchar(255), phone varchar(255), status varchar(255),primary key (id));

create sequence customer_id_sequence start with 1 increment by 1;

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 1', '134567890', 'ACTIVE', 1, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 2', '134567890', 'ACTIVE', 1, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 3', '134567890', 'ACTIVE', 3, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 4', '134567890', 'ACTIVE', 3, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 5', '134567890', 'ACTIVE', 2, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 6', '1234567890', 'ACTIVE', 8, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 7', '2345678901', 'ACTIVE', 8, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 8', '3456789012', 'ACTIVE', 8, nextval('customer_id_sequence'));

insert into customer (address, date_created, date_modified, name, phone, status, merchant_id, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Customer 9', '1234567890', 'ACTIVE', 8, nextval('customer_id_sequence'));

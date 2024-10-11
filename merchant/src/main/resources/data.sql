create table merchant(id number primary key, name varchar2(50), address varchar2(50), phone varchar(50), date_created date, date_modified date, status varchar2(50));

create sequence merchant_id_sequence start with 1 increment by 1;

insert into merchant (address, date_created, date_modified, name, phone, status, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Big Bazar', '134567890', 'ACTIVE', nextval('MERCHANT_ID_SEQUENCE'));

insert into merchant (address, date_created, date_modified, name, phone, status, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Reliance Mart', '134567890', 'ACTIVE', nextval('MERCHANT_ID_SEQUENCE'));

insert into merchant (address, date_created, date_modified, name, phone, status, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Mateshree Mart', '134567890', 'ACTIVE', nextval('MERCHANT_ID_SEQUENCE'));

insert into merchant (address, date_created, date_modified, name, phone, status, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Star Bazaar', '134567890', 'ACTIVE', nextval('MERCHANT_ID_SEQUENCE'));

insert into merchant (address, date_created, date_modified, name, phone, status, id) values ('Pimple Saudagar', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Pakwan Sweets', '134567890', 'ACTIVE', nextval('MERCHANT_ID_SEQUENCE'));

insert into merchant (address, date_created, date_modified, name, phone, status, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Kings Super Market', '1234567890', 'ACTIVE', nextval('MERCHANT_ID_SEQUENCE'));

insert into merchant (address, date_created, date_modified, name, phone, status, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Jayant and Sons', '2345678901', 'ACTIVE', nextval('MERCHANT_ID_SEQUENCE'));

insert into merchant (address, date_created, date_modified, name, phone, status, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Quality Bakery', '3456789012', 'ACTIVE', nextval('MERCHANT_ID_SEQUENCE'));

insert into merchant (address, date_created, date_modified, name, phone, status, id) values ('Chiplun', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Aapla Bazaar', '1234567890', 'ACTIVE', nextval('MERCHANT_ID_SEQUENCE'));
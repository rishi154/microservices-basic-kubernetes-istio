create table transaction ( date_created timestamp(6), date_modified timestamp(6),
 tran_id bigint not null,   merchant_id bigint, customer_id bigint,  status varchar(10),amount bigint,
 primary key (tran_id));

create table tran_product(id number primary key,
date_created timestamp(6), date_modified timestamp(6), description  varchar2(50), price bigint,quantity bigint, tran_id bigint not null,
foreign key(tran_id) references transaction(tran_id));



create sequence transaction_id_sequence start with 5 increment by 5;

create sequence tran_product_id_sequence start with 1 increment by 1;



insert into  transaction (amount, customer_id, date_created, date_modified, merchant_id, status, tran_id)
    values (5000, 1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1, 'APPROVED', nextval('transaction_id_sequence'));
    
insert into tran_product(date_created, date_modified, description, price, quantity, tran_id, id)
    values  (CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Product 1', 5000, 30, 5,  nextval('tran_product_id_sequence'));

    insert into tran_product(date_created, date_modified, description, price, quantity, tran_id, id)
        values  (CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Product 2', 6000, 15, 5,  nextval('tran_product_id_sequence'));
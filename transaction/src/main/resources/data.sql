create table transaction ( date_created timestamp(6), date_modified timestamp(6),
 tran_id bigint not null,   merchant_id bigint, customer_id bigint,  status varchar(10),amount bigint,
 primary key (tran_id));

create table tran_product(id number primary key,
date_created date, date_modified date, description  varchar2(50), price number,quantity number, tran_id bigint not null);


create sequence transaction_id_sequence start with 1 increment by 1;

create sequence tran_product_id_sequence start with 1 increment by 1;



insert into  transaction (amount, customer_id, date_created, date_modified, merchant_id, status, tran_id)
    values (5000, 1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1, 'APPROVED', nextval('transaction_id_sequence'));
    
insert into tran_product(date_created, date_modified, description, price, quantity, tran_id, id)
    values  (CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Product 1', 5000, 30, 1,  nextval('tran_product_id_sequence'));

    insert into tran_product(date_created, date_modified, description, price, quantity, tran_id, id)
        values  (CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Product 2', 6000, 15, 1,  nextval('tran_product_id_sequence'));
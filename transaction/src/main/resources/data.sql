insert into  transaction (amount, customer_id, date_created, date_modified, merchant_id, status, tran_id) 
    values (5000, 1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1, 'APPROVED', nextval('transaction_id_sequence'));
    
insert into tran_product(date_created, date_modified, description, price, quantity, tran_id, id) 
    values  (CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'Product 1', 5000, 30, 1,  tran_product_id_sequence.nextval);
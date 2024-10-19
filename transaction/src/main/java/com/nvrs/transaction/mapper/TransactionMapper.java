package com.nvrs.transaction.mapper;

import com.nvrs.transaction.entity.TranProduct;
import com.nvrs.transaction.entity.Transaction;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TransactionMapper {

    @Select("select * from Transaction")
    @Results({
            @Result(property = "tran_id", column = "tran_id"),
            @Result(property = "merchantId", column = "merchant_id"),
            @Result(property = "customerId", column = "customer_id"),
            @Result(property = "products", column = "tran_id", javaType= List.class, many=@Many(select="selectProducts"))
    })
    List<Transaction> findAll();

    @Select("select * from tran_product where tran_id= #{tran_id}")
    @Results({
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    List<TranProduct> selectProducts(long tran_id);

    @Insert( value = "insert into  transaction (amount, customer_id, date_created, date_modified, merchant_id, status, tran_id) " +
            "values(#{amount},#{customerId},#{dateCreated},#{dateModified},#{merchantId},#{status},#{tran_id})")
    @SelectKey(keyColumn = "tran_id", keyProperty = "tran_id", statement = "VALUES NEXT VALUE FOR transaction_id_sequence", before = true, resultType = long.class )
    void saveTransaction(Transaction xtn);

    /*@Insert("insert into tran_product(date_created, date_modified, description, price, quantity, tran_id, id) " +
            "values(#{product.dateCreated},#{product.dateModified},#{product.description},#{product.price},#{product.quantity},#{tranId1},#{id})")
    @SelectKey( keyColumn = "id", keyProperty = "id", statement = "VALUES NEXT VALUE FOR tran_product_id_sequence", before = true, resultType = Long.class )
    void saveTransProduct(TranProduct product, Long tranId);*/

    @Insert("<script> " +
            "insert into tran_product(date_created, date_modified, description, price, quantity, tran_id, id) " +
            "values " +
            "<foreach item='product' collection='theCollection' open='' separator=',' close=''> " +
            "(#{product.dateCreated},#{product.dateModified},#{product.description},#{product.price},#{product.quantity},#{tranId},nextval('tran_product_id_sequence'))" +
            " </foreach> " +
            "</script>")
    @SelectKey( keyColumn = "id", keyProperty = "id", statement = "VALUES NEXT VALUE FOR tran_product_id_sequence", before = true, resultType = Long.class )
    void saveTransProduct(@Param("theCollection") List<TranProduct> theCollection, Long tranId);


    @Select("select * from Transaction where tran_id= #{tranId}")
    @Results({
            @Result(property = "tran_id", column = "tran_id"),
            @Result(property = "merchantId", column = "merchant_id"),
            @Result(property = "customerId", column = "customer_id"),
            @Result(property = "products", column = "tran_id", javaType= List.class, many=@Many(select="selectProducts"))
    })
    Transaction findById(long tranId);
}

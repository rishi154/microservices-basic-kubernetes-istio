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
}

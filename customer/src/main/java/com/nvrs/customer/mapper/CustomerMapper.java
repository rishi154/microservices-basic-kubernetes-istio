package com.nvrs.customer.mapper;

import com.nvrs.customer.entity.Customer;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Mapper
public interface CustomerMapper {

    @Select("select * from customer")
    @Results({
            @Result(property = "merchantId", column = "merchant_id"),
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    List<Customer> findAll();


    @Select("select * from customer where id =#{id}")
    @Results({
            @Result(property = "merchantId", column = "merchant_id"),
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    Customer findById(long id);

    @Select("select * from customer")
    @Results({
            @Result(property = "merchantId", column = "merchant_id"),
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    List<Customer> getAllCustomersByPage(RowBounds rb);

    @Insert("INSERT into Customer(id,merchant_id,date_created,date_modified,name,address,phone) VALUES(#{id},#{merchantId}, #{dateCreated}, #{dateModified}, #{name}, #{address}, #{phone})")
    @SelectKey( keyColumn = "ID", keyProperty = "id", statement = "VALUES NEXT VALUE FOR CUSTOMER_ID_SEQUENCE", before = true, resultType = Long.class )
    void save(Customer customer);

}

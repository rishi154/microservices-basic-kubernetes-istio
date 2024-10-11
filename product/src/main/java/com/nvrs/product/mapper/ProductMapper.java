package com.nvrs.product.mapper;

import com.nvrs.product.entity.Product;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("select * from Product")
    @Results({
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    List<Product> findAll();


    @Select("select * from Product where id =#{id}")
    @Results({
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    Product findById(long id);

    @Select("select * from Product")
    @Results({
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    List<Product> getAllProductsByPage(RowBounds rb);

    @Insert("INSERT into Product(id,date_created,date_modified,name,address,phone,status) VALUES(#{id},#{dateCreated}, #{dateModified}, #{name}, #{address}, #{phone}, #{status})")
    @SelectKey( keyColumn = "ID", keyProperty = "id", statement = "VALUES NEXT VALUE FOR PRODUCT_ID_SEQUENCE", before = true, resultType = Long.class )
    void save(Product Product);
}

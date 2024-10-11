package com.nvrs.merchant.mapper;

import com.nvrs.merchant.entity.Merchant;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface MerchantMapper {

    @Select("select * from Merchant")
    @Results({
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    List<Merchant> findAll();


    @Select("select * from Merchant where id =#{id}")
    @Results({
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    Merchant findById(long id);

    @Select("select * from Merchant")
    @Results({
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateModified", column = "date_modified"),
    })
    List<Merchant> getAllMerchantsByPage(RowBounds rb);

    @Insert("INSERT into Merchant(id,date_created,date_modified,name,address,phone,status) VALUES(#{id},#{dateCreated}, #{dateModified}, #{name}, #{address}, #{phone}, #{status})")
    @SelectKey( keyColumn = "ID", keyProperty = "id", statement = "VALUES NEXT VALUE FOR MERCHANT_ID_SEQUENCE", before = true, resultType = Long.class )
    void save(Merchant merchant);

}

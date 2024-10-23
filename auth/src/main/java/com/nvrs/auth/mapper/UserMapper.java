package com.nvrs.auth.mapper;

import com.nvrs.auth.model.User;
import org.apache.ibatis.annotations.*;



@Mapper
public interface UserMapper {

    @Select("select * from users where email =#{id}")
    User findByEmail(String id);

    @Insert("INSERT into users(fullName,email,password, created_at, updated_at) VALUES(#{fullName}, #{email}, #{password}, #{createdAt}, #{updatedAt})")
    @Options(useGeneratedKeys=true,keyProperty = "id", keyColumn = "id")
    void save(User user);
}

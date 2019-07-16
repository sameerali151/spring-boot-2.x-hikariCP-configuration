package com.egiants.syed.app.repository.primary;

import com.egiants.syed.app.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User SelectUserById(@Param("id") int id);
}

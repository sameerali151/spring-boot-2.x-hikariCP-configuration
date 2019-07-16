package com.egiants.syed.app.repository.second;

import com.egiants.syed.app.entity.Info;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface InfoMapper {
    @Select("select * from info where id = #{id}")
    Info SelectInfoById(@Param("id") int id);
}

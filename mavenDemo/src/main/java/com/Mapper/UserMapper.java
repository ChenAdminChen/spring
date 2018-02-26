package com.Mapper;

import com.module.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by chen on 2018/2/10.
 */

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User getUsers(Integer id);

    @Update("update user set name = #{name} where id = #{id}")
    int update(User user);
}

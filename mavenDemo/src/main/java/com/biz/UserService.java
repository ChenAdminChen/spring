package com.biz;

import com.Mapper.UserMapper;
import com.module.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chen on 2018/2/10.
 * 对于业务层的接口，每个类需要添加
 * @Service 用于声明为服务类
 * @MapperScan(basePackages="sample.mybatis.mapper")
 * @MapperScan("sample.mybatis.mapper") 用于声明mapper类所在的包
 */
@Service
@MapperScan("com.Mapper")
public class UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 获得某个用户的信息
     * @param id
     * @return
     */
    public User getUser(Integer id){
        User user = userMapper.getUsers(id);
        return user;
    }

    /**
     * 更新某个用户值
     * @param user
     * @return
     */
    public int updateUser(User user){
        int result = userMapper.update(user);
        return result;
    }
}

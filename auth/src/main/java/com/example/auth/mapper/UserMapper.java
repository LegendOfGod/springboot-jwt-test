package com.example.auth.mapper;

import com.example.auth.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lqb
 * @date 2021/12/28 9:38
 */
@Mapper
public interface UserMapper {

    /**
     * 根据userName查找用户信息
     * @param userName username
     * @return 用户pojo
     */
    public UserPojo queryByUserName(@Param("userName") String userName);

    

}

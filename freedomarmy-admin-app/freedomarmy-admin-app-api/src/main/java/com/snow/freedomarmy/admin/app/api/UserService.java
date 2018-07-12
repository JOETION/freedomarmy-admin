package com.snow.freedomarmy.admin.app.api;

import com.snow.freedomarmy.admin.app.pojo.UserDto;

import java.util.List;

/**
 * @Author: Wonderland
 * @Date: 2018/7/9 11:40
 * @Description: com.snow.freedomarmy.admin.app.api
 * freedomarmy-admin
 */
public interface UserService {
    /**
     * 通过用户名查找用户的信息
     * @param username
     * @return
     */
//     UserDto findByUsername(String username);

    /**
     *  显示用户的信息
     * @param
     * @return
     */
   List<UserDto> findAll();

    /**
     * 查找用户
     * @param
     * @return
     */



     List<UserDto> findChenckUser(String username);







}




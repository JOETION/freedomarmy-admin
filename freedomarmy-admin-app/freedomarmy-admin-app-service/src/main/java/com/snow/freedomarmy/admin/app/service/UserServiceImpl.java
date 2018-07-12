package com.snow.freedomarmy.admin.app.service;

import com.snow.freedomarmy.admin.app.api.UserService;
import com.snow.freedomarmy.admin.app.core.model.User;
import com.snow.freedomarmy.admin.app.core.model.UserExample;
import com.snow.freedomarmy.admin.app.dao.mapper.UserMapper;
import com.snow.freedomarmy.admin.app.pojo.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Wonderland
 * @Date: 2018/7/9 10:56
 * @Description: com.snow.freedomarmy.admin.app.service
 * freedomarmy-admin
 */
@Service
@Transactional
//事务交给Spring 管理
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 根据ID查询用户并显示用户的信息
     * @param id
     * @return
     */



    @Override
    public List<UserDto> findChenckUser(String  username) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        if(!(StringUtils.isEmpty(username))){
            criteria.andUsernameLike("%"+username+"%");
        }
        List<User> users=userMapper.selectByExample(userExample);
        List<UserDto>   list=new ArrayList<>();
        for (User user:users){
            UserDto userDto=new UserDto();
            userDto.setId(user.getId());
            userDto.setUsername(user.getUsername());
            userDto.setNickname(user.getNickname());
            userDto.setName(user.getName());
            userDto.setGender(user.getGender());
            userDto.setGrade(user.getGrade());
            userDto.setMobile(user.getMobile());
            userDto.setEmail(user.getEmail());
            userDto.setAddress(user.getAddress());
            userDto.setPersonalitySignature(user.getPersonalitySignature());
            list.add(userDto);


        }


        return list;
    }






    @Override
    public List<UserDto> findAll() {
        UserExample userExample=new UserExample();
        userExample.createCriteria();
        List<User> users=userMapper.selectByExample(userExample);
        List<UserDto> list=new ArrayList<>();
        for(User user:users){
            UserDto userDto=new UserDto();
            userDto.setId(user.getId());
            userDto.setUsername(user.getUsername());
            userDto.setNickname(user.getNickname());
            userDto.setName(user.getName());
            userDto.setGender(user.getGender());
            userDto.setGrade(user.getGrade());
            userDto.setMobile(user.getMobile());
            userDto.setEmail(user.getEmail());
            userDto.setAddress(user.getAddress());
            userDto.setPersonalitySignature(user.getPersonalitySignature());
            list.add(userDto);
        }


        return list;
    }




}

package com.snow.freedomarmy.admin.app.web.controller;

import com.snow.freedomarmy.admin.app.api.UserService;
import com.snow.freedomarmy.admin.app.pojo.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: Wonderland
 * @Date: 2018/7/9 18:46
 * @Description: com.snow.freedomarmy.admin.app.web.controller
 * freedomarmy-admin
 */

@Controller
@RequestMapping("/freedomarmy/admin")
public class UserController {

    @Autowired
    UserService userService;
    /**
     * 查询某个用户
     * @param
     * @param
     * @return
     */

 @RequestMapping(value = "/search",method =RequestMethod.POST)
    public ModelAndView getUser(@RequestParam(value = "username") String username){
    List<UserDto>  userDto=userService.findChenckUser(username);
//     System.out.println("userDto = " + userDto);
//     System.out.println(   "uhecuahvu"+id);
     ModelAndView modelAndView=new ModelAndView();
     modelAndView.addObject("userlist",userDto);
     modelAndView.setViewName("user_list");
      return modelAndView;
 }
 @RequestMapping(value = "/userlist", method = RequestMethod.GET)
public  ModelAndView userLis(){
     ModelAndView modelAndView =new ModelAndView();
     List<UserDto> userDto=userService.findAll();
     
     modelAndView.addObject("userlist" ,userDto);
     modelAndView.setViewName("user_list");
     return  modelAndView;

}





}

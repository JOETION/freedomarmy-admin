package com.snow.freedomarmy.admin.app.web.controller;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.api.AdminService;
import com.snow.freedomarmy.admin.app.pojo.AdminDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/freedomarmy")
public class AdminController {

    @Autowired
    AdminService adminService;


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("name") String loginName, @RequestParam("password") String password) {
        AdminDto adminByName = adminService.getAdminByName(loginName, password);
        ModelAndView modelAndView = new ModelAndView();
        if (adminByName != null) {
            modelAndView.setViewName("index");
            modelAndView.addObject("admin", adminByName);
        }else{
            modelAndView.setViewName("redirect:/freedomarmy/admin");
        }
        return modelAndView;
    }

}

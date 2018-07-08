package com.snow.freedomarmy.admin.app.api;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.pojo.AdminDto;

/**
 * 用户服务
 */
public interface AdminService {

    AdminDto getAdminByName(String loginName, String password);
}

package com.snow.freedomarmy.admin.app.api;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.exception.RemarkException;
import com.snow.freedomarmy.admin.app.pojo.AdminDto;

/**
 * 用户服务
 */
public interface AdminService {

    /**
     * 通过登录名和密码获取管理员信息
     *
     * @param loginName
     * @param password
     * @return
     */
    AdminDto getAdminByName(String loginName, String password);

    /**
     * 修改密码
     *
     * @param id
     * @param password
     * @return
     */
    boolean updatePwdById(int id, String password) throws RemarkException;

    /**
     * 获得id对象
     */
    AdminDto getAdminById(int id);
}

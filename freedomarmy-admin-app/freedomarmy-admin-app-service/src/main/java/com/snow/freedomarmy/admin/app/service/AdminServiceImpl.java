package com.snow.freedomarmy.admin.app.service;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.api.AdminService;
import com.snow.freedomarmy.admin.app.core.model.Admin;
import com.snow.freedomarmy.admin.app.core.model.AdminExample;
import com.snow.freedomarmy.admin.app.dao.mapper.AdminMapper;
import com.snow.freedomarmy.admin.app.pojo.AdminDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public AdminDto getAdminByName(String loginName, String password) {

        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(password).andDeletedEqualTo(0);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        //此处可以抛异常进行处理
        if (admins == null || admins.size() == 0) {
            return null;
        } else {
            Admin admin = admins.get(0);
            AdminDto adminDto = new AdminDto.Builder().setId(admin.getId())
                    .setEmail(admin.getEmail())
                    .setLoginName(admin.getLoginName())
                    .setName(admin.getName())
                    .setPassword(admin.getPassword())
                    .setPhone(admin.getPhone())
                    .setRemark(admin.getRemark())
                    .setType(admin.getType())
                    .build();
            return adminDto;
        }

    }
}

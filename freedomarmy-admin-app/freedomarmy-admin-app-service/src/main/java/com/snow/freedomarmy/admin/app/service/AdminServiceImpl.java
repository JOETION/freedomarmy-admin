package com.snow.freedomarmy.admin.app.service;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.api.AdminService;
import com.snow.freedomarmy.admin.app.api.CommodityService;
import com.snow.freedomarmy.admin.app.core.model.Admin;
import com.snow.freedomarmy.admin.app.core.model.AdminExample;
import com.snow.freedomarmy.admin.app.dao.mapper.AdminMapper;
import com.snow.freedomarmy.admin.app.exception.RemarkException;
import com.snow.freedomarmy.admin.app.pojo.AdminDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    private static final Logger LOGGER = Logger.getLogger(AdminService.class);

    @Override
    public AdminDto getAdminByName(String loginName, String password) {
        try {
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
        } catch (Exception e) {
            LOGGER.info(e);
            return null;
        }


    }

    /**
     * 修改密码
     *
     * @param id
     * @param password
     * @return
     */
    @Override
    public boolean updatePwdById(int id, String password) throws RemarkException {
        try {
            Admin admin = new Admin();
            admin.setPassword(password);
            AdminExample adminExample = new AdminExample();
            adminExample.createCriteria().andIdEqualTo(id);
            int row = adminMapper.updateByExampleSelective(admin, adminExample);
            if (row > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1002, "更新用户密码失败，用户 id=" + id, e.getMessage());
        }


    }

    @Override
    public AdminDto getAdminById(int id) {
        try {
            Admin admin = adminMapper.selectByPrimaryKey(id);
            AdminDto adminDto = new AdminDto.Builder().setId(admin.getId())
                    .setPassword(admin.getPassword())
                    .build();
            return adminDto;
        } catch (Exception e) {
            LOGGER.info(e);
            return null;
        }

    }
}

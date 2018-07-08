package com.snow.freedomarmy.admin.app.pojo;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import java.io.Serializable;

/**
 * 管理员
 */
public class AdminDto implements Serializable {

    private Integer id;
    private String loginName;
    private String password;
    private String name;
    private String phone;
    private String email;
    private Integer type;
    private String remark;

    private AdminDto(Builder builder) {
        this.id = builder.id;
        this.loginName = builder.loginName;
        this.password = builder.password;
        this.name = builder.name;
        this.phone = builder.phone;
        this.email = builder.email;
        this.type = builder.type;
        this.remark = builder.remark;

    }

    //自动生成
    public static class Builder {
        private Integer id;
        private String loginName;
        private String password;
        private String name;
        private String phone;
        private String email;
        private Integer type;
        private String remark;

        public AdminDto build() {
            return new AdminDto(this);
        }


        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }


        public Builder setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }


        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }


        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }


        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }


        public Builder setType(Integer type) {
            this.type = type;
            return this;
        }


        public Builder setRemark(String remark) {
            this.remark = remark;
            return this;
        }
    }


}

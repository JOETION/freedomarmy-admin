package com.snow.freedomarmy.admin.app.pojo;

/**
 * @Author: Wonderland
 * @Date: 2018/7/9 11:34
 * @Description: com.snow.freedomarmy.admin.app.pojo
 * freedomarmy-admin
 */
public class UserDto {


    /**
     * 用户实体类
     */
    private int id;//用户id
    private String username;//用户名
    private String password;//用户的密码
    private String nickname;//用户的绰号
    private String name;//用户真实名字
    private String gender;//用户的性别
    private int grade;//用户的等级
    private  String mobile;//用户的电话
    private String email;//用户的邮箱
    private  String address;//用户的地址
    private String personalitySignature;//个性签名

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalitySignature() {
        return personalitySignature;
    }

    public void setPersonalitySignature(String personalitySignature) {
        this.personalitySignature = personalitySignature;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", personalitySignature='" + personalitySignature + '\'' +
                '}';
    }
}

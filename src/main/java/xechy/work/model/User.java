package xechy.work.model;

import java.util.Date;

/**
 * Created by Japa xie on 2016/7/30.
 */
public class User {

    //用户id
    private long id;
    //用户姓名
    private String name;
    //用户密码
    private String password;
    //用户邮箱
    private String mail;
    //用户电话
    private String phone;
    //注册日期
    private Date date;
    //用户地址
    private String address;
    //用户性别
    private char sex;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}

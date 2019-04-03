package com.czxy.model;

/**
 * @author zhangjian1@itcast.cn
 * @date 2018/12/27
 * @infos
 */
public class Student {
    private String name;
    private String sex;
    private String phone;

    public Student() {

    }

    public Student(String name, String sex, String phone) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

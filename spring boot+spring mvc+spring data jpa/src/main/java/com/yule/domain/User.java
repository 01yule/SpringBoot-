package com.yule.domain;

import javax.persistence.*;

/**
 * @Author:yl
 * @Date:2019/6/16 22:11
 * @Version 1.0
 */
@Entity//表示当前类为实体类
//@Table(name="t_user")//表名和实体类的名称不一致时使用
public class User {
    @Id //表示该字段是主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示该主键是自增长
    private Integer id;
    @Column(name="username")//如果字段名和属性名不一致的时候
    private String username;
    private String password;
    private String sex;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

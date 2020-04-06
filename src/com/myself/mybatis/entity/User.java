package com.myself.mybatis.entity;

import com.myself.mybatis.Column;
import com.myself.mybatis.Table;

/**
 * @author RockerBaozi
 */
@Table("tbl_user")
public class User {

    @Column("name")
    private String name;

    @Column("age")
    private int age;

    @Column("email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

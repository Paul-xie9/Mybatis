package com.xbc.bean;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String password;
    //关联关系,多对一
    private Teacher teacher;
}

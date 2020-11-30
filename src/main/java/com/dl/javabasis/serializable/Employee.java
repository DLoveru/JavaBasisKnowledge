package com.dl.javabasis.serializable;

import java.io.Serializable;

/**
 * @author Jalen.Deng
 * @description 只有实现序列化接口的类才能进行序列化
 * @date 2020/11/29 14:33
 **/
public class Employee implements Serializable {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

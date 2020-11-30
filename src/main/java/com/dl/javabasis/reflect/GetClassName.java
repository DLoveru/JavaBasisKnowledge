package com.dl.javabasis.reflect;

/**
 * @author Jalen.Deng
 * @description 获取某个类的类名
 * @date 2020/11/28 16:22
 **/
public class GetClassName {

    public static void main(String[] args) throws ClassNotFoundException {
        String name = "java.lang.String";
        Class forName = Class.forName(name);
        System.out.println(forName.getName());
    }
}

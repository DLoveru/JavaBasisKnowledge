package com.dl.javabasis.reflect;

/**
 * @author Jalen.Deng
 * @description 根据一个字符串得到一个类
 * @date 2020/11/28 16:20
 **/
public class GetClass {
    public static void main(String[] args) {
        String name = "jalen";
        Class<? extends String> nameClass = name.getClass();
        System.out.println(nameClass.getName());//output:java.lang.String
    }
}

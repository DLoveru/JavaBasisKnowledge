package com.dl.javabasis.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jalen.Deng
 * @description 泛型 通配符
 * @date 2020/11/29 15:56
 **/

public class GenericTest {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);
        getUperNumber(age);
    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
}
/**
 data :icon
 data :18
 data :314
 **/

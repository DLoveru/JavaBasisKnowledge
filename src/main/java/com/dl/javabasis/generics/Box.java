package com.dl.javabasis.generics;

/**
 * @author Jalen.Deng
 * @description 泛型类
 * @date 2020/11/29 15:55
 **/
public class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("jalen"));

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
}
/**
 * 整型值为 :10
 *
 * 字符串为 :jalen
 */

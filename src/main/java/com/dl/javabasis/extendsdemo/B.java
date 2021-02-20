package com.dl.javabasis.extendsdemo;

import java.util.HashSet;

/**
 * @author Jalen.Deng
 * @description
 * @date 2021/2/20 9:37
 **/
class A {
    public A() {
        System.out.println("class A");
    }
    { System.out.println("I'm A class"); }
    static { System.out.println("class A static"); }
}
public class B extends A {
    public B() {
        System.out.println("class B");
    }

    {
        System.out.println("I'm B class");
    }

    static {
        System.out.println("class B static");
    }

    public static void main(String[] args) {
        new B();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

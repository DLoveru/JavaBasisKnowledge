package com.dl.javabasis.reflect;

/**
 * @author Jalen.Deng
 * @description 工具测试类
 * @date 2020/11/28 17:51
 **/
public class ReflectUtilTest {
    public static void main(String[] args) {
        Student student = (Student) ReflectUtil.createObject(Student.class);
        student.playGame();
        //调用私有方法
        ReflectUtil.invokeInstanceMethod(student, "sing");
        System.out.println(student.toString());
    }
}

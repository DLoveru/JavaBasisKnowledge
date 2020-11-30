package com.dl.javabasis.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Jalen.Deng
 * @description 反射测试类
 * @date 2020/11/28 16:44
 **/
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Student student = new Student();
        Class<? extends Student> studentClass = student.getClass();
        //获取所有构造方法
        Constructor<?>[] constructors = studentClass.getDeclaredConstructors();
        printConstructor(constructors);
        /**output
         * public参数：
         *
         * public参数：
         * java.lang.String java.lang.Integer int
         */
        //获取特定的构造方法
        Class<?>[] classes = {String.class,Integer.class,int.class};
        Constructor<? extends Student> declaredConstructor = studentClass.getDeclaredConstructor(classes);
        System.out.println("输出构造函数"+declaredConstructor.getParameterTypes().toString());
        //调用构造方法
        Student studentInstance = declaredConstructor.newInstance("jalen",24,100);
        studentInstance.playGame();
        //获取所有方法，但不包括继承的方法
        Method[] declaredMethods = studentClass.getDeclaredMethods();
        //获取指定的方法，但不包括继承的方法
        Method singMethod = studentClass.getDeclaredMethod("sing");
        System.out.println(declaredMethods[0].getName());
        //调用私有方法需要开启setAccessible(true),不然报错com.dl.java.reflect.Student with modifiers "private"
        singMethod.setAccessible(true);
        Object invoke = singMethod.invoke(studentClass);
        System.out.println(singMethod.getName());
    }

    private static void printConstructor(Constructor<?>[] constructors) {
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(Modifier.toString(constructors[i].getModifiers()) + "参数：");
            Class[] parametertypes = constructors[i].getParameterTypes();
            for (int j = 0; j < parametertypes.length; j++) {
                System.out.print(parametertypes[j].getName() + " ");
            }
            System.out.println("");
        }
    }

}

package com.dl.javabasis.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Jalen.Deng
 * @description 序列化：将对象转成二进制文件，本质上是byte[]数组
 * @date 2020/11/29 14:34
 **/
public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("jalen", 24);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E:/ioDir/employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//会创建employee.ser的二进制文件，本质是byte[]数组

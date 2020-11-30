package com.dl.javabasis.serializable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Jalen.Deng
 * @description 反序列化：将文件转换成java对象
 * @date 2020/11/29 14:39
 **/
public class DeserializeDemo {
    public static void main(String[] args) {
        Employee employee = null;
        try {
            FileInputStream inputStream = new FileInputStream("E:/ioDir/employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            try {
                employee = (Employee) objectInputStream.readObject();
                objectInputStream.close();
                inputStream.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("employee:" + employee.toString());
        System.out.println("employee name:" + employee.getName());
    }
}
/**console
 *
 * employee:com.dl.java.serializable.Employee@4dd8dc3
 * employee name:jalen
 */

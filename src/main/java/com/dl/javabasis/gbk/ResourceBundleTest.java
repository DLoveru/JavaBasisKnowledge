package com.dl.javabasis.gbk;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Jalen.Deng
 * @description
 * @date 2021/2/20 16:34
 **/
public class ResourceBundleTest {
    public static void main(String[] args) {
        //baseName为属性文件名
        //ResourceBundle能够依据Local的不同，选择性的读取与Local对应后缀的properties文件，以达到国际化的目的。
        ResourceBundle bundle = ResourceBundle.getBundle("my", new Locale("zh", "CN"));
    }
}

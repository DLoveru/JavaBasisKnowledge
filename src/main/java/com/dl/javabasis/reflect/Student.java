package com.dl.javabasis.reflect;

/**
 * @author Jalen.Deng
 * @description
 * @date 2020/11/28 16:42
 **/
public class Student {
    private String Sno;
    private Integer age;
    private int socre;

    public Student() {
    }

    public Student(String sno, Integer age, int socre) {
        Sno = sno;
        this.age = age;
        this.socre = socre;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno='" + Sno + '\'' +
                ", age=" + age +
                ", socre=" + socre +
                '}';
    }
    public void playGame(){
        System.out.println("公有方法：打游戏");
    }
    private void sing(){
        System.out.println("私有方法：唱歌");
    }
    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getSocre() {
        return socre;
    }

    public void setSocre(int socre) {
        this.socre = socre;
    }
}

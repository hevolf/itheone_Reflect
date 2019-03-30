package com.itheone;

/**
 * @author caohaifengx@163.com 2019-03-18 17:18
 */
public class Student {
    private String name;
    private String age;


    public Student(){}

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

package com.itheone;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author caohaifengx@163.com 2019-03-18 17:20
 */
public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        //知道类名
        Class stu1 = Student.class;

        //知道对象
        Student stu = new Student();
        Class stu2 = stu.getClass();

        //类全路径 （有异常  ClassNotFoundException）
        Class stu3 = Class.forName("com.itheone.Student");

        Student styObj = (Student) stu1.newInstance();

//        Constructor[] c = stu1.getConstructors();
        Constructor[] c = stu1.getDeclaredConstructors();

        for (Constructor constructor : c) {
            System.out.println(constructor.getName());

        }
        //无参
        System.out.println(stu1.getConstructor(null).getName());
        //参数为 String.class
        System.out.println(stu1.getConstructor(String.class).getName());

        Field[] fields = stu1.getDeclaredFields();
        System.out.println("field:" + fields);
        for (Field field : fields) {
            System.out.println("field:" + field.getName());
        }

        //Method[] methods = stu1.getDeclaredMethods();//all methods
        Method[] methods = stu1.getMethods();//public methods

        for (Method method : methods) {
            System.out.println(method.getName());
        }



    }
}

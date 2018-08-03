package com.example.demo2;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* User: guojie
 * \* Date: 2018/8/2
 * \* Time: 8:59
 * \* Description:
 * \
 */
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        fun();
    }

    public static void fun() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class student = Class.forName("com.example.demo2.Student");

        Constructor constructor = student.getConstructor(String.class, Integer.class);

        Object guojie = constructor.newInstance("guojie", 15);

        Method method = student.getMethod("toString");


        Object toString = method.invoke(guojie);
        System.out.println(toString);



    }
}

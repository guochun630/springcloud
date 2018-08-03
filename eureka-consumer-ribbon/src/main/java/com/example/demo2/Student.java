package com.example.demo2;

/**
 * \* User: guojie
 * \* Date: 2018/8/2
 * \* Time: 8:55
 * \* Description:
 * \
 */
public class Student {

    private String name;

    private Integer age;

    public Student(){
        System.out.println("这是一个无参构造方法");
    }

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

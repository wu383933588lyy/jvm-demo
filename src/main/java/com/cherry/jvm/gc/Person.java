package com.cherry.jvm.gc;

/**
 * @Author WuRui
 * @ClassName Person
 * @Date 2020/11/4 16:12
 * @Version 1.0
 * @Description //TODO
 **/
public class Person {

    private String name;

    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

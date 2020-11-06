package com.cherry.jvm.cl;

import com.cherry.jvm.gc.Person;

/**
 * @Author WuRui
 * @ClassName TestClass
 * @Date 2020/11/5 14:41
 * @Version 1.0
 * @Description //TODO
 **/
public class TestClass {

    public static void main(String[] args) {
        Person person=new Person("san","11");
        System.out.println(person);
    }
}

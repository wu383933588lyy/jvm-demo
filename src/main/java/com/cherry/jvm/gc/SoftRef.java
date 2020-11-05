package com.cherry.jvm.gc;

import java.lang.ref.SoftReference;

/**
 * @Author WuRui
 * @ClassName SoftRef
 * @Date 2020/11/4 16:12
 * @Version 1.0
 * @Description //TODO
 **/
public class SoftRef {

    public static void main(String[] args) {
        SoftReference<Person> san = new SoftReference<>(new Person("san", "11"));
        Person person = san.get();
        System.out.println(person);
    }
}



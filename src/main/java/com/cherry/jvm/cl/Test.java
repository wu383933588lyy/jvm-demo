package com.cherry.jvm.cl;

/**
 * @Author WuRui
 * @ClassName Test
 * @Date 2020/10/27 11:39
 * @Version 1.0
 * @Description //TODO
 **/
public class Test {

    public static void main(String[] args) {
        ClassLoader loader = Test.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader);
            loader = loader.getParent();
        }
    }
}

package com.cherry.jvm.cl;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author WuRui
 * @ClassName CLoaderTest
 * @Date 2020/10/28 15:22
 * @Version 1.0
 * @Description //TODO 打断双亲委派
 **/
public class CLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        // 自定义类加载器
        ClassLoader loader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] bytes = new byte[is.available()];
                    is.read(bytes);
                    return defineClass(name, bytes, 0, bytes.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException();
                }
            }
        };

        String name = "com.cherry.jvm.cl.CLoaderTest";
        Object o1 = CLoaderTest.class.getClassLoader().loadClass(name).newInstance();
        System.out.println(o1.getClass().getClassLoader());

        Object o2 = loader.loadClass(name).newInstance();
        System.out.println(o2.getClass().getClassLoader());

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

        System.out.println(o1 instanceof CLoaderTest);
        System.out.println(o2 instanceof CLoaderTest);
    }
}

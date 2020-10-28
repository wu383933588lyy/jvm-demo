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
        // BootStrapClassLoader
        // 加载基本类 Object Class rt.jar
        System.out.println(System.getProperty("sun.boot.class.path"));
        // ExtClassLoader
        // 加载扩展类 ext 目录中
        System.out.println(System.getProperty("java.class.path"));
        // AppClassLoader
        // 加载工程路径中的 Class
        System.out.println(System.getProperty("java.ext.dirs"));
        ClassLoader loader = Test.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader);
            loader = loader.getParent();
        }
    }
}

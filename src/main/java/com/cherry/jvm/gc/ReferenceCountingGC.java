package com.cherry.jvm.gc;

/**
 * @Author WuRui
 * @ClassName ReferenceCountingGC
 * @Date 2020/11/4 15:40
 * @Version 1.0
 * @Description //TODO
 **/
public class ReferenceCountingGC {

    public Object instance = null;
    private static final int _1MB = 1024*1024;
    /**
     * 这个成员属性的唯一意义就是占点内存，以便能在GC日志中看清楚是否被回收过
     */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
        // 假设在这行发生GC，objA和objB是否能被回收？
        System.gc();
    }
}

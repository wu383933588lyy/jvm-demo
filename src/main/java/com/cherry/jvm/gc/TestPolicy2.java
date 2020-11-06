package com.cherry.jvm.gc;

/**
 * @Author WuRui
 * @ClassName TestPolicy2
 * @Date 2020/11/6 11:19
 * @Version 1.0
 * @Description //TODO
 **/
public class TestPolicy2 {

    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * -XX:PretenureSizeThreshold=3145728。默认值是0
     */
    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        // 直接分配在老年代中
        allocation = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }

}

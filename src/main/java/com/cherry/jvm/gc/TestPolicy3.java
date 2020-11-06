package com.cherry.jvm.gc;

/**
 * @Author WuRui
 * @ClassName TestPolicy3
 * @Date 2020/11/6 16:14
 * @Version 1.0
 * @Description //TODO
 **/
public class TestPolicy3 {

    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:TargetSurvivorRatio=90
     * -XX:+PrintGCDetails
     * -XX:MaxTenuringThreshold=1
     * -XX:+PrintTenuringDistribution
     * Jdk 1.7.0_46
     */
    public static void testTenuringThreshold() throws InterruptedException {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
        //什么时候进入老年代取决于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        System.out.println("=============");
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
        System.out.println("=============");
    }

    public static void main(String[] args) throws InterruptedException {
        testTenuringThreshold();
    }

}

package com.gyg;

/**
 * @auther 郭永钢
 * @data 2020/7/18 18:37
 * @desc: 查看堆内存溢出
 */

public class Cpu {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        //虚拟机试图使用的最大内存
        System.out.println("虚拟机试图使用的最大内存"+(Runtime.getRuntime().maxMemory()/(double)1024*1024));
        //java虚拟机的内存总量
        System.out.println("java虚拟机的内存总量"+Runtime.getRuntime().totalMemory()/(double)1024*1024);

    }
}

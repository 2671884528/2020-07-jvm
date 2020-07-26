package com.gyg;

/**
 * @auther 郭永钢
 * @data 2020/7/15 16:45
 * @desc: 类加载器
 * 6.栈管运行，堆管存储。八种基本的类型，对象的引用，实例方法
 */

public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.getClass().getClassLoader());

        System.out.println("****************************8");
        Main main = new Main();
        /*getClass()映射的一种方式从类加载器中获得模板*/
        System.out.println(main.getClass().getClassLoader());
        System.out.println(main.getClass().getClassLoader().getParent());
        System.out.println(main.getClass().getClassLoader().getParent().getParent());
//        Thread thread = new Thread("A");
//        thread.start();
//        thread.start();
    }
}

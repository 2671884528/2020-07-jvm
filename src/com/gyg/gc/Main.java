package com.gyg.gc;

import com.sun.imageio.stream.StreamFinalizer;

/**
 * @auther 郭永钢
 * @data 2020/7/26 10:15
 * @desc: 逃脱jc回收
 * finalize:当垃圾收集确定不再有对该对象的引用时，垃圾收集器在对象上调用该对象。
 * 一个子类覆盖了处理系统资源或执行其他清理的finalize方法。
 */

public class Main {

    public static  Main main = null;

    public void isAlive() {
        System.out.println("yes,im still alive");
    }

    @Override
    protected void finalize() throws Throwable {

        super.finalize();
        System.out.println("finalize is executed");
        Main.main = this;
    }

    public static void main(String[] args) throws InterruptedException {
        main = new Main();

        //第一次回收，可以实现自救
        main = null;
        System.gc();
        //finalized()方法优先级比较低，线程等待一段时间
        Thread.sleep(500);
        if (main != null) {
            main.isAlive();
        }else{
            System.out.println("main is dead");
        }
        //第二次拯救无效，因为finalize方法指挥执行一次
        main = null;
        System.gc();
        //finalized()方法优先级比较低，线程等待一段时间
        Thread.sleep(500);
        if (main != null) {
            main.isAlive();
        }else{
            System.out.println("main is dead");
        }

    }
}

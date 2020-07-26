package com.gyg.jmm;

/**
 * @auther 郭永钢
 * @data 2020/7/21 17:06
 * @desc: volatile加了这个关键字，其他线程修改了值，会通知其他的线程尽心修改。
 */
class NumberChange{
    volatile int change = 10;

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }
}

public class MyViolite {

    public static void main(String[] args) {
        NumberChange numberChange = new NumberChange();

        new Thread(() -> {
            try {
                Thread.sleep(3000);
                numberChange.setChange(100);
                System.out.println(Thread.currentThread().getName()+numberChange.getChange());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAA").start();
        while (numberChange.getChange()==10){

        }
        System.out.println(Thread.currentThread().getName()+numberChange.getChange());
    }
}

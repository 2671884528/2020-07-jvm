package com.gyg;

/**
 * @auther 郭永钢
 * @data 2020/7/18 17:44
 * @desc: 堆溢出
 */
class Addr{

    String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public void setA(String addr){
        addr="赣州";
    }
}

public class Oom {
    public static void main(String[] args) {
        Addr addr = new Addr();
        String str ="江西省";
        //传值
        addr.setAddr("九江市");
        System.out.println(str);
        //引用
        addr.setA(str);
        System.out.println(str);
    }
}

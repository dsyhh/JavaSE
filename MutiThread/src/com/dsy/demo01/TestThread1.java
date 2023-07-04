package com.dsy.demo01;

/**
 * @Author dsy
 * @Date 2023/7/4 15:23
 **/
public class TestThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在看代码--"+i);
        }
    }

    public static void main(String[] args)
    {
        //创建一个线程对象
        TestThread1 testThread1=new TestThread1();
        //调用start()方法开启线程
        testThread1.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程--"+i);
        }
    }
}

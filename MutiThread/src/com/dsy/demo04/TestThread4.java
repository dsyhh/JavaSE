package com.dsy.demo04;

/**
 * @Author dsy
 * @Date 2023/7/4 16:03
 **/
public class TestThread4 implements Runnable
{
    private int ticketNums = 10;

    @Override
    public void run()
    {
        while(true)
        {
            if(ticketNums <= 0)
            {
                break;
            }

//            try
//            {
//                Thread.sleep(200);
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums-- + "张票");
        }
    }

    public static void main(String[] args)
    {
        TestThread4 ticket = new TestThread4();

        new Thread(ticket, "小明").start();
        new Thread(ticket, "老师").start();
        new Thread(ticket, "黄牛党").start();
    }
}

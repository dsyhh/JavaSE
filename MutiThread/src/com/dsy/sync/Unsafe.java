package com.dsy.sync;

/**
 * @Author dsy
 * @Date 2023/7/4 17:32
 **/
public class Unsafe
{
    public static void main(String[] args)
    {
        Buytickets buytickets=new Buytickets();
        new Thread(buytickets,"小明").start();
        new Thread(buytickets,"老师").start();
        new Thread(buytickets,"黄牛党").start();
    }
}
class Buytickets implements Runnable
{
    private static int ticketnumbers=10;
    private boolean flag=true;
    @Override
    public void run()
    {
        while(flag)
        {
            try
            {
                buy();
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }

    }
    public void buy() throws InterruptedException
    {
        if(ticketnumbers<=0)
        {
            flag=false;
            return;
        }
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketnumbers--+"张票");
    }
}
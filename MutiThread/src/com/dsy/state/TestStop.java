package com.dsy.state;

/**
 * @Author dsy
 * @Date 2023/7/4 16:58
 **/
public class TestStop implements Runnable
{
    boolean flag = true;
    @Override
    public void run()
    {
        int i = 0;
        while(flag)
        {
            System.out.println("run....Thread" + i++);
        }
    }

    public void stop()
    {
        this.flag = false;
    }
    public static void main(String[] args)
    {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();
        for (int i = 0; i < 999; i++)
        {
            System.out.println("main " + i);
            if(i==900)
                testStop.stop();
        }
    }
}

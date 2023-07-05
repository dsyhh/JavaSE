package com.dsy.gaoji;

/**
 * @Author dsy
 * @Date 2023/7/5 08:46
 **/
public class TestPC
{
    public static void main(String[] args)
    {
        SynContainer container = new SynContainer();
        new productor(container).start();
        new consumer(container).start();
    }
}
class productor extends Thread
{
    SynContainer container;
    public productor(SynContainer container)
    {
        this.container = container;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("生产了第" + i + "只鸡");
            container.push(new Chicken(i));
        }
    }
}
class consumer extends Thread
{
    SynContainer container;
    public consumer(SynContainer container)
    {
        this.container = container;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("消费了第" + container.pop().id + "只鸡");
        }
    }
}
class Chicken
{
    int id;
    public Chicken(int id)
    {
        this.id = id;
    }
}
class SynContainer
{
    Chicken[] chickens = new Chicken[10];
    int count = 0;
    public synchronized void push(Chicken chicken)
    {
        while(count == chickens.length)
        {
            try
            {
                this.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        chickens[count] = chicken;
        count++;
        this.notifyAll();
    }
    public synchronized Chicken pop()
    {
        while(count == 0)
        {
            try
            {
                this.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        count--;
        Chicken chicken = chickens[count];
        this.notifyAll();
        return chicken;
    }

}
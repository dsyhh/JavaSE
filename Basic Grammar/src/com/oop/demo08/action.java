package com.oop.demo08;

/**
 * @Author dsy
 * @Date 2023/7/4 13:58
 **/
public abstract class action // abstract class can have abstract method and non-abstract method but cannot be instantiated (cannot create object)
{
    public abstract void dosth();
}
class Dog extends action // class Dog must implement abstract method dosth() in action (abstract method) or declare class Dog as abstract (abstract class)
{
    @Override
    public void dosth()
    {
        System.out.println("dog is running");
    }
}
package com.oop.demo09;

/**
 * @Author dsy
 * @Date 2023/7/4 14:09
 **/
public class UserServiceImpl implements UserService, TimeService{
    @Override
    public void add(String name)
    {
        System.out.println("add");
    }

    @Override
    public void delete(String name)
    {
        System.out.println("delete");
    }

    @Override
    public void update(String name)
    {
        System.out.println("update");
    }

    @Override
    public void query(String name)
    {
        System.out.println("query");
    }

    @Override
    public void timer()
    {
        System.out.println("timer");
    }
}

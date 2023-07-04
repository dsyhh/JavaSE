package com.oop.demo10;

/**
 * @Author dsy
 * @Date 2023/7/4 14:15
 **/
public class Outer {
    private int id=10;
    public void out()
    {
        System.out.println("out");
    }
    class Inner{
        public void in()
        {
            System.out.println("in");
        }
        public void getID()
        {
            System.out.println(id);
        }
    }

    public static void main(String[] args)
    {
       new AA(){
            @Override
            public void aa()
            {
                System.out.println("aa");
            }
        };
    }
}
interface AA{
    void aa();
}
package com.exception;

/**
 * @Author dsy
 * @Date 2023/7/4 14:38
 **/
public class Test {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try {//try里面放可能出现异常的代码
            System.out.println(a/b);
        }catch (Exception e)//catch里面放出现异常后的处理逻辑
        {
            System.out.println("catch");
            System.out.println(e.getMessage());
        }
        finally {//finally里面放一定会执行的代码
            System.out.println("finally");
        }
    }
}

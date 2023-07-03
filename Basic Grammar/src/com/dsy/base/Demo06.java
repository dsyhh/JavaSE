package com.dsy.base;

/**
 * @Author wwg
 * @Description TODO
 * @Date 2023/7/3 15:45
 **/
public class Demo06 {
    public static void main(String[] args) {
        int money = 1000_000_000;
        int years=20;
        int total=money*years;
        long total2= money*years;//over range before type trans
        System.out.println(total2);
    }
}

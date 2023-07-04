package com.dsy.array;

import java.lang.reflect.Array;

/**
 * @Author dsy
 * @Date 2023/7/4 09:27
 **/
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[2]=1;
        int[] b = a;
        a= new int[100];


        System.out.println(a[0]);
        System.out.println(b[2]);
    }
}

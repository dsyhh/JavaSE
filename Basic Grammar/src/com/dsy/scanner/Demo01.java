package com.dsy.scanner;

import java.util.Scanner;

/**
 * @Author dsy
 * @Date 2023/7/3 17:01
 **/
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("use hasNext:");
        if(scanner.hasNext())
        {
            String str= scanner.next();
            System.out.println("input is "+str);
        }
        scanner.close();
        if(scanner.hasNextLine())
        {
            String str= scanner.nextLine();
            System.out.println("input is "+str);

        }
        scanner.close();
    }
}

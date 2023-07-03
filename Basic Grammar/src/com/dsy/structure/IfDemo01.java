package com.dsy.structure;

import java.util.Scanner;

/**
 * @Author dsy
 * @Date 2023/7/3 17:29
 **/
public class IfDemo01 {
    public static void main(String[] args) {
        //test score
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();
        if(score==100)
        {
            System.out.println("A+");
        }
        else if (score < 100&&score >= 90)
        {
            System.out.println("A");
        }
        else if (score < 90&&score >= 80)
        {
            System.out.println("B");
        }
        else if(score<80&&score>=70)
        {
            System.out.println("C");
        }
        else if(score<70&&score>=60)
        {
            System.out.println("D");
        }
        else if(score<60&&score>=0)
        {
            System.out.println("E");
        }
        else
        {
            System.out.println("Invalid score");
        }

        switch (score/10)
        {
            case 10:
                System.out.println("A+");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }

        String name="dss";
        switch (name)//String can be used in switch since JDK 1.7 this is realized by using hashcode
        {
            case "dss":
                System.out.println("dss");
                break;
            case "dsy":
                System.out.println("dsy");
                break;
            default:
                System.out.println("Invalid name");
        }
    }
}

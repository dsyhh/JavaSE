package com.dsy.scanner;

/**
 * @Author dsy
 * @Date 2023/7/3 17:16
 **/
public class Demo02 {
    public static void main(String[] args) {
        //Input some numbers and calculate the sum and average value of them.If the input is not a number, the program will stop and print the sum and average value.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double sum = 0;//sum
        int m = 0;//number of input
        while (scanner.hasNextDouble()) {//if the input is a number
            double x = scanner.nextDouble();//get the number
            m = m + 1;//number of input + 1
            sum = sum + x;//sum + x
        }//if the input is not a number, the loop will stop
        System.out.println(m + " numbers in total, sum is " + sum);//print the sum
        System.out.println(m + " numbers in total, average value is " + sum / m);//print the average value
        scanner.close();//close the scanner
    }
}

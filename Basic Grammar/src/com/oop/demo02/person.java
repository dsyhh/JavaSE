package com.oop.demo02;

/**
 * @Author dsy
 * @Date 2023/7/4 10:58
 **/
public class person {
    String name;
    int age;

    public person(String name) {
        this.name = name;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }

    public person(int age) {
        this.age = age;
    }
}

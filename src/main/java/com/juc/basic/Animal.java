package com.juc.basic;


/**
 * @Description TODO
 * @ClassName：Animal :
 * @Package com.juc.basic
 * @anthor：wyang
 * @date：2020/4/9
 * @版本：V1.0
 */
public class Animal {

    int num = 10;
    static int age = 20;

    public void eat() {
        System.out.println("animal eating");
    }

    public static void sleep() {
        System.out.println("animal sleeping");
    }

    public void run() {
        System.out.println("animal running");
    }
}

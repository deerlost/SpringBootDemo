package com.juc.basic;


/**
 * @Description TODO
 * @ClassName：Cat :
 * @Package com.juc.basic
 * @anthor：wyang
 * @date：2020/4/9
 * @版本：V1.0
 */
public class Cat extends Animal {

    int num = 80;

    static int age = 90;

    String name = "tomCat";

    @Override
    public void eat() {
        System.out.println("cat eating");
    }

    public static void sleep() {
        System.out.println("cat sleeping");
    }

    public void catchMouse(){
        System.out.println("cat catching mouse");
    }


}

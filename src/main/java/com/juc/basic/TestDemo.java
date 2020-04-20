package com.juc.basic;


/**
 * @Description TODO
 * @ClassName：TestDemo :
 * @Package com.juc.basic
 * @anthor：wyang
 * @date：2020/4/9
 * @版本：V1.0
 */
public class TestDemo {
    public static void main(String[] args) {

        /**
         * 1. 应用程序不必为每一个派生类编写功能调用，只需要对抽象基类进行处理即可。大大提高程序的可复用性。//继承
         * 2. 派生类的功能可以被基类的方法或引用变量所调用，这叫向后兼容，可以提高可扩充性和可维护性。 //多态的真正作用，
         */
        Animal am = new Cat();

        System.out.println(am.num);
        System.out.println(((Cat) am).name);
    }
}

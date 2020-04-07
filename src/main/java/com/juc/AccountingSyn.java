package com.juc;


/**
 * @Description TODO
 * @ClassName：AccountingSyn :
 * @Package com.juc
 * @anthor：wyang
 * @date：2020/3/31
 * @版本：V1.0
 */
public class AccountingSyn implements Runnable {


    static int num = 0;

    private int max = 1000;

    public void increment() {
        num++;
        System.out.println(Thread.currentThread().getName() + "\t" + num);
    }

    public void decrement() {
        max--;
        System.out.println(Thread.currentThread().getName() + "\t" + max);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            increment();
        }
    }
}


class Main {
    public static void main(String[] args) {

        AccountingSyn syn = new AccountingSyn();


        new Thread(syn, "A").start();

        new Thread(syn, "B").start();

       /* new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                syn.decrement();
            }
        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                syn.decrement();
            }
        }, "D").start();
*/



    }
}
package com.juc;


/**
 * @Description TODO
 * @ClassName：ProducerConsumer :
 * @Package com.juc
 * @anthor：wyang
 * @date：2020/3/31
 * @版本：V1.0
 */
public class ProducerConsumer {

    public static void main(String[] args) {


        Data data = new Data();

        new Thread(()->{
            for (int i = 0; i <= 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i <= 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
    }
}

class Data {
    private int number = 0;


    public synchronized void increment() throws InterruptedException {

        if (number != 0) {

            this.wait();
        }
        number++;

        System.out.println(Thread.currentThread().getName() + "\t" + number);

        this.notifyAll();

    }

    public synchronized void decrement() throws InterruptedException {

        if (number == 0) {

            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        this.notifyAll();

    }


}
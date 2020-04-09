package com.juc;


import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description TODO
 * @ClassName：TestReentrantLock :
 * @Package com.juc
 * @anthor：wyang
 * @date：2020/4/8
 * @版本：V1.0
 */
public class TestReentrantLock {

    public static void main(String[] args) {

        TestReentrantLock t = new TestReentrantLock();

        new Thread(() -> {
            t.insert(Thread.currentThread());
        }, "A").start();
        new Thread(() -> {
            t.insert(Thread.currentThread());
        }, "B").start();

        System.out.println(t.arrayList.toString());
    }

    ArrayList<Integer> arrayList = new ArrayList<>();
    Lock lock = new ReentrantLock();

    public void insert(Thread thread) {


        if (lock.tryLock()) {

            try {
                lock.lock();

                System.out.println(thread.getName() + "得到了锁");

                for (int i = 0; i < 6; i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println(thread.getName() + "释放了锁");
            }

        } else {
            System.out.println(thread.getName() + "获取锁失败");
        }


    }

}

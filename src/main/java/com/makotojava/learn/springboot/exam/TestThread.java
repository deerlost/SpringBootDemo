package com.makotojava.learn.springboot.exam;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @ClassName：TestThread :
 * @Package com.makotojava.learn.springboot.exam
 * @anthor：wyang
 * @date：2019/6/28
 * @版本：V1.0
 */
public class TestThread {

    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
    public static ThreadLocal<User> threadLocalUser = new ThreadLocal<User>();

    public static void main(String args[]) throws InterruptedException ,Exception{

        Date day1 = new Date();

        Date day2 = new Date("2019/06/30");

        Date day3 = new Date(2019, 06, 30);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(day1.toString());
        System.out.println(day2.toString());
        System.out.println(day3.toString());
        System.out.println(dateFormat.format(day1));
        System.out.println(dateFormat.format(day2));
        System.out.println(dateFormat.format(day3));

        Integer x = 1;
        Integer y = 1;

        if(y==x){
            System.out.println("Integer == select" );
        }else if(x.equals(y)){
            System.out.println("Integer equals select");
        }



        threadLocal.set(100);    // 保存值
        System.out.println(threadLocal.get());    // 获取值

        User user = new User();
        user.setName("JoonWhee");
        user.setAge(25);
        threadLocalUser.set(user);    // 保存值
        System.out.println(threadLocalUser.get());    // 获取值


        Thread threadOne = new ThreadOne(); // 线程1
        Thread threadTo = new ThreadTo(); // 线程2
        threadTo.start(); // 线程2开始执行
        TimeUnit.MILLISECONDS.sleep(100); // 睡眠, 以等待线程2执行完毕
        threadOne.start(); // 线程1开始执行
        TimeUnit.MILLISECONDS.sleep(100); // 睡眠, 以等待线程1执行完毕
        // 此时线程1和线程2都已经设置过值, 此处输出为空, 说明子线程与父线程之间也是互不影响的
        System.out.println("main: " + threadLocal.get());

        int a = 1;
        System.out.println(a);
        changeValue(a);
        System.out.println(a);
        User u = new User("cc");
        u.instroduced();
        u.setName("aa");
        u.instroduced();


    }

    /**
     * 线程1
     *
     * @author joonwhee
     * @date 2018年2月24日
     */
    private static class ThreadOne extends Thread {
        @Override
        public void run() {
            // 此时线程2已经调用过set(456), 此处输出为空, 说明线程之间是互不影响的
            System.out.println("ThreadOne: " + threadLocal.get());
            threadLocal.set(123);
            System.out.println("ThreadOne: " + threadLocal.get());
        }
    }

    /**
     * 线程2
     *
     * @author joonwhee
     * @date 2018年2月24日
     */
    private static class ThreadTo extends Thread {
        @Override
        public void run() {
            System.out.println();
            threadLocal.set(456); // 设置当前ThreadLocal的值为456
            System.out.println("ThreadTo: " + threadLocal.get());
        }
    }


    static class User {
        String name;
        Integer age;

        public User() {
        }

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User [name=" + name + ", age=" + age + "]";
        }

        void instroduced() {
            System.out.println(this.name);
        }
    }

    static void changeValue(int x) {
        x = x + 1;
        System.out.println(x);
    }

}


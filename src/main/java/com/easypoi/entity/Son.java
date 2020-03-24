package com.easypoi.entity;


/**
 * @Description TODO
 * @ClassName：Son :
 * @Package com.easypoi.entity
 * @anthor：wyang
 * @date：2020/3/20
 * @版本：V1.0
 */
public class Son extends Father {
    static {
        System.out.println("儿子在静态代码块");
    }

    public Son() {
        System.out.println("我是儿子~");
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("爸爸的岁数:" + Son.factor);  //入口
    }
}
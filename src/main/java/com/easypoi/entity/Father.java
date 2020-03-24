package com.easypoi.entity;


/**
 * @Description TODO
 * @ClassName：Father :
 * @Package com.easypoi.entity
 * @anthor：wyang
 * @date：2020/3/20
 * @版本：V1.0
 */
public class Father extends GrandPa {
    static {
        System.out.println("爸爸的静态代码块");
    }


    public static int factor = 25;

    public Father() {
        System.out.println("我是爸爸~");
    }
}

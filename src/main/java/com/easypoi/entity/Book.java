package com.easypoi.entity;


/**
 * @Description TODO
 * @ClassName：Book :
 * @Package com.easypoi.entity
 * @anthor：wyang
 * @date：2020/3/24
 * @版本：V1.0
 */
public class Book {

    public static void main(String[] args)
    {
        staticFunction();
    }



    static
    {
        System.out.println("书的静态代码块");
    }
    static Book book =new Book();
    Book()
    {
        System.out.println("书的构造方法");
        System.out.println("price=" + price +",amount=" + amount);
    }
    {
        System.out.println("书的普通代码块");
    }




    int price = 110;

    static int amount = 112;

    public static void staticFunction(){
        System.out.println("书的静态方法");
    }


}

package com.makotojava.learn.springboot.model;



/**
 * @Description TODO
 * @ClassName：testEnum :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2019/7/10
 * @版本：V1.0
 */
public class testEnum {
    public static void main(String[] args) {
        EnumStrategy strategy = EnumStrategy.valueOf("FAST");
        strategy.run();
    }

    public static void useEnum(String param){
        EnumStrategy strategy = EnumStrategy.valueOf(param);
        strategy.run();
    }
}

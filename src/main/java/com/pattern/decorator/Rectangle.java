package com.pattern.decorator;


/**
 * @Description TODO
 * @ClassName：Rectangle :
 * @Package com.pattern.decorator
 * @anthor：wyang
 * @date：2020/4/20
 * @版本：V1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

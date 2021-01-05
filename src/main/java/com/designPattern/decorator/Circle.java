package com.designPattern.decorator;


/**
 * @Description TODO
 * @ClassName：Circle :
 * @Package com.pattern.decorator
 * @anthor：wyang
 * @date：2020/4/20
 * @版本：V1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

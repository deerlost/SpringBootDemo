package com.designPattern.decorator.impl;


import com.designPattern.decorator.Shape;

/**
 * @Description TODO
 *
 * 抽象类作修饰类 引用和继承Component
 * @ClassName：ShapeDecorator :
 * @Package com.pattern.decorator
 * @anthor：wyang
 * @date：2020/4/20
 * @版本：V1.0
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}

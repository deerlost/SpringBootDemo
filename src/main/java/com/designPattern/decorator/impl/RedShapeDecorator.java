package com.designPattern.decorator.impl;


import com.designPattern.decorator.Shape;

/**
 * @Description TODO
 * @ClassName：RedShapeDecorator :
 * @Package com.pattern.decorator
 * @anthor：wyang
 * @date：2020/4/20
 * @版本：V1.0
 */
public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

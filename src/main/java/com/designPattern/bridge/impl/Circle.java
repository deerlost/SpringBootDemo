package com.designPattern.bridge.impl;


import com.designPattern.bridge.DrawAPI;
import com.designPattern.bridge.Shape;

/**
 * @Description
 * @Package com.designPattern.bridge.impl
 * @anthor：wyang
 * @date：2021/1/5
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}

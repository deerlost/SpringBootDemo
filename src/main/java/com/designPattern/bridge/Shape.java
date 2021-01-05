package com.designPattern.bridge;


/**
 * @Description
 * @Package com.designPattern.bridge
 * @anthor：wyang
 * @date：2021/1/5
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}

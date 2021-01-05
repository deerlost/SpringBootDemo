package com.designPattern.bridge.impl;


import com.designPattern.bridge.DrawAPI;

/**
 * @Description
 * @Package com.designPattern.bridge.impl
 * @anthor：wyang
 * @date：2021/1/5
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}

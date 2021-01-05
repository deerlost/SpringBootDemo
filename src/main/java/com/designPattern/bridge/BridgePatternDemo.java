package com.designPattern.bridge;


import com.designPattern.bridge.impl.Circle;
import com.designPattern.bridge.impl.GreenCircle;
import com.designPattern.bridge.impl.RedCircle;

/**
 * @Description
 * @Package com.designPattern.bridge
 * @anthor：wyang
 * @date：2021/1/5
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}

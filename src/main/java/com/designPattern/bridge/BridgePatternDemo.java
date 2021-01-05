package com.designPattern.bridge;


import com.designPattern.bridge.impl.GreenCircle;
import com.designPattern.bridge.impl.RedCircle;

/**
 * @Description 桥接模式
 * 意图：将抽象部分与实现部分分离，使它们都可以独立的变化。
 * <p>
 * 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 * <p>
 * 何时使用：实现系统可能有多个角度分类，每一种角度都可能变化。
 * <p>
 * 如何解决：把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
 * <p>
 * 关键代码：抽象类依赖实现类。
 * 优点： 1、抽象和实现的分离。 2、优秀的扩展能力。 3、实现细节对客户透明。
 * <p>
 * 缺点：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
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

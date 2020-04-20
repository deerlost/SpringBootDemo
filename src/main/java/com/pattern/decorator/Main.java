package com.pattern.decorator;


/**
 * @Description TODO 赋予行为
 *
 * 装饰器模式
 * 目的:动态地给一个对象添加额外的职责，比子类更为灵活
 * 解决问题：一般的，为了扩展一个类经常使用继承方式，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会膨胀
 * 优点：装饰类与被装饰类可以独立发展，不会互相耦合
 * 关键代码：1.Component类充当抽象角色，不应该具体实现 2.修饰类引用和继承Component类，具体扩展类重写父类方法
 * @ClassName：Main :
 * @Package com.pattern.decorator
 * @anthor：wyang
 * @date：2020/4/20
 * @版本：V1.0
 */
public class Main {

    public static void main(String[] args) {
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redCircle.draw();
        redCircle.draw();
    }
}

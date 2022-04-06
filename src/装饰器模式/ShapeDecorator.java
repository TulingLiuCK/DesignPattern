package 装饰器模式;

import 装饰器模式.dao.Shape;

/***
 #Create by LCK on 2022/4/4
 # 用法:  创建实现Shape接口的抽象装饰类
 */
public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}

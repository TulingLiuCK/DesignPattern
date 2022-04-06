package 抽象工厂;

import 抽象工厂.Factory.AbstractFactory;
import 抽象工厂.Factory.ColorFactory;
import 抽象工厂.Factory.FactoryProducer;
import 抽象工厂.dao.Color;
import 抽象工厂.dao.Shape;

/***
 #Create by LCK on 2022/2/12
 # 用法:测试
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();

    }
}

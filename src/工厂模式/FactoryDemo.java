package 工厂模式;

import 工厂模式.dao.shape;
import 工厂模式.factary.ShapeFactory;

/***
 #Create by LCK on 2022/2/12
 # 用法:
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}

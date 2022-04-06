package 抽象工厂.Factory;

import 抽象工厂.dao.Color;
import 抽象工厂.dao.Shape;
import 抽象工厂.daoimpl.Circle;
import 抽象工厂.daoimpl.Rectangle;
import 抽象工厂.daoimpl.Square;

/***
 #Create by LCK on 2022/2/12
 # 用法:
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null){
            return null;
        }
        if (shape.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}

package 抽象工厂.Factory;

import 抽象工厂.dao.Color;
import 抽象工厂.dao.Shape;
import 抽象工厂.daoimpl.Blue;
import 抽象工厂.daoimpl.Green;
import 抽象工厂.daoimpl.Red;

/***
 #Create by LCK on 2022/2/12
 # 用法:
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (color == null){
            return null;
        }
        if (color.equalsIgnoreCase("red")){
            return new Red();
        }else if (color.equalsIgnoreCase("blue")){
            return new Blue();
        }else if (color.equalsIgnoreCase("Green")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}

package 抽象工厂.Factory;

import 抽象工厂.dao.Color;
import 抽象工厂.dao.Shape;

/***
 #Create by LCK on 2022/2/12
 # 用法:
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}

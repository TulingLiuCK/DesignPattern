package 桥接模式;

import 桥接模式.dao.Shape;
import 桥接模式.dao.impl.Circle;
import 桥接模式.dao.impl.GreenCircle;
import 桥接模式.dao.impl.RedCircle;

/***
 #Create by LCK on 2022/3/31
 # 用法:
 */
public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
        Shape greenCircle = new Circle(new GreenCircle(),100,100,10);

        redCircle.draw();
        greenCircle.draw();
    }
}

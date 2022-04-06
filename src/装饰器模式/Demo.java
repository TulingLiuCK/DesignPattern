package 装饰器模式;

import 装饰器模式.dao.Shape;
import 装饰器模式.dao.impl.Circle;
import 装饰器模式.dao.impl.Rectangle;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Demo {
    public static void main(String[] args) {
        Shape circlr = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circlr.draw();

        System.out.println("\bCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}

package 原型模式;

import 原型模式.dao.Shape;

/***
 #Create by LCK on 2022/2/13
 # 用法:
 */
public class Demo {
    public static void main(String[] args) {
        Shape shape = new Shape("1","tom");
        Shape shape1 = (Shape) shape.clone();
        Shape shape2 = (Shape) shape.clone();
        Shape shape3 = (Shape) shape.clone();
        System.out.println("shae1:"+shape1);
        System.out.println("shape2"+shape2);
        System.out.println("shape3"+shape3);


    }
}

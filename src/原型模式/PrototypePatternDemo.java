package 原型模式;

import 原型模式.dao.Shape;

/***
 #Create by LCK on 2022/2/13
 # 用法:
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape:"+cloneShape.getType());
        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape:"+cloneShape2.getType());
        Shape shape = ShapeCache.getShape("3");
        System.out.println("shape:"+shape.getType());
    }
}

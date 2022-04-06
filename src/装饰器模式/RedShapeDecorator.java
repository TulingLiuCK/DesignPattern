package 装饰器模式;

import 装饰器模式.dao.Shape;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color:Red");
    }
}

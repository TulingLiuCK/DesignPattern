package 桥接模式.dao.impl;

import 桥接模式.dao.DrawApi;
import 桥接模式.dao.Shape;

/***
 #Create by LCK on 2022/3/31
 # 用法:
 */
public class Circle extends Shape {
    private int x,y,radius;


    public Circle(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCirlce(radius,x,y);
    }
}

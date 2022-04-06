package 装饰器模式.dao.impl;

import 装饰器模式.dao.Shape;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape:Circle");
    }
}

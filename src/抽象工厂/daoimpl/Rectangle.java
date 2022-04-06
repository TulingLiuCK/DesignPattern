package 抽象工厂.daoimpl;

import 抽象工厂.dao.Shape;

/***
 #Create by LCK on 2022/2/12
 # 用法:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}

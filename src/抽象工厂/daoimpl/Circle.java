package 抽象工厂.daoimpl;

import 抽象工厂.dao.Shape;

/***
 #Create by LCK on 2022/2/12
 # 用法:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}

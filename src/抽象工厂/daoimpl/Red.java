package 抽象工厂.daoimpl;

import 抽象工厂.dao.Color;

/***
 #Create by LCK on 2022/2/12
 # 用法:
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill()method");
    }
}

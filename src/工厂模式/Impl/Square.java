package 工厂模式.Impl;

import 工厂模式.dao.shape;

/***
 #Create by LCK on 2022/2/12
 # 用法:
 */
public class Square  implements shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}

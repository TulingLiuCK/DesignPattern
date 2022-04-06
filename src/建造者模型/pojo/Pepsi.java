package 建造者模型.pojo;

import 建造者模型.daoimpl.ColdDrink;

/***
 #Create by LCK on 2022/2/14
 # 用法: 百事的实体类
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}

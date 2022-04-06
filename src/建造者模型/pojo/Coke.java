package 建造者模型.pojo;

import 建造者模型.daoimpl.ColdDrink;

/***
 #Create by LCK on 2022/2/14
 # 用法: 可乐的实体类
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}

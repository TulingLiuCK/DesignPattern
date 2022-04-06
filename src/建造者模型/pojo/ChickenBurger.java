package 建造者模型.pojo;

import 建造者模型.daoimpl.Burger;

/***
 #Create by LCK on 2022/2/14
 # 用法:鸡肉汉堡的实体类
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

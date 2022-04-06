package 建造者模型.pojo;

import 建造者模型.daoimpl.Burger;

/***
 #Create by LCK on 2022/2/14
 # 用法:素汉堡实体类
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

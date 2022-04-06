package 建造者模型.daoimpl;

import 建造者模型.dao.Item;
import 建造者模型.dao.Packing;

/***
 #Create by LCK on 2022/2/14
 # 用法:食物条目的接口实现类
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

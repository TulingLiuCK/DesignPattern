package 建造者模型.daoimpl;

import 建造者模型.dao.Item;
import 建造者模型.dao.Packing;

/***
 #Create by LCK on 2022/2/14
 # 用法:
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

package 建造者模型.daoimpl;

import 建造者模型.dao.Packing;

/***
 #Create by LCK on 2022/2/14
 # 用法:饮料的包装实现类
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}

package 建造者模型.dao;

/***
 #Create by LCK on 2022/2/14
 # 用法: 表示食物条目的接口
 */
public interface Item {
    public String name();
    public  Packing packing();
    public float price();
}

package 观察者模型.dao;

/***
 #Create by LCK on 2022/4/4
 # 用法:观察者接口
 */
public interface Observer {
    //一旦发现别人有动作，自己也要行动起来
    public void update(String context);
}

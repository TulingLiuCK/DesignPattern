package 观察者模型;

import 观察者模型.dao.Observer;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class LiuSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("六四，观察到韩非子活动，开始动作了");
        this.happy(context);
        System.out.println("六四太高兴了");
    }
    public void happy(String context){
        System.out.println("六四 因为："+context+"所以很快乐");
    }
}

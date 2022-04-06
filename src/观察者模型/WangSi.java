package 观察者模型;

import 观察者模型.dao.Observer;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class WangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了");
        this.cry(context);
        System.out.println("王斯：酷似了");
    }
    public void cry(String context){
        System.out.println("王④：因为："+context+",---所有我很悲伤");
    }
}

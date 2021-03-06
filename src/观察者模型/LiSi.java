package 观察者模型;

import 观察者模型.dao.Observer;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了");
        this.reportToQinShiHuang(context);
        System.out.println("李斯汇报完毕\n");
    }
    public void reportToQinShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板！韩非子有活动了---》"+reportContext);
    }
}

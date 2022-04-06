package 观察者模型;

import 观察者模型.dao.Observer;
import 观察者模型.impl.HanFeiZi;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Client {
    public static void main(String[] args) {
        Observer lisi = new LiSi();
        Observer wangsi = new WangSi();
        Observer liusi = new LiuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);
        hanFeiZi.addObserver(liusi);


        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}

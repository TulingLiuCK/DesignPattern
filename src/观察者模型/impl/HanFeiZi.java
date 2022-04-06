package 观察者模型.impl;

import 观察者模型.dao.IHanFeiZi;
import 观察者模型.dao.Observable;
import 观察者模型.dao.Observer;

import java.util.ArrayList;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class HanFeiZi implements IHanFeiZi, Observable {
    //定义变长数组，存放所有的观察者
    private ArrayList<Observer> observerArrayList = new ArrayList<>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭");
        this.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐");
        this.notifyObservers("韩非子在娱乐");
    }


    @Override
    public void addObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerArrayList) {
            observer.update(context);
        }
    }
}

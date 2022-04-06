package 观察者模型.dao;

/***
 #Create by LCK on 2022/4/4
 # 用法: 被观察者接口
 */
public interface Observable {
    //增加一个观察者
    public void addObserver(Observer observer);
    //删除一个观察者
    public void deleteObserver(Observer observer);
    //通知观看者
    public void notifyObservers(String context);
}

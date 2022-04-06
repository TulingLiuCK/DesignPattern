package 策略模式.iml;

import 策略模式.Strategy;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class ConcreteStrategy2 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}

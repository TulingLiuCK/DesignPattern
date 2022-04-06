package 策略模式;

import 策略模式.iml.ConcreteStrategy1;
import 策略模式.iml.ConcreteStrategy2;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy2();
        Strategy strategy1 = new ConcreteStrategy1();
        Context context = new Context(strategy);
        Context context1 = new Context(strategy1);
        context.doAnything();
        context1.doAnything();
    }
}

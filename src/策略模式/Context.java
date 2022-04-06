package 策略模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void doAnything(){
        this.strategy.doSomething();
    }
}

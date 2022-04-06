package 单例模式.type6;

/***
 #Create by LCK on 2022/2/12
 # 用法:静态内部类
 */
public class SingletonTets06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
class Singleton{
    public Singleton() {
    }
    private static class  SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return  SingletonInstance.INSTANCE;
    }
}

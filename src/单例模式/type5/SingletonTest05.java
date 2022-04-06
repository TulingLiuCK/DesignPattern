package 单例模式.type5;

/***
 #Create by LCK on 2022/2/12
 # 用法: 单例双重检查
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }

}
class Singleton{
    private static volatile Singleton singleton;

    public Singleton() {
    }
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

package 单例模式.type3;

/***
 #Create by LCK on 2022/2/12
 # 用法:懒汉式，线程不安全，在调用的时候才创建
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1 == singleton);

    }
}
class Singleton{
    private static Singleton instance;

    public Singleton() {
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

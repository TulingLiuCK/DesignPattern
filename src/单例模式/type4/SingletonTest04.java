package 单例模式.type4;

/***
 #Create by LCK on 2022/2/12
 # 用法:懒汉式 ：线程安全
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2 == instance1);
    }

}
class  Singleton{
    private static  Singleton instance;

    public Singleton() {
    }
    public static  synchronized  Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

package 单例模式.type2;

/***
 #Create by LCK on 2022/2/12
 # 用法:静态代码块饿汉式
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1); // true
        System.out.println("instance.hashCode()"+instance.hashCode());
        System.out.println("instance1.hashCode()"+instance1.hashCode());
    }
}

//饿汉式（静态变量）
class Singleton{
    //构造器私有化、外部能new
    private Singleton(){
    }
    //本类的内部创建对象实例
    private  static  Singleton instance;

    static {  //在静态代码块中，创建单例对象
        instance = new Singleton();
    }
    //提供共有的静态方法，返回实例对象
    public static  Singleton getInstance(){
        return instance;
    }
}

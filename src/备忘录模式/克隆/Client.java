package 备忘录模式.克隆;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Originator originator = new Originator();
        originator.setState("初始状态");
        System.out.println("初始状态是："+originator.getState());

        originator.createMemento();

        //修改状态
        originator.setState("修改后的状态");
        System.out.println("修改后的状态是："+originator.getState());
        //恢复原有的状态
        originator.restorememento();
        System.out.println("恢复后的状态："+originator.getState());

    }
}

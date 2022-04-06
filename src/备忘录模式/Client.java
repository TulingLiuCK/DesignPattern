package 备忘录模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Creataker creataker = new Creataker();
        boy.setState("心情很棒！");
        System.out.println("男孩现在的状态");
        System.out.println(boy.getState());
        //记录现在的状态
        creataker.setMemento(boy.createMemento());
        //改变状态
        boy.changeState();
        System.out.println("之后的状态");
        System.out.println(boy.getState());
        //恢复之后
        boy.resoterMemento(creataker.getMemento());
        System.out.println("恢复之后的状态");
        System.out.println(boy.getState());

    }
}

package 装饰器模式.xinde;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Demo {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecorator1(component);
        component.operate();
    }
}

package 装饰器模式.xinde;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    private void method1(){
        System.out.println("method1 修饰");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}

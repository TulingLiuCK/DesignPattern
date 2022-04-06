package 装饰器模式.xinde;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public abstract class Decorator extends Component{
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}

package 备忘录模式.克隆;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Originator implements Cloneable{
    private Originator backup;
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建一个备忘录
    public void createMemento() throws CloneNotSupportedException {
        this.backup = (Originator) this.clone();
    }

    //恢复一个备忘录
    public void restorememento(){
        this.setState(this.backup.getState());
    }
//    @Override
//    protected Originator clone() throws CloneNotSupportedException {
//        return (Originator) super.clone();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

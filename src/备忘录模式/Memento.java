package 备忘录模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

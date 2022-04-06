package 备忘录模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Boy {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void changeState(){
        this.state =  "心情可能不好";
    }
    //保留备份
    public Memento createMemento(){
        return new Memento(this.state);
    }
    public void resoterMemento(Memento memento){
        this.setState(memento.getState());
    }
}

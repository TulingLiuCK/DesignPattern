package 原型模式.dao;

/***
 #Create by LCK on 2022/2/13
 # 用法:
 */
public class Shape implements Cloneable{
    private String id;
    protected String type;

    public String getType() {
        return type;
    }

    public Shape() {
    }

    public Shape(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    //实现克隆操作，继承Cloneable 重写clone（），
    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;

    }
}

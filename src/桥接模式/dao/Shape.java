package 桥接模式.dao;

/***
 #Create by LCK on 2022/3/31
 # 用法:
 */
public abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();
}

package 责任链模式;

import 责任链模式.dao.IWomen;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public abstract class Handler {
    public final static int FATHER_LEVER_REQUEST = 1;
    public final static int HUSBAND_LEVER_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    //能处理的级别
    private int level = 0;
    //责任传递，下一个责任人是谁
    private Handler nextHandler;
    //每个类都要说明一下自己能处理哪些请求
    public Handler(int level){
        this.level = level;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //一个女性（女儿，妻子或者母亲）要求矿界， 你要处理整个请求
    public final void HandlerMessage(IWomen women){
        if (women.getType() == this.level){
            this.response(women);
        }else {
            if (this.nextHandler != null){
                this.nextHandler.HandlerMessage(women);
            }else {
                System.out.println("没地方请示了，按不同意处理 \n");
            }
        }

    }
    protected abstract void response(IWomen women);


}

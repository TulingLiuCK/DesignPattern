package 责任链模式.dao.impl;

import 责任链模式.dao.IWomen;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class Women implements IWomen {
    private int type = 0;
    private String request="";




    public Women(int type, String request) {
        this.type = type;
        switch (this.type){
            case 1:
                this.request = "女儿的请求是："+request;
                break;
            case 2:
                this.request= "妻子的请求是："+request;
                break;
            case 3:
                this.request="母亲的请求是："+request;
        }
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}

package 责任链模式;

import 责任链模式.dao.IWomen;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class Son extends Handler{
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("母亲向儿子请求");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}

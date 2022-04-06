package 责任链模式;

import 责任链模式.dao.IWomen;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class Husband extends Handler{
    public Husband() {
        super(Handler.HUSBAND_LEVER_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("母亲向丈夫请示");
        System.out.println(women.getRequest());
        System.out.println("丈夫的回答是：同意\n");
    }
}

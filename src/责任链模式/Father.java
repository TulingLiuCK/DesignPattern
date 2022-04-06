package 责任链模式;

import 责任链模式.dao.IWomen;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class Father extends Handler {
    public Father() {
        super(Handler.FATHER_LEVER_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("女儿向父亲请示");
        System.out.println(women.getRequest());
        System.out.println("父亲答复：同意\n");
    }
}

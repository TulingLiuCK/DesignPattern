package 访问者模式;

import 访问者模式.dao.dao.Role;
import 访问者模式.dao.impl.KungFuRole;

/***
 #Create by LCK on 2022/4/5
 # 用法:
 */
public class Client {
    public static void main(String[] args) {
        AbsActor absActor = new OldActor();
        Role role = new KungFuRole();
        absActor.act(role);
        absActor.act(new KungFuRole());
    }
}

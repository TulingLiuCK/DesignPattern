package 访问者模式;

import 访问者模式.dao.dao.Role;
import 访问者模式.dao.impl.KungFuRole;

/***
 #Create by LCK on 2022/4/5
 # 用法:
 */
public abstract class AbsActor {
    public void act(Role role){
        System.out.println("演员可以扮演任何角色");
    }
    public void act(KungFuRole role){
        System.out.println("演员可以扮演功夫角色");
    }
}

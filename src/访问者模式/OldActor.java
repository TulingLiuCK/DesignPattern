package 访问者模式;

import 访问者模式.dao.impl.KungFuRole;

/***
 #Create by LCK on 2022/4/5
 # 用法:
 */
public class OldActor extends AbsActor{
    @Override
    public void act(KungFuRole role) {
        System.out.println("年龄大了，不能演功夫角色");
    }
}

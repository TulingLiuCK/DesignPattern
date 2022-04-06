package 访问者模式;

import 访问者模式.dao.impl.KungFuRole;

/***
 #Create by LCK on 2022/4/5
 # 用法:
 */
public class YoungAcotr extends AbsActor{


    @Override
    public void act(KungFuRole role) {
        System.out.println("最喜欢烟功夫角色");
    }
}

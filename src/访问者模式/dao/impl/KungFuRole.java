package 访问者模式.dao.impl;

import 访问者模式.AbsActor;
import 访问者模式.dao.dao.Role;

/***
 #Create by LCK on 2022/4/5
 # 用法:
 */
public class KungFuRole implements Role {
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}

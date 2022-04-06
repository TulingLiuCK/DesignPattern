package 访问者模式.dao.dao;

import 访问者模式.AbsActor;

/***
 #Create by LCK on 2022/4/5
 # 用法:
 */
public interface Role {
    public void accept(AbsActor actor);
}

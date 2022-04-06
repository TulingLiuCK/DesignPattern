package 桥接模式.dao.impl;

import 桥接模式.dao.DrawApi;

/***
 #Create by LCK on 2022/3/31
 # 用法:
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCirlce(int redius, int x, int y) {
        System.out.println("Drawing Circle color:red,redius:"+redius+",x:"+x+",y:"+y);
    }
}

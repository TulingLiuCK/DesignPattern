package 代理模式;

import 代理模式.impl.GamePlayer;
import 代理模式.动态代理.GamePlayIH;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Date;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class Client
{
    public static void main(String[] args) {
//        IGamePlayer player = new GamePlayer("张三");
//        IGamePlayer proxy = player.getProxy();
//        System.out.println("开始时间："+new Date());
//        player.login("zhangsan", "password");
//        player.killBoss();
//        player.upgrade();
//        System.out.println("结束时间："+new Date());

        //动态代理
//        IGamePlayer player = new GamePlayer("李四");
//        InvocationHandler handler = new GamePlayIH(player);
//        System.out.println("开始时间："+new Date());
//        ClassLoader cl = player.getClass().getClassLoader();
//
//        //动态产生一个代理者
//        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);
//        proxy.login("listi", "password");
//        proxy.killBoss();
//        proxy.upgrade();
//        System.out.println("结束时间："+new Date());
        IGamePlayer player = new GamePlayer("李四");
        GamePlayIH gamePlayIH = new GamePlayIH();
        gamePlayIH.setTarget(player);
        IGamePlayer proxy = (IGamePlayer) gamePlayIH.getProxy();
        proxy.login("lisi", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间："+new Date());
    }
}

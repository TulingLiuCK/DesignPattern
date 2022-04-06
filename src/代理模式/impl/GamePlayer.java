package 代理模式.impl;

import 代理模式.GamePlayerProxy;
import 代理模式.IGamePlayer;
import 代理模式.IProxy;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class GamePlayer implements IGamePlayer, IProxy {
    private String name = "";
    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()){
            System.out.println("登录名为："+user+"的用户"+this.name+"登录成功！");
        }else {
            System.out.println("请使用指定的代理登录");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()){ System.out.println(this.name + "在打怪！"); }else{ System.out.println("请使用指定的代理访问"); }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()){ System.out.println(this.name + " 又升了一级！"); }else{ System.out.println("请使用指定的代理访问"); }
        this.count();
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    //检验是否是代理访问
    private boolean isProxy(){
//        if (this.proxy ==null){
//            return false;
//        }else {
//            return  true;
//        }
        return true;
    }

    @Override
    public void count() {
        System.out.println("升级费用："+150+"元");
    }
}

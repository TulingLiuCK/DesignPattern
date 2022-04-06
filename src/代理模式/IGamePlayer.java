package 代理模式;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public interface IGamePlayer {
    public void login(String user,String password);

    public void killBoss();

    public void upgrade();

    public IGamePlayer getProxy();
}

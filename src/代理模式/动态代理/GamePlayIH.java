package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */

public class GamePlayIH implements InvocationHandler {
    //被代理的接口
    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }
    //生成的到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        return result;
    }
}

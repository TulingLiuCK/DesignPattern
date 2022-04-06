package 命令模式;

import 命令模式.dao.Command;
import 命令模式.impl.AddRequirementCommand;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class Demo {
    public static void main(String[] args) {
        Invoker xiaoSan = new Invoker();
        System.out.println("客户需要增加一项请求");
        Command command = new AddRequirementCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}

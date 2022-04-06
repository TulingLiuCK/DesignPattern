package 命令模式;

import 命令模式.dao.Command;

/***
 #Create by LCK on 2022/4/3
 # 用法:负责人
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}

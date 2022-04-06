package 命令模式.impl;

import 命令模式.dao.Command;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}

package 命令模式.impl;

import 命令模式.dao.Command;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.rg.plan();
    }
}

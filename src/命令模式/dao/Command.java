package 命令模式.dao;

import 命令模式.CodeGroup;
import 命令模式.PageGroup;
import 命令模式.RequirementGroup;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();//需求组
    protected PageGroup pg = new PageGroup();//美工组
    protected CodeGroup cg = new CodeGroup();//代码组

    public abstract void execute();
}

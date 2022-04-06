package 迭代器模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public interface IProject {
    public void add(String name,int num,int cost);

    public String getProjectInfo();

    public IProjectIterator iterator();




}

package 迭代器模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球打仗项目", 10,10000);
        project.add("哈哈哈", 10, 10000);
        project.add("爱上了对方吉安卡罗", 10, 123123);

        for (int i = 4; i < 104; i++) {
            project.add("第"+i+"个项目", i*5, i*199);
        }
        IProjectIterator iterator = project.iterator();
        while(iterator.hasNext()){
            IProject next = (IProject) iterator.next();
            System.out.println(next.getProjectInfo());
        }
    }
}

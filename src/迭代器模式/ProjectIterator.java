package 迭代器模式;

import java.util.ArrayList;
import java.util.function.Consumer;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class ProjectIterator implements IProjectIterator {
    private ArrayList<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {
        IProjectIterator.super.forEachRemaining(action);
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem>=projectList.size()||this.projectList.get(this.currentItem)==null){
            b = false;
        }
        return b;
    }

    @Override
    public Object next() {
        return this.projectList.get(this.currentItem++);
    }
}

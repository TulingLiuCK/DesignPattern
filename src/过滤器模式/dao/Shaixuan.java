package 过滤器模式.dao;

import 过滤器模式.pojo.Person;

import java.util.List;

/***
 #Create by LCK on 2022/3/31
 # 用法:
 */
public interface Shaixuan {
    public List<Person> meetCriteria(List<Person> persons);

}

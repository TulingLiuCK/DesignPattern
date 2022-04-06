package 过滤器模式.dao.impl;

import 过滤器模式.dao.Shaixuan;
import 过滤器模式.pojo.Person;

import java.util.ArrayList;
import java.util.List;

/***
 #Create by LCK on 2022/3/31
 # 用法:
 */
public class CriteriaFemale implements Shaixuan {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons  = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}

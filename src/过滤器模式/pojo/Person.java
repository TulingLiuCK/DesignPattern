package 过滤器模式.pojo;

/***
 #Create by LCK on 2022/3/31
 # 用法:
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}

package 享元模式;

/***
 #Create by LCK on 2022/4/5
 # 用法:
 */
public class Demo {
    public static void main(String[] args) {
        String str1 = "和谐";
        String str2 = "社会";
        String str3 = "和谐社会";

        String str4 ;
        str4 = str1+ str2;
        System.out.println(str4);
        System.out.println(str3 == str4);

        str4 = (str1+str2).intern();
        System.out.println(str3 == str4);
    }
}

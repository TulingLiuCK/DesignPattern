package 外观模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Police {
    public void checkletter(ILetterProcess letterProcess){
        System.out.println(letterProcess+"信件已经检查过了");
    }
}

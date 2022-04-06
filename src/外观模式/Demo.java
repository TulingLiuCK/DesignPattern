package 外观模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class Demo {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String address = "河南省濮阳市";
        String context = "你好";
        modenPostOffice.sendLetter(context,address);
    }
}

package 外观模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class LetterProcessImpl implements ILetterProcess{
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容..."+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名..."+address);
    }

    @Override
    public void letterInotoEvvelope() {
        System.out.println("把信放到信封中");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件...");
    }
}

package 外观模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public interface ILetterProcess {
    public void writeContext(String context);

    public void fillEnvelope(String address);

    public void letterInotoEvvelope();

    public void sendLetter();
}

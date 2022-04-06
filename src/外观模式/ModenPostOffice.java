package 外观模式;

/***
 #Create by LCK on 2022/4/4
 # 用法:
 */
public class ModenPostOffice {
    private ILetterProcess iLetterProcess = new LetterProcessImpl();
    private Police police = new Police();
    public void sendLetter(String context,String address){
        iLetterProcess.writeContext(context);
        iLetterProcess.fillEnvelope(address);
        iLetterProcess.letterInotoEvvelope();
        police.checkletter(iLetterProcess);
        iLetterProcess.sendLetter();
    }
}

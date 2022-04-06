package 责任链模式;

import 责任链模式.dao.IWomen;
import 责任链模式.dao.impl.Women;

import java.util.ArrayList;
import java.util.Random;

/***
 #Create by LCK on 2022/4/3
 # 用法:
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        for (IWomen iWomen : arrayList) {
            System.out.println(iWomen.getType());
        }
        Handler fathe = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        fathe.setNextHandler(husband);
        husband.setNextHandler(son);
        for (IWomen women : arrayList) {
            fathe.HandlerMessage(women);
        }

    }
}

package 抽象工厂.Factory;

/***
 #Create by LCK on 2022/2/12
 # 用法: 工厂创造器
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;

    }
}

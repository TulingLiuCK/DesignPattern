package 工厂模式.factary;

import 工厂模式.Impl.Circle;
import 工厂模式.Impl.Rectangle;
import 工厂模式.Impl.Square;
import 工厂模式.dao.shape;

/***
 #Create by LCK on 2022/2/12
 # 用法:
 */
public class ShapeFactory {
    public shape getShape(String shapeType){
        if (shapeType == null){
            return  null;
        }
        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}

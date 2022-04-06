package 建造者模型;

import 建造者模型.pojo.ChickenBurger;
import 建造者模型.pojo.Coke;
import 建造者模型.pojo.Pepsi;
import 建造者模型.pojo.VegBurger;

/***
 #Create by LCK on 2022/2/14
 # 用法:
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }


}

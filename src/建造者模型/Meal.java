package 建造者模型;

import 建造者模型.dao.Item;

import java.util.ArrayList;
import java.util.List;

/***
 #Create by LCK on 2022/2/14
 # 用法:规定餐品
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items){
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}

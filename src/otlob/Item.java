/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

/**
 *
 * @author 
 */
public class Item{
    private Food food;
    private int quantity;
    private int itemNum;

    public Item(Food food, int quantity,int itemNum) {
        this.food = food;
        this.quantity = quantity;
        this.itemNum=itemNum;
    }

    public Item() {
    }

    public Food getFood() {
        return food;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void setFood(Food food) {
        this.food = food;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }
    
}

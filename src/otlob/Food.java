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
public class Food implements Component{
    private String name;
    private float price;
    private int foodNum;

    public Food(String name, float price,int foodNum) {
        this.name = name;
        this.price = price;
        this.foodNum=foodNum;
    }

    public Food(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return foodNum + "- " + name +"  $" + price;
    }

    public int getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(int foodNum) {
        this.foodNum = foodNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public Component getComponent(String name) {
        if(this.name.equals(name))
            return this;
        else
            return null;
    }

    @Override
    public void addNewComponent(Component component) {
        this.name=component.getName();
        this.price=component.getPrice();
    }

    @Override
    public void removeComponent(String name) {
        this.name="";
        this.price=0;
    }

    @Override
    public void editComponent(String name, float price) {
        this.name=name;
        this.price=price;    
    }

    @Override
    public String getType() {
        return ""+this.foodNum;
    }

}

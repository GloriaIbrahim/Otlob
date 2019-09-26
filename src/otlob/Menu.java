/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Menu implements Component{
    private ArrayList<Component> food;
    private String type;

    public Menu(ArrayList<Component> food, String type) {
        this.food = food;
        this.type = type;
    }

    public Menu(String type) {
        this.type = type;
        this.food=new ArrayList<>();
    }

    public Menu() {
        this.food=new ArrayList<>();
    }

    public void setFood(ArrayList<Component> food) {
        this.food = food;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Component> getFood() {
        return food;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Component getComponent(String name) {
        for(int i=0;i<food.size();i++)
        {
            if(food.get(i).getName().equals(name)){
                return food.get(i);
            }
        }
        return null;
    }

    @Override
    public void addNewComponent(Component component) {
        food.add(component);
    }

    @Override
    public void removeComponent(String name) {
        for(int i=0;i<food.size();i++)
        {
            if(food.get(i).getName().equals(name)){
                food.remove(i);
            }
        }
    }

    @Override
    public void editComponent(String name, float price) {
        for(int i=0;i<food.size();i++)
        {
            if(food.get(i).getName().equals(name)){
                food.get(i).setPrice(price);
            }
        }
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public String getName() {
       return null;
    }

    @Override
    public void setPrice(float price) {
    
    }

    @Override
    public String toString() {
        return "Menu " + "Type " + type + "\nFood\n" + food ;
    }
    
}

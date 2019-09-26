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
public class Restaurant implements RestaurantInt{
    private String name;
    private int minimumOrderItems,deliveryTime,rate;
    private Menu menu;

    public Restaurant(String name, int minimumOrderItems, int deliveryTime) {
        this.name = name;
        this.minimumOrderItems = minimumOrderItems;
        this.deliveryTime = deliveryTime;
        this.menu=new Menu();
        this.rate=0;
    }

    
    public Restaurant(String name, int minimumOrderItems, int deliveryTime, Menu menu) {
        this.name = name;
        this.minimumOrderItems = minimumOrderItems;
        this.deliveryTime = deliveryTime;
        this.menu = menu;
        this.rate=0;
    }
    public void addNewRestaurant(String name, int minimumOrderItems, int deliveryTime, Menu menu){
        this.name = name;
        this.minimumOrderItems = minimumOrderItems;
        this.deliveryTime = deliveryTime;
        this.menu = menu;
    }
    
    public void addNewMenuComponent(Component component){
        this.menu.addNewComponent(component);
    }
    
    public void removeMenuComponent(String name){
        menu.removeComponent(name);
    }
    
    public void removeRestaurant(){
        this.name = "";
        this.minimumOrderItems = 0;
        this.deliveryTime = 0;
        this.menu = null;
    }
    
    public void editRestaurantData(int minimumOrderItems, int deliveryTime){
        this.minimumOrderItems = minimumOrderItems;
        this.deliveryTime = deliveryTime;
    }
    
    public void editRestaurantMenu(Menu menu){
        this.menu=menu;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setMinimumOrderItems(int minimumOrderItems) {
        this.minimumOrderItems = minimumOrderItems;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public int getMinimumOrderItems() {
        return minimumOrderItems;
    }

    @Override
    public int getDeliveryTime() {
        return deliveryTime;
    }

    @Override
    public int getRestaurantRate() {
        return rate;
    }

    @Override
    public Menu getRestaurantMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return "Restaurant" + " Name " + name + "\nMinimum Order Items " + minimumOrderItems + "\nDelivery Time " + deliveryTime + "\nRate " + rate + "\nMenu=" + menu ;
    }
    
    @Override
    public Restaurant getRestaurant(){
        return this;
    }
}

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
public class Application {
    private static Application app;
    private ArrayList<Person> users;
    private ArrayList<Order> orders;
    private ArrayList<Restaurant> restaurants;
    private DB db;
    private Application(DB db) {
        this.db=db;
        users=db.getAllUsers();
        ArrayList<CustomerService> customerServices=new ArrayList<>();
        for(int i=0;i<users.size();i++){
            if(users.get(i) instanceof CustomerService){
                customerServices.add((CustomerService) users.get(i));
            }
        }
        orders=new ArrayList<>();
        restaurants=db.getRestaurants();
    }
    
    public static Application getInstance(DB db){
        app=new Application(db);
        return app;
    }
    
    public void makeNewOrder(Order order){
        this.orders.add(order);
    }
    
    public String addNewAccount(Customer customer){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUsername().equals(customer.getUsername())){
                return "";
            }
        }
        users.add(customer);
        return "Account Created";
    }
    public Person getAccount(String username,String password){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUsername().equals(username)){
                return users.get(i).login(username, password);
                
            }
        }
        
        return null;
    }
    public void addNewRestaurant(Restaurant rest){
        restaurants.add(rest);
        db.addRestaurant(rest);
    }
    public void editRestaurantData(String name,int minOrderItems,int deliveryTime){
        for(int i=0;i<restaurants.size();i++){
            if(restaurants.get(i).getName().equals(name)){
                restaurants.get(i).editRestaurantData(minOrderItems, deliveryTime);
                db.updateRestaurantData(name, minOrderItems, deliveryTime);
            }
        }
    }
    public void editRestaurantMenu(String name,Menu menu){
        for(int i=0;i<restaurants.size();i++){
            if(restaurants.get(i).getName().equals(name)){
                restaurants.get(i).editRestaurantMenu(menu);
                db.updateRestaurantMenu(name, menu);
            }
        }
    }
    public void removeRestaurant(String name){
        for(int i=0;i<restaurants.size();i++){
            if(restaurants.get(i).getName().equals(name)){
                restaurants.get(i).removeRestaurant();
                restaurants.remove(i);
                db.deleteRestaurant(name);
            }
        }
    }
    public void removeRestaurantMenuComponent(String name,String foodName){
        for(int i=0;i<restaurants.size();i++){
            if(restaurants.get(i).getName().equals(name)){
                restaurants.get(i).removeMenuComponent(foodName);
                db.deleteRestaurantMenuComponent(name,foodName);
            }
        }
    }
    public void addRestaurantMenuComponent(String name,Food food){
        for(int i=0;i<restaurants.size();i++){
            if(restaurants.get(i).getName().equals(name)){
                restaurants.get(i).addNewMenuComponent(food);
                db.addRestaurantMenuComponent(name, food);
            }
        }
    }
    public ArrayList<String> getRestaurantsRate(){
        return db.getRestaurantsRate();
    }
    public ArrayList<String> getRestaurantsName(){
        return db.getRestaurantsName();
    }
    public Menu getRstaurantMenu(String restaurantName){
        return db.getMenu(restaurantName);
    }
    public ArrayList<Person> getUsers() {
        return users;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }
    
    public Order reviseOrderDetails(int orderNum){
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).getOrderNum()==orderNum){
                return orders.get(i);
            }
        }
        return null;
    }
    public OrderCustomerInt monitorOrder(int orderNum){
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).getOrderNum()==orderNum){
                return orders.get(i).monitorOrder();
            }
        }
        return null;
    }
    public boolean changeOrderStatus(int orderNum){
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).getOrderNum()==orderNum){
                orders.get(i).setStatus(true);
                return true;
            }
        }
        return false;
    }
    public ArrayList<Order> viewPendingOrders(){
        ArrayList<Order> pendingOrders=new ArrayList<>();
        for(int i=0;i<orders.size();i++){
            if(!orders.get(i).getStatus()){
               pendingOrders.add(orders.get(i));
            }
        }
        return pendingOrders;
    }
    
    public boolean deleteOrder(int orderNum){
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).getOrderNum()==orderNum){
                orders.get(i).deleteOrder();
                orders.remove(i);
                return true;
            }
        }
        return false;
    }
    public ArrayList<OrderCustomerInt> viewRecentOrders(String customerName){
        ArrayList<OrderCustomerInt> recentOrders=new ArrayList<>();
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).getCustomer().getName().equals(customerName)){
               recentOrders.add(orders.get(i));
            }
        }
        return recentOrders;
    }
    public boolean deleteAccount(String username){
        Customer cus;
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUsername().equals(username)){
                cus=(Customer) users.get(i);
                cus.deleteAccount(username,users.get(i).getPassword());
                users.remove(i);
                return true;
            }
        }
        return false;
    }
    public Customer editAccount(String email, String phone, String address, Payment payment, int ID, String username, String name, String password){
        Customer cus;
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUsername().equals(username)){
                cus=(Customer) users.get(i);
                return cus.editProfile(email, phone, address, payment, ID, username, name, password);
            }
        }
        return null;
    }
    public void addFeedback(int orderNum,String Complain,int rate,String username){
        Customer cus;
        Feedback feedback;
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUsername().equals(username)){
                cus=(Customer) users.get(i);
                feedback=new Feedback(orderNum, Complain, rate, cus.getName(), cus.getPhone());
                for(int j=0;j<cus.getOrders().size();j++){
                    if(cus.getOrders().get(j).getOrderNum()==orderNum)
                        cus.getOrders().get(j).setFeedback(feedback);
                }
            }
        }
    }
    public Bill makeNewOrder(String username,ArrayList<Item> orderItems){
        Bill bill;
        Order order;
        Customer cus=null;
        ArrayList<CustomerServiceObserver> customerServices=new ArrayList<>();
        float total=0;
        for(int i=0;i<orderItems.size();i++){
            total+=(orderItems.get(i).getQuantity()*orderItems.get(i).getFood().getPrice());
        }
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUsername().equals(username)){
                cus=(Customer) users.get(i);
            }
        }
        for(int i=0;i<users.size();i++){
            if(users.get(i) instanceof CustomerService){
                customerServices.add((CustomerService) users.get(i));
            }
        }
        bill=new Bill(orders.size()+1,cus.getAddress(),total,cus.getName());
        order=new Order(orderItems,(CustomerObserver)cus,customerServices,cus.getAddress(),cus.getPayment(),bill,orders.size()+1);
        orders.add(order);
        return bill;
    }
    public ArrayList<Feedback> getFeedbacks (){
        return db.getFeedbacks();
    }
}

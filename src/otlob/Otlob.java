/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Otlob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int user,num=1,num2=1;
        String x="";
        Scanner input=new Scanner(System.in);
        DB db = new DB();
        Application app=Application.getInstance(db);
        Admin admin;
        String name,username,password;
        
        do{
            System.out.println("1-Customer\n2-Customer Service\n3-Admin\n0-Exit");
            user=input.nextInt();
            //Customer Interface
            while(user==1&&num!=0){
                int orderNum;
                Customer cus;
                String phone,email,address,creditcard;
                Payment payment;
                int ID;
                System.out.println("1-Register");
                System.out.println("2-Login");
                System.out.println("0-Exit");
                num=input.nextInt();
                switch(num)
                {
                    case 1:
                        System.out.println("Enter your name: ");
                        name=input.nextLine();
                        name=input.nextLine();
                        System.out.println("Enter your email: ");
                        email=input.nextLine();
                        System.out.println("Enter your phone: ");
                        phone=input.nextLine();
                        System.out.println("Enter your address: ");
                        address=input.nextLine();
                        System.out.println("Enter your ID: ");
                        ID=input.nextInt();
                        System.out.println("Enter your credit card number: ");
                        creditcard=input.nextLine();
                        creditcard=input.nextLine();
                        payment=new CreditCard(creditcard);
                        System.out.println("Enter a username: ");
                        username=input.nextLine();
                        System.out.println("Enter a password: ");
                        password=input.nextLine();
                        cus=new Customer(email, phone, address, payment, ID, username, password, name);
                        if("".equals(app.addNewAccount(cus))){
                            System.out.println("Username Used\nChoose Another Username");
                            continue;
                        }
                        else{
                            System.out.println(app.addNewAccount(cus));
                            db.register(cus);
                            while(num==1&&num2!=0){
                            System.out.println("1-Make New Order");
                            System.out.println("2-Monitor Order");
                            System.out.println("3-Cancel Order");
                            System.out.println("4-View Recent Orders");
                            System.out.println("5-Fill Feedback Form");
                            System.out.println("6-View Restaurants");
                            System.out.println("7-Edit Profile");
                            System.out.println("8-Delete Account");
                            System.out.println("0-Exit");
                            num2=input.nextInt();
                            switch(num2){
                                case 1:
                                    String restauranteName;
                                    ArrayList<Item> orderItems=new ArrayList<>();
                                    Item item=new Item();
                                    String food;
                                    int quantity;
                                    
                                    System.out.println("Select Restaurant");
                                    System.out.println(app.getRestaurantsName());
                                    restauranteName=input.nextLine();
                                    restauranteName=input.nextLine();
                                    System.out.println(app.getRstaurantMenu(restauranteName));
                                    Menu menu=app.getRstaurantMenu(restauranteName);
                                    do{ 
                                        System.out.println("Select Item");
                                        food=input.nextLine();
                                        System.out.print("Enter Quantity ");
                                        quantity=input.nextInt();
                                        for(int i=0;i<menu.getFood().size();i++){
                                            if(menu.getFood().get(i).getName().equals(food))
                                            {
                                                item=new Item((Food) menu.getFood().get(i),quantity,1);
                                            }
                                        }
                                        orderItems.add(item);
                                        System.out.println("do you want to select another item? y=yes, n=no");
                                        x= input.nextLine();
                                        x= input.nextLine();
                                    }while ("y".equals(x) ||"Y".equals(x));
                                    System.out.println("Your bill is: ");
                                    System.out.println(app.makeNewOrder(username, orderItems));
                                    
                                    break;
                                case 2:
                                    System.out.println("Enter order number");
                                    orderNum=input.nextInt();
                                    System.out.println(app.monitorOrder(orderNum));
                                    break;
                                case 3:
                                    System.out.println("Enter order number");
                                    orderNum=input.nextInt();
                                    if( app.deleteOrder(orderNum))
                                        System.out.println("Order has been cancelled");
                                    else
                                        System.out.println("Order number is not available");
                                    break;
                                case 4:
                                    System.out.println(app.viewRecentOrders(username));
                                    break;
                                case 5:
                                    String complain;
                                    int rate;
                                    System.out.println("Enter order number");
                                    orderNum=input.nextInt();
                                    System.out.println("Enter restaurant rate");
                                    rate=input.nextInt();
                                    System.out.println("Enter your feedback");
                                    complain=input.nextLine();
                                    app.addFeedback(orderNum, complain, rate, username);
                                    break;
                                case 6:
                                    System.out.println(app.getRestaurants());
                                    break;
                                case 7:
                                    System.out.println("Enter your new name: ");
                                    name=input.nextLine();
                                    name=input.nextLine();
                                    System.out.println("Enter your new email: ");
                                    email=input.nextLine();
                                    System.out.println("Enter your new phone: ");
                                    phone=input.nextLine();
                                    System.out.println("Enter your new address: ");
                                    address=input.nextLine();
                                    System.out.println("Enter your new ID: ");
                                    ID=input.nextInt();
                                    System.out.println("Enter your new payment number: ");
                                    creditcard=input.nextLine();
                                    creditcard=input.nextLine();
                                    payment=new CreditCard(creditcard);
                                    System.out.println("Enter a new password: ");
                                    password=input.nextLine();
                                    if(app.editAccount(email, phone, address, payment, ID, username, name, password)!=null){
                                        System.out.println("Account has been edited");
                                        System.out.println(app.editAccount(email, phone, address, payment, ID, username, name, password));
                                    }
                                    else
                                        System.out.println("Account has not been edited");
                                    break;
                                case 8:
                                    if( app.deleteAccount(username))
                                        System.out.println("Account has been deleted");
                                    else
                                        System.out.println("Username is invalid");
                                    break;
                                }
                            }
                            break;
                        }
                    case 2:
                        num2=1;
                        System.out.println("Enter you username: ");
                        username=input.nextLine();
                        username=input.nextLine();
                        System.out.println("Enter your password: ");
                        password=input.nextLine();
                        cus=(Customer) app.getAccount(username, password);
                        if(cus!=null)
                        {
                            while(num==2&&num2!=0){
                            System.out.println("1-Make New Order");
                            System.out.println("2-Monitor Order");
                            System.out.println("3-Cancel Order");
                            System.out.println("4-View Recent Orders");
                            System.out.println("5-Fill Feedback Form");
                            System.out.println("6-View Restaurants");
                            System.out.println("7-Edit Profile");
                            System.out.println("8-Delete Account");
                            System.out.println("0-Exit");
                            num2=input.nextInt();
                            switch(num2){
                                case 1:
                                    String restauranteName;
                                    ArrayList<Item> orderItems=new ArrayList<>();
                                    Item item=new Item();
                                    String food;
                                    int quantity;
                                    
                                    System.out.println("Select Restaurant");
                                    System.out.println(app.getRestaurantsName());
                                    restauranteName=input.nextLine();
                                    restauranteName=input.nextLine();
                                    System.out.println(app.getRstaurantMenu(restauranteName));
                                    Menu menu=app.getRstaurantMenu(restauranteName);
                                    do{ 
                                        System.out.println("Select Item");
                                        food=input.nextLine();
                                        System.out.print("Enter Quantity ");
                                        quantity=input.nextInt();
                                        for(int i=0;i<menu.getFood().size();i++){
                                            if(menu.getFood().get(i).getName().equals(food))
                                            {
                                                item=new Item((Food) menu.getFood().get(i),quantity,1);
                                            }
                                        }
                                        orderItems.add(item);
                                        System.out.println("do you want to select another item? y=yes, n=no");
                                        x= input.nextLine();
                                        x= input.nextLine();
                                    }while ("y".equals(x) ||"Y".equals(x));
                                    System.out.println("Your bill is: ");
                                    System.out.println(app.makeNewOrder(username, orderItems));
                                    break;
                                case 2:
                                    System.out.println("Enter order number");
                                    orderNum=input.nextInt();
                                    System.out.println(app.monitorOrder(orderNum));
                                    break;
                                case 3:
                                    System.out.println("Enter order number");
                                    orderNum=input.nextInt();
                                    if( app.deleteOrder(orderNum))
                                        System.out.println("Order has been cancelled");
                                    else
                                        System.out.println("Order number is not available");
                                    break;
                                case 4:
                                    System.out.println(app.viewRecentOrders(username));
                                    break;
                                case 5:
                                    String complain;
                                    int rate;
                                    System.out.println("Enter order number");
                                    orderNum=input.nextInt();
                                    System.out.println("Enter restaurant rate");
                                    rate=input.nextInt();
                                    System.out.println("Enter your feedback");
                                    complain=input.nextLine();
                                    app.addFeedback(orderNum, complain, rate, username);
                                    break;
                                case 6:
                                    System.out.println(app.getRestaurants());
                                    break;
                                case 7:
                                    System.out.println("Enter your new name: ");
                                    name=input.nextLine();
                                    name=input.nextLine();
                                    System.out.println("Enter your new email: ");
                                    email=input.nextLine();
                                    System.out.println("Enter your new phone: ");
                                    phone=input.nextLine();
                                    System.out.println("Enter your new address: ");
                                    address=input.nextLine();
                                    System.out.println("Enter your new ID: ");
                                    ID=input.nextInt();
                                    System.out.println("Enter your new payment number: ");
                                    creditcard=input.nextLine();
                                    creditcard=input.nextLine();
                                    payment=new CreditCard(creditcard);
                                    System.out.println("Enter a new password: ");
                                    password=input.nextLine();
                                    if(app.editAccount(email, phone, address, payment, ID, username, name, password)!=null){
                                        System.out.println("Account has been edited");
                                        System.out.println(app.editAccount(email, phone, address, payment, ID, username, name, password));
                                    }
                                    else
                                        System.out.println("Account has not been edited");
                                    break;
                                case 8:
                                    if( app.deleteAccount(username))
                                        System.out.println("Account has been deleted");
                                    else
                                        System.out.println("Username is invalid");
                                    break;
                                }
                            }
                            break;
                        }
                        else{
                            System.out.println("Wrong Username or Password");
                            break;
                        }
                }
            }
            
            
            //Customer Service Interface
            num=1;
            CustomerService customerService;
            if(user==2){
                System.out.println("Enter you username: ");
                username=input.nextLine();
                username=input.nextLine();
                System.out.println("Enter your password: ");
                password=input.nextLine();
                customerService=(CustomerService) app.getAccount(username, password);
            }
            while(user==2&&num!=0){
                int orderNum;
                    System.out.println("1-Revise Order Details");
                    System.out.println("2-Change Order Status From Pending To Confirmed");
                    System.out.println("3-View Pending Orders");
                    System.out.println("4-Decline Order");
                    System.out.println("5-View Orders Feedback");
                    System.out.println("6-View Restaurants Rate");
                    System.out.println("0-Exit");
                    num=input.nextInt();
                    switch(num){
                        case 1:
                            System.out.println("Enter order number");
                            orderNum=input.nextInt();
                            System.out.println(app.reviseOrderDetails(orderNum));
                            break;
                        case 2:
                            System.out.println("Enter order number");
                            orderNum=input.nextInt();
                            if(app.changeOrderStatus(orderNum))
                                System.out.println("Order status has been changed to confirmed");
                            else
                                System.out.println("Order number is not available");
                            break;
                        case 3:
                            System.out.println(app.viewPendingOrders());
                            break;
                        case 4:
                            System.out.println("Enter order number");
                            orderNum=input.nextInt();
                            if( app.deleteOrder(orderNum))
                                System.out.println("Order has been declined");
                            else
                                System.out.println("Order number is not available");
                            break;
                        case 5:
                            System.out.println(app.getFeedbacks());
                            break;
                        case 6:
                            System.out.println(app.getRestaurantsRate());
                            break;
                        }
                
            }
            
            //Admin Interface
            num=1;
            if(user==3){
                System.out.println("Enter you username: ");
                username=input.nextLine();
                username=input.nextLine();
                System.out.println("Enter your password: ");
                password=input.nextLine();
                admin=(Admin) app.getAccount(username, password);
            }
            while(user==3&&num!=0){
                
                int minOrderItems,deliveryTime,rate;
                Restaurant rest;
                String foodName,menuType;
                float price;
                
                    System.out.println("1-Add New Restaurant");
                    System.out.println("2-Edit Restaurant Data");
                    System.out.println("3-Edit Restaurant Menu");
                    System.out.println("4-Remove Restaurant");
                    System.out.println("5-Remove Menu Component");
                    System.out.println("6-Add New Menu Component");
                    System.out.println("7-View Restaurants Rate");
                    System.out.println("0-Exit");
                    num=input.nextInt();
                    switch(num){
                        case 1:
                            System.out.println("Enter restaurant name");
                            name=input.nextLine();
                            name=input.nextLine();
                            System.out.println("Enter minimum order items");
                            minOrderItems=input.nextInt();
                            System.out.println("Enter delivery time");
                            deliveryTime=input.nextInt();
                            rest=new Restaurant(name,minOrderItems,deliveryTime);
                            app.addNewRestaurant(rest);
                            break;
                        case 2:
                            System.out.println("Enter restaurant name that you want to edit its data");
                            name=input.nextLine();
                            name=input.nextLine();
                            System.out.println("Enter new minimum order items");
                            minOrderItems=input.nextInt();
                            System.out.println("Enter new delivery time");
                            deliveryTime=input.nextInt();
                            app.editRestaurantData(name, minOrderItems, deliveryTime);
                            break;
                        case 3:
                            Menu menu;
                            ArrayList<Component> food=new ArrayList<>();
                            System.out.println("Enter restaurant name that you want to edit its menu");
                            name=input.nextLine();
                            name=input.nextLine();
                            System.out.println("Enter new menu type");
                            menuType=input.nextLine();
                            do{
                                System.out.println("Enter food name");
                                foodName=input.nextLine();
                                System.out.print("Enter price ");
                                price=input.nextFloat();
                                food.add(new Food(foodName,price));
                                System.out.println("do you want to add another food? y=yes, n=no");
                                x= input.nextLine();
                                x= input.nextLine();
                            }while("y".equals(x)||"Y".equals(x));
                            menu=new Menu(food,menuType);
                            app.editRestaurantMenu(name, menu);
                            break;
                        case 4:
                            System.out.println("Enter restaurant name that you want to remove");
                            name=input.nextLine();
                            name=input.nextLine();
                            app.removeRestaurant(name);
                            break;
                        case 5:
                            System.out.println("Enter restaurant name that you want to remove its menu component");
                            name=input.nextLine();
                            name=input.nextLine();
                            System.out.println("Enter component name");
                            foodName=input.nextLine();
                            app.removeRestaurantMenuComponent(name, foodName);
                            break;
                        case 6:
                            System.out.println("Enter restaurant name that you want to add new menu component");
                            name=input.nextLine();
                            name=input.nextLine();
                            System.out.println("Enter food name");
                            foodName=input.nextLine();
                            System.out.print("Enter price ");
                            price=input.nextFloat();
                            app.addRestaurantMenuComponent(name, new Food(foodName,price));
                            break;
                        case 7:
                            System.out.println(app.getRestaurantsRate());
                            break;
                        }
            }
        }while(user!=0);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;
/*
 @author 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    private final String userName = "root";
    private final String password = "";
    private final String dbName = "otlob";
    
    private Connection con;
    
    public DB() 
    {
        try {
            //Loading the jdbc driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Get a connection to database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, userName, password);
        } catch (Exception e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());
        }
    }
    
    public void register(Customer c)
    {
         try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into customer values('"+c.getID()+"', '" + c.getUsername()+"', '"+ c.getPassword() +"', '"+ c.getName() + "', '" +c.getEmail() 
                    + "', '"+ c.getPhone()+"', '" + c.getAddress() + "', '"+ c.getPayment().getPaymentMethod()+"')");
            
            System.out.println("account added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
    
    public void addRestaurant(Restaurant r)
    {
         try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into restaurant values('"+r.getName()+"', '" + r.getMinimumOrderItems()+ "', '"+ r.getDeliveryTime()+ "', '"+ r.getRestaurantRate() + "')");
            
            System.out.println("restaurant added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
    public ArrayList<String> getRestaurantsName(){
        ArrayList<String> restaurantsNames=new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT name FROM restaurant ");
            while(rs.next()){
                restaurantsNames.add(rs.getString("name"));
            }
        } catch (Exception e) {
            System.err.println("DATABASE SELECTION ERROR: " + e.toString());
        }
        return restaurantsNames;
    }
    public ArrayList<String> getRestaurantsRate(){
        ArrayList<String> restaurantsNames=new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT name, rate FROM restaurant ");
            while(rs.next()){
                restaurantsNames.add(rs.getString("name"));
                restaurantsNames.add(rs.getString("rate"));
            }
        } catch (Exception e) {
            System.err.println("DATABASE SELECTION ERROR: " + e.toString());
        }
        return restaurantsNames;
    }
    public ArrayList<Restaurant> getRestaurants(){
        ArrayList<Restaurant> restaurants=new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT * FROM restaurant ");
            while(rs.next()){
                restaurants.add(new Restaurant(rs.getString("name"),rs.getInt("minimunOrderItems"),rs.getInt("deliveryTime")));
            }
        } catch (Exception e) {
            System.err.println("DATABASE SELECTION ERROR: " + e.toString());
        }
        return restaurants;
    }
    public void updateRestaurantData(String name,int minOrderItems,int deliveryTime) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE restaurant SET minimunOrderItems = '" + minOrderItems + "' WHERE name = '" + name + "'");
            stmt.executeUpdate("UPDATE restaurant SET deliveryTime = '" + deliveryTime + "' WHERE name = '" + name + "'");
            System.out.println("Restaurant data updated");
        } catch (Exception e) {
            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
        }
    }
    public void updateRestaurantMenu(String name,Menu menu) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE menu SET type = '" + menu.getType() + "' WHERE restaurantName = '" + name + "'");
            ResultSet rs =stmt.executeQuery("SELECT ID FROM menu WHERE restaurantName = '" + name + "'");
            stmt.executeUpdate("DELETE FROM food WHERE menuID = '"+rs+"'");
            for(int i=0;i<menu.getFood().size();i++){
                stmt.executeUpdate("INSERT INTO food VALUES('"+menu.getFood().get(i).getName()+"', '" + menu.getFood().get(i).getPrice()+"', "+null+ ", '"+ rs + "')");
            }
            System.out.println("Restaurant menu updated");
        } catch (Exception e) {
            System.err.println("DATABASE UPDATE ERROR: " + e.toString());
        }
    }
    public void deleteRestaurant(String name) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM restaurant WHERE name = '" + name + "'");
            System.out.println("Restaurant deleted");
        } catch (Exception e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
    }
    public void deleteRestaurantMenuComponent(String name,String foodName) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT ID FROM menu WHERE restaurantName = '" + name + "'");
            stmt.executeUpdate("DELETE FROM food WHERE name = '" + foodName + "' AND menuID = '" + rs.getInt("ID") + "'");
            System.out.println("Component deleted");
        } catch (Exception e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
    }
    public void addRestaurantMenuComponent(String name,Food food){
        try {
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT * FROM menu WHERE restaurantName = '" + name + "'");
            stmt.executeUpdate("insert into food values('"+food.getName()+"', '" + food.getPrice()+ "', NULL , '"+ rs.getInt("ID") + "')");
            
            System.out.println("Menu component added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
    public Menu getMenu(String restaurantName)
    {
        Menu menu=new Menu();
        ArrayList<Component> food=new ArrayList<>();
       try {
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT * FROM food WHERE menuID IN(SELECT ID FROM menu WHERE restaurantName= '" + restaurantName + "')");
            while(rs.next()){
                food.add(new Food(rs.getString("name"),rs.getFloat("price"),rs.getInt("foodNum")));
            }
            menu.setFood(food);
            
        } catch (Exception e) {
            System.err.println("DATABASE SELECTION ERROR: " + e.toString());
        } 
       return menu;
    }
    public ArrayList<Feedback> getFeedbacks ()
    {
        ArrayList<Feedback> feedbacks = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT * FROM feedback ");
            while(rs.next()){
                feedbacks.add(new Feedback(rs.getInt("orderNum"),rs.getString("complain"),rs.getInt("restaurantRate"),rs.getString("customerName"),rs.getString("customerPhone")));
            }
        } catch (Exception e) {
            System.err.println("DATABASE SELECTION ERROR: " + e.toString());
        }
        return feedbacks;
    }
    public void addNewFeedback(Feedback feedback){
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into feedback values('"+feedback.getOrderNum()+"', '" + feedback.getComplain()+"', '"+ feedback.getResturantRate() + "', '"+ feedback.getCustomerName()+"', '" + feedback.getCustomerPhone() +"')");
            
            System.out.println("Feedback added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
    public ArrayList<Person> getAllUsers(){
        ArrayList<Person> users = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT * FROM customer ");
            while(rs.next()){
                users.add(new Customer(rs.getString("email"),rs.getString("phone"),rs.getString("address"),new CreditCard(rs.getString("payment")),rs.getInt("ID"),rs.getString("username"),rs.getString("password"),rs.getString("name")));
            }
            rs =stmt.executeQuery("SELECT * FROM customerservice ");
            while(rs.next()){
                users.add(new CustomerService(rs.getString("username"),rs.getString("password"),rs.getString("name")));
            }
        } catch (Exception e) {
            System.err.println("DATABASE SELECTION ERROR: " + e.toString());
        }
        return users;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class DBTest {
    
        @Test
    public void testRegister() {
        System.out.println("register");
        Customer c = null;
        DB instance = new DB();
        instance.register(c);
    }

    @Test
    public void testAddRestaurant() {
        System.out.println("addRestaurant");
        Restaurant r = null;
        DB instance = new DB();
        instance.addRestaurant(r);
    }

    @Test
    public void testGetRestaurantsName() {
        System.out.println("getRestaurantsName");
        DB instance = new DB();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getRestaurantsName();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetRestaurantsRate() {
        System.out.println("getRestaurantsRate");
        DB instance = new DB();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getRestaurantsRate();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetRestaurants() {
        System.out.println("getRestaurants");
        DB instance = new DB();
        ArrayList<Restaurant> expResult = null;
        ArrayList<Restaurant> result = instance.getRestaurants();
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdateRestaurantData() {
        System.out.println("updateRestaurantData");
        String name = "";
        int minOrderItems = 0;
        int deliveryTime = 0;
        DB instance = new DB();
        instance.updateRestaurantData(name, minOrderItems, deliveryTime);
    }

    @Test
    public void testUpdateRestaurantMenu() {
        System.out.println("updateRestaurantMenu");
        String name = "";
        Menu menu = null;
        DB instance = new DB();
        instance.updateRestaurantMenu(name, menu);
    }

    @Test
    public void testDeleteRestaurant() {
        System.out.println("deleteRestaurant");
        String name = "";
        DB instance = new DB();
        instance.deleteRestaurant(name);
    }

    @Test
    public void testDeleteRestaurantMenuComponent() {
        System.out.println("deleteRestaurantMenuComponent");
        String name = "";
        String foodName = "";
        DB instance = new DB();
        instance.deleteRestaurantMenuComponent(name, foodName);
    }
    @Test
    public void testAddRestaurantMenuComponent() {
        System.out.println("addRestaurantMenuComponent");
        String name = "";
        Food food = null;
        DB instance = new DB();
        instance.addRestaurantMenuComponent(name, food);
    }

    @Test
    public void testGetMenu() {
        System.out.println("getMenu");
        String restaurantName = "";
        DB instance = new DB();
        Menu expResult = null;
        Menu result = instance.getMenu(restaurantName);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFeedbacks() {
        System.out.println("getFeedbacks");
        DB instance = new DB();
        ArrayList<Feedback> expResult = null;
        ArrayList<Feedback> result = instance.getFeedbacks();
        assertEquals(expResult, result);
    }

    @Test
    public void testAddNewFeedback() {
        System.out.println("addNewFeedback");
        Feedback feedback = null;
        DB instance = new DB();
        instance.addNewFeedback(feedback);
    }

    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        DB instance = new DB();
        ArrayList<Person> expResult = null;
        ArrayList<Person> result = instance.getAllUsers();
        assertEquals(expResult, result);
    }
    
}

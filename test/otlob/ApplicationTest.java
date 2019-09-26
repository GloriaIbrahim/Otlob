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
public class ApplicationTest {
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        DB db = null;
        Application expResult = null;
        Application result = Application.getInstance(db);
        assertEquals(expResult, result);
    }
    @Test
    public void testMakeNewOrder_Order() {
        System.out.println("makeNewOrder");
        Order order = null;
        Application instance = null;
        instance.makeNewOrder(order);
    }
    @Test
    public void testAddNewAccount() {
        System.out.println("addNewAccount");
        Customer customer = null;
        Application instance = null;
        String expResult = "";
        String result = instance.addNewAccount(customer);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        String username = "";
        String password = "";
        Application instance = null;
        Person expResult = null;
        Person result = instance.getAccount(username, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testAddNewRestaurant() {
        System.out.println("addNewRestaurant");
        Restaurant rest = null;
        Application instance = null;
        instance.addNewRestaurant(rest);
    }
    @Test
    public void testEditRestaurantData() {
        System.out.println("editRestaurantData");
        String name = "";
        int minOrderItems = 0;
        int deliveryTime = 0;
        Application instance = null;
        instance.editRestaurantData(name, minOrderItems, deliveryTime);
    }
    @Test
    public void testEditRestaurantMenu() {
        System.out.println("editRestaurantMenu");
        String name = "";
        Menu menu = null;
        Application instance = null;
        instance.editRestaurantMenu(name, menu);
    }
    @Test
    public void testRemoveRestaurant() {
        System.out.println("removeRestaurant");
        String name = "";
        Application instance = null;
        instance.removeRestaurant(name);
    }
    @Test
    public void testRemoveRestaurantMenuComponent() {
        System.out.println("removeRestaurantMenuComponent");
        String name = "";
        String foodName = "";
        Application instance = null;
        instance.removeRestaurantMenuComponent(name, foodName);
    }
    @Test
    public void testAddRestaurantMenuComponent() {
        System.out.println("addRestaurantMenuComponent");
        String name = "";
        Food food = null;
        Application instance = null;
        instance.addRestaurantMenuComponent(name, food);
    }
    @Test
    public void testGetRestaurantsRate() {
        System.out.println("getRestaurantsRate");
        Application instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getRestaurantsRate();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetRestaurantsName() {
        System.out.println("getRestaurantsName");
        Application instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getRestaurantsName();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetRstaurantMenu() {
        System.out.println("getRstaurantMenu");
        String restaurantName = "";
        Application instance = null;
        Menu expResult = null;
        Menu result = instance.getRstaurantMenu(restaurantName);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        Application instance = null;
        ArrayList<Person> expResult = null;
        ArrayList<Person> result = instance.getUsers();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        Application instance = null;
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.getOrders();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRestaurants() {
        System.out.println("getRestaurants");
        Application instance = null;
        ArrayList<Restaurant> expResult = null;
        ArrayList<Restaurant> result = instance.getRestaurants();
        assertEquals(expResult, result);
    }

    @Test
    public void testReviseOrderDetails() {
        System.out.println("reviseOrderDetails");
        int orderNum = 0;
        Application instance = null;
        Order expResult = null;
        Order result = instance.reviseOrderDetails(orderNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testMonitorOrder() {
        System.out.println("monitorOrder");
        int orderNum = 0;
        Application instance = null;
        OrderCustomerInt expResult = null;
        OrderCustomerInt result = instance.monitorOrder(orderNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testChangeOrderStatus() {
        System.out.println("changeOrderStatus");
        int orderNum = 0;
        Application instance = null;
        boolean expResult = false;
        boolean result = instance.changeOrderStatus(orderNum);
        assertEquals(expResult, result);
    }
    @Test
    public void testViewPendingOrders() {
        System.out.println("viewPendingOrders");
        Application instance = null;
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.viewPendingOrders();
        assertEquals(expResult, result);
    }
    @Test
    public void testDeleteOrder() {
        System.out.println("deleteOrder");
        int orderNum = 0;
        Application instance = null;
        boolean expResult = false;
        boolean result = instance.deleteOrder(orderNum);
        assertEquals(expResult, result);
    }
    @Test
    public void testViewRecentOrders() {
        System.out.println("viewRecentOrders");
        String customerName = "";
        Application instance = null;
        ArrayList<OrderCustomerInt> expResult = null;
        ArrayList<OrderCustomerInt> result = instance.viewRecentOrders(customerName);
        assertEquals(expResult, result);
    }
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        String username = "";
        Application instance = null;
        boolean expResult = false;
        boolean result = instance.deleteAccount(username);
        assertEquals(expResult, result);
    }
    @Test
    public void testEditAccount() {
        System.out.println("editAccount");
        String email = "";
        String phone = "";
        String address = "";
        Payment payment = null;
        int ID = 0;
        String username = "";
        String name = "";
        String password = "";
        Application instance = null;
        Customer expResult = null;
        Customer result = instance.editAccount(email, phone, address, payment, ID, username, name, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testAddFeedback() {
        System.out.println("addFeedback");
        int orderNum = 0;
        String Complain = "";
        int rate = 0;
        String username = "";
        Application instance = null;
        instance.addFeedback(orderNum, Complain, rate, username);
    }
    @Test
    public void testMakeNewOrder_String_ArrayList() {
        System.out.println("makeNewOrder");
        String username = "";
        ArrayList<Item> orderItems = null;
        Application instance = null;
        Bill expResult = null;
        Bill result = instance.makeNewOrder(username, orderItems);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetFeedbacks() {
        System.out.println("getFeedbacks");
        Application instance = null;
        ArrayList<Feedback> expResult = null;
        ArrayList<Feedback> result = instance.getFeedbacks();
        assertEquals(expResult, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

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
public class RestaurantTest {
    @Test
    public void testAddNewRestaurant() {
        System.out.println("addNewRestaurant");
        String name = "KFC";
        int minimumOrderItems =2;
        int deliveryTime = 10;
        Menu menu = new Menu();
        Restaurant instance = null;
        instance.addNewRestaurant(name, minimumOrderItems, deliveryTime, menu);
    }

    @Test
    public void testRemoveRestaurant() {
        System.out.println("removeRestaurant");
        Menu m=new Menu();
        Restaurant instance = new Restaurant("kfc", 2, 10,m );
        instance.removeRestaurant();

    }

   
    
}

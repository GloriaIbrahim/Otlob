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
public class OrderTest {
    
    @Test
    public void testSetItems() {
        System.out.println("setItems");
        ArrayList<Item> items = new ArrayList<Item>();
        Food f= new Food("pasta",10,2);
        Item i = new Item( f, 1,3);
        items.add(i);
        Order instance = new Order();
        instance.setItems(items);
    }

    @Test
    public void testChangePaymentMethod() {
        System.out.println("changePaymentMethod");
        Payment payment = null;
        Order instance = new Order();
        instance.changePaymentMethod(payment);
    }
    @Test
    public void testAddNewItem() {
        System.out.println("addNewItem");
        Food f= new Food("pasta",10,2);
        Item item = new Item( f, 1,3);
        Order instance = new Order();
        instance.addNewItem(item);
    }

    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        String itemName = "pasta";
        Order instance = new Order();
        instance.removeItem(itemName);
    }


    @Test
    public void testMakeNewOrder() {
        System.out.println("makeNewOrder");
        boolean status = false;
        ArrayList<Item> items = new ArrayList<Item>();
        Food f= new Food("pasta",10,2);
        Item i = new Item( f, 1,3);
        items.add(i);
        Feedback orderFeedback = new Feedback(2, "gyhgv",5, "meran", "01063009917");
        CustomerObserver customer= null;
        ArrayList<CustomerServiceObserver> customerServices = null;
        String location = "obour";
        Payment payment = null;
        int orderNum = 2;
        Order instance = new Order();
        instance.makeNewOrder(status, items, orderFeedback, customer, customerServices, location, payment, orderNum);
    }
    @Test
    public void testMonitorOrder() {
        System.out.println("monitorOrder");
        Order instance = new Order();
        OrderCustomerInt expResult = null;
        OrderCustomerInt result = instance.monitorOrder();
        assertEquals(expResult, result);
    }
    @Test
    public void testDeleteOrder() {
        System.out.println("deleteOrder");
        Order instance = new Order();
        instance.deleteOrder();

    }
    @Test
    public void testNotifyAllCustomerServices() {
        System.out.println("notifyAllCustomerServices");
        Order instance = new Order();
        instance.notifyAllCustomerServices();
    }
    
}

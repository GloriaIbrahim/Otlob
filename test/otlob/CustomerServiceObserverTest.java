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
public class CustomerServiceObserverTest {
    
    public CustomerServiceObserverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetNotification() {
        System.out.println("getNotification");
        String notification = "";
        CustomerServiceObserver instance = new CustomerServiceObserverImpl();
        instance.getNotification(notification);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        CustomerServiceObserver instance = new CustomerServiceObserverImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    public class CustomerServiceObserverImpl implements CustomerServiceObserver {

        public void getNotification(String notification) {
        }

        public String getName() {
            return "";
        }
    }

    
}

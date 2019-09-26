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
public class CustomerObserverTest {
    
    public CustomerObserverTest() {
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
    public void testGetStatusChangeNotification() {
        System.out.println("getStatusChangeNotification");
        String notification = "";
        CustomerObserver instance = new CustomerObserverImpl();
        instance.getStatusChangeNotification(notification);

    }

    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        CustomerObserver instance = new CustomerObserverImpl();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPayment() {
        System.out.println("getPayment");
        CustomerObserver instance = new CustomerObserverImpl();
        Payment expResult = null;
        Payment result = instance.getPayment();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetID() {
        System.out.println("getID");
        CustomerObserver instance = new CustomerObserverImpl();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        CustomerObserver instance = new CustomerObserverImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        CustomerObserver instance = new CustomerObserverImpl();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }

    public class CustomerObserverImpl implements CustomerObserver {

        public void getStatusChangeNotification(String notification) {
        }

        public String getAddress() {
            return "";
        }

        public Payment getPayment() {
            return null;
        }

        public int getID() {
            return 0;
        }

        public String getName() {
            return "";
        }

        public String getPhone() {
            return "";
        }
    }    
}

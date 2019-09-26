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
public class CustomerServiceTest {
   
    @Test
    public void testGetNotification() {
        System.out.println("getNotification");
        String notification = "";
        CustomerService instance = null;
        instance.getNotification(notification);
    }    
}

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
public class CashTest {
    @Test
    public void testGetPaymentMethod() {
        System.out.println("getPaymentMethod");
        Cash instance = new Cash();
        String expResult = "Pay on Delivery";
        String result = instance.getPaymentMethod();
        assertEquals(expResult, result);

    }
    
}

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
public class PayPalTest {
   
   
    @Test
    public void testPay() {
        System.out.println("pay");
        String payment = "paypal";
        PayPal instance = new PayPal("13346");
        instance.pay(payment);
    }
    @Test
    public void testGetPaymentMethod() {
        System.out.println("getPaymentMethod");
        PayPal instance = new PayPal("13346");
        String expResult = "13346";
        String result = instance.getPaymentMethod();
        assertEquals(expResult, result);
    }
    
}

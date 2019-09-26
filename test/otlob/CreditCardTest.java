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
public class CreditCardTest {
    @Test
    public void testSetCreditCardNum() {
        System.out.println("setCreditCardNum");
        String creditCardNum = "123412341234";
        CreditCard instance = new CreditCard("123412341234");
        instance.setCreditCardNum(creditCardNum);
    }
    @Test
    public void testGetCreditCardNum() {
        System.out.println("getCreditCardNum");
        CreditCard instance = new CreditCard("123412341234");
        String expResult = "123412341234";
        String result = instance.getCreditCardNum();
        assertEquals(expResult, result);
    }
    @Test
    public void testPay() {
        System.out.println("pay");
        String payment = "CreditCard";
        CreditCard instance = new CreditCard("123412341234");
        instance.pay(payment);
    }
    @Test
    public void testGetPaymentMethod() {
        System.out.println("getPaymentMethod");
        CreditCard instance = new CreditCard("123412341234");
        String expResult = "CreditCard";
        String result = instance.getPaymentMethod();
        assertEquals(expResult, result);
    }  
}

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
public class FeedbackTest {
        @Test
    public void testSetOrderNum() {
        System.out.println("setOrderNum");
        int OrderNum = 4;
        Feedback instance = new Feedback (0, "wsqwns", 5, "engy", "0106300917");
        instance.setOrderNum(OrderNum);

    }

    @Test
    public void testSetComplain() {
        System.out.println("setComplain");
        String Complain = "jkhjkn";
        Feedback instance = new Feedback (1, "", 5, "engy", "0106300917");
        instance.setComplain(Complain);

    }

    @Test
    public void testSetResturantRate() {
        System.out.println("setResturantRate");
        int ResturantRate = 5;
        Feedback instance = new Feedback (1, "wsqwns", 0, "engy", "0106300917");
        instance.setResturantRate(ResturantRate);

    }

    @Test
    public void testSetCustomerName() {
        System.out.println("setCustomerName");
        String CustomerName = "engy";
        Feedback instance = new Feedback (1, "wsqwns", 5, "", "0106300917");
        instance.setCustomerName(CustomerName);
    }

    @Test
    public void testSetCustomerPhone() {
        System.out.println("setCustomerPhone");
        String CustomerPhone = "01063009917";
        Feedback instance = new Feedback (1, "wsqwns", 5, "engy", "") ;
        instance.setCustomerPhone(CustomerPhone);
    }

    @Test
    public void testGetOrderNum() {
        System.out.println("getOrderNum");
        Feedback instance = null;
        int expResult = 0;
        int result = instance.getOrderNum();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetComplain() {
        System.out.println("getComplain");
        Feedback instance = null;
        String expResult = "";
        String result = instance.getComplain();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetResturantRate() {
        System.out.println("getResturantRate");
        Feedback instance = null;
        int expResult = 0;
        int result = instance.getResturantRate();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetCustomerName() {
        System.out.println("getCustomerName");
        Feedback instance = null;
        String expResult = "";
        String result = instance.getCustomerName();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCustomerPhone() {
        System.out.println("getCustomerPhone");
        Feedback instance = null;
        String expResult = "";
        String result = instance.getCustomerPhone();
        assertEquals(expResult, result);
    }
    @Test
    public void testFillForm() {
        System.out.println("fillForm");
        int OrderNum = 1;
        String Complain = "no complain";
        int ResturantRate = 5;
        String CustomerName = "engy";
        String CustomerPhone = "01063009917";
        Feedback instance = null;
        instance.fillForm(OrderNum, Complain, ResturantRate, CustomerName, CustomerPhone);
    }
    
}

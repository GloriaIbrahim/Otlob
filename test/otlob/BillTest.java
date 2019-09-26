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
public class BillTest {
    @Test
    public void testGetCustomerName() {
        System.out.println("getCustomerName");
        Bill instance = new Bill(1, "obour", 2,"meran");
        String expResult = "meran";
        String result = instance.getCustomerName();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetID() {
        System.out.println("getID");
        Bill instance = new Bill(1, "obour", 2,"meran");
        int expResult = 1;
        int result = instance.getID();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetOrderNum() {
        System.out.println("getOrderNum");
        Bill instance = new Bill(1, "obour", 2,"meran");
        int expResult = 1;
        int result = instance.getOrderNum();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Bill instance = new Bill(1, "obour", 2,"meran");
        String expResult = "obour";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Bill instance = new Bill(1, "obour", 2,"meran");
        float expResult = 2;
        float result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }    
}

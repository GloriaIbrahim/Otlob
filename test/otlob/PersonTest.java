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
public class PersonTest {
    
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "wafaa";
        String password = "123456789";
        Person instance = new Person("wafaa","123456789","wafaa") {};
        Person expResult = null;
        Person result = instance.login(username, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckValidation() {
        System.out.println("checkValidation");
        String username = "wafaa";
        String password = "123456";
        Person instance = new Person("wafaa","123456789","wafaa") {};
        boolean expResult = false;
        boolean result = instance.checkValidation(username, password);
        assertEquals(expResult, result);
    }

   
    
}

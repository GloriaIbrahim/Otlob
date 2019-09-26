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
import otlob.*;

/**
 *
 * @author 
 */
public class AdminTest {

    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Admin expResult =null;
        Admin result = Admin.getInstance();
        assertEquals(expResult, result);
    }   
}

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
public class FoodTest {
    
    @Test
    public void testRemoveComponent() {
        System.out.println("removeComponent");
        String name = "pasta";
        Food instance = new Food("pasta",10,2);
        instance.removeComponent(name);
    }
    @Test
    public void testEditComponent() {
        System.out.println("editComponent");
        String name = "pasta";
        float price = 10F;
        Food instance = new Food("pasta",10,2);
        instance.editComponent(name, price);

    }

    
}

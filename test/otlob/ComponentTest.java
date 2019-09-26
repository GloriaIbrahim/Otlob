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
public class ComponentTest {
    @Test
    public void testGetComponent() {
        System.out.println("getComponent");
        String name = "";
        Component instance = new ComponentImpl();
        Component expResult = null;
        Component result = instance.getComponent(name);
        assertEquals(expResult, result);
    }
    @Test
    public void testAddNewComponent() {
        System.out.println("addNewComponent");
        Component component = null;
        Component instance = new ComponentImpl();
        instance.addNewComponent(component);
    }
    @Test
    public void testRemoveComponent() {
        System.out.println("removeComponent");
        String name = "";
        Component instance = new ComponentImpl();
        instance.removeComponent(name);
    }
    @Test
    public void testEditComponent() {
        System.out.println("editComponent");
        String name = "";
        float price = 0.0F;
        Component instance = new ComponentImpl();
        instance.editComponent(name, price);
    }
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Component instance = new ComponentImpl();
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Component instance = new ComponentImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetType() {
        System.out.println("getType");
        Component instance = new ComponentImpl();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        Component instance = new ComponentImpl();
        instance.setPrice(price);
    }

    public class ComponentImpl implements Component {

        public Component getComponent(String name) {
            return null;
        }

        public void addNewComponent(Component component) {
        }

        public void removeComponent(String name) {
        }

        public void editComponent(String name, float price) {
        }

        public float getPrice() {
            return 0.0F;
        }

        public String getName() {
            return "";
        }

        public String getType() {
            return "";
        }

        public void setPrice(float price) {
        }
    }

    
    
}

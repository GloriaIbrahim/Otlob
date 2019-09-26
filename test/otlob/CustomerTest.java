/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

import java.util.ArrayList;
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
public class CustomerTest {
    
    public CustomerTest() {
    }
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Customer instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Customer instance = null;
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Customer instance = null;
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPayment() {
        System.out.println("getPayment");
        Customer instance = null;
        Payment expResult = null;
        Payment result = instance.getPayment();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetID() {
        System.out.println("getID");
        Customer instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        Customer instance = null;
        ArrayList<OrderCustomerInt> expResult = null;
        ArrayList<OrderCustomerInt> result = instance.getOrders();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "meran@gmail.com";
        Customer instance = new Customer("", "01063009917", "obour", null, 
            148368, null, "meran", "123456789", "meran");
        instance.setEmail(email);
    }

    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "01063009917";
        Customer instance = new Customer("meran@gmail.com", "", "obour", null, 
            148368, null, "meran", "123456789", "meran");
        instance.setPhone(phone);
    }

    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "obour";
        Customer instance = new Customer("meran@gmail.com", "01063009917", "", null, 
            148368, null, "meran", "123456789", "meran");
        instance.setAddress(address);
    }
    @Test
    public void testSetPayment() {
        System.out.println("setPayment");
        Payment payment = null;
        Customer instance = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "meran", "123456789", "meran");
        instance.setPayment(payment);
    }
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 148368;
        Customer instance = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            0, null, "meran", "123456789", "meran");
        instance.setID(ID);
    }

    @Test
    public void testSetOrders() {
        System.out.println("setOrders");
        ArrayList<OrderCustomerInt> Orders = null;
        Customer instance = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "meran", "123456789", "meran");;
        instance.setOrders(Orders);
    }

    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Customer instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "meran";
        Customer instance = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "", "123456789", "meran");
        instance.setUsername(username);
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Customer instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "123456789";
        Customer instance = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "meran", "", "meran");;
        instance.setPassword(password);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "meran";
        Customer instance = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "meran", "123456789", "");;
        instance.setName(name);
    }

    @Test
    public void testAddNewOrder() {
        System.out.println("addNewOrder");
        OrderCustomerInt order = null;
        Customer instance = null;
        instance.addNewOrder(order);
    }

    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        int orderNum = 0;
        Customer instance = null;
        OrderCustomerInt expResult = null;
        OrderCustomerInt result = instance.getOrder(orderNum);
        assertEquals(expResult, result);
    }
    @Test
    public void testRegister() {
        System.out.println("register");
        String email = "meran@gmail.com";
        String phone = "01063009971";
        String address = "obour";
        Payment payment = null;
        int ID = 148368;
        String name = "meran";
        String username = "meran";
        String password = "1234456789";
        Customer instance = null;
        instance.register(email, phone, address, payment, ID, name, username, password);
    }
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        String username = "meran";
        String password = "123456789";
        Customer instance = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "meran", "123456789", "meran");
        instance.deleteAccount(username, password);
    }
  

    @Test
    public void testViewAccount() {
        System.out.println("viewAccount");
        Customer instance = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "meran", "123456789", "meran");
        Customer expResult = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "meran", "123456789", "meran");
        Customer result = instance.viewAccount();
        assertEquals(expResult, result);
    }

    @Test
    public void testEditProfile() {
        System.out.println("editProfile");
        String email = "meran@gmail.com";
        String phone = "01063009917";
        String address = "obour";
        Payment payment = null;
        int ID = 148368;
        String username = "meran";
        String name = "meran";
        String password = "123456789";
        Customer instance = null;
        Customer expResult = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "meran", "123456789", "meran");
        Customer result = instance.editProfile(email, phone, address, payment, ID, username, name, password);
        assertEquals(expResult, result);
    }

    @Test
    public void testViewPendingOrders() {
        System.out.println("viewPendingOrders");
        Customer instance = new Customer("meran@gmail.com", "01063009917", "obour", null, 
            148368, null, "meran", "123456789", "meran");
        ArrayList<OrderCustomerInt> expResult = null;
        ArrayList<OrderCustomerInt> result = instance.viewPendingOrders();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetStatusChangeNotification() {
        System.out.println("getStatusChangeNotification");
        String notification = "";
        Customer instance = null;
        instance.getStatusChangeNotification(notification);
    }
    
}

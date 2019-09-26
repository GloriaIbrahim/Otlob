/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public interface OrderCustomerInt 
{
    public boolean getStatus();
    public void setFeedback(Feedback orderFeedback);
    public Feedback getFeedback();
    public Bill getBill();
    public int getOrderNum();
    public void changeLocation(String location);
    public void changePaymentMethod(Payment payment);
    public void addNewItem(Item item);
    public void makeNewOrder(boolean status, ArrayList<Item> items, Feedback orderFeedback, CustomerObserver customer, ArrayList<CustomerServiceObserver> customerServices, String location, Payment payment, int orderNum);
    public OrderCustomerInt monitorOrder();
    public void deleteOrder();
    public String reviseOrderDetails();
    public void removeItem(String itemName);
}

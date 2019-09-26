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
public class Order implements OrderCustomerInt, OrderStatusSubject, NewOrderSubject
{
    private boolean status;
    private ArrayList<Item> items;
    private Feedback orderFeedback;
    private CustomerObserver customer;
    private ArrayList<CustomerServiceObserver> customerServices;
    private String location;
    private Payment payment;
    private Bill bill;
    private int orderNum;

    public Order() 
    {
        this.customerServices = new ArrayList();
        this.items = new ArrayList();
        this.status = false;
        notifyAllCustomerServices();
    }

    public Order( ArrayList<Item> items, Feedback orderFeedback, CustomerObserver customer, ArrayList<CustomerServiceObserver> customerServices, String location, Payment payment, Bill bill, int orderNum) {
        this.status = false;
        this.items = items;
        this.orderFeedback = orderFeedback;
        this.customer = customer;
        this.customerServices = customerServices;
        this.location = location;
        this.payment = payment;
        this.bill = bill;
        this.orderNum = orderNum;
        notifyAllCustomerServices();
    }

    public Order(ArrayList<Item> items, CustomerObserver customer, ArrayList<CustomerServiceObserver> customerServices, String location, Payment payment, Bill bill, int orderNum) {
        this.items = items;
        this.customer = customer;
        this.customerServices = customerServices;
        this.location = location;
        this.payment = payment;
        this.bill = bill;
        this.orderNum = orderNum;
        this.status = false;
        notifyAllCustomerServices();
    }

    @Override
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
        notifyCustomer();
    }
    @Override
    public void notifyCustomer()
    {
        this.customer.getStatusChangeNotification("Order "+this.orderNum+" status has been changed to confirm");
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setCustomerServices(ArrayList<CustomerServiceObserver> customerServices) {
        this.customerServices = customerServices;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setBill() {
        float amount=0;
        for(int i=0;i<this.items.size();i++)
        {
            amount+=(this.items.get(i).getQuantity()*this.items.get(i).getFood().getPrice());
        }
        Bill bill=new Bill(this.orderNum,this.location,amount,this.customer.getName());
        this.bill=bill;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    @Override
    public Feedback getFeedback() {
        return orderFeedback;
    }

    @Override
    public void setFeedback(Feedback orderFeedback) {
        this.orderFeedback = orderFeedback;
    }

    @Override
    public Bill getBill() {
        return bill;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public CustomerObserver getCustomer() {
        return customer;
    }

    public ArrayList<CustomerServiceObserver> getCustomerServices() {
        return customerServices;
    }

    public String getLocation() {
        return location;
    }

    public Payment getPayment() {
        return payment;
    }
    @Override
    public void changeLocation(String location)
    {
        this.setLocation(location);
    }
    @Override
    public void changePaymentMethod(Payment payment)
    {
        this.setPayment(payment);
    }
    @Override
    public void addNewItem(Item item)
    {
        items.add(item);
    }
    @Override
    public void removeItem(String itemName){
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getFood().getName().equals(itemName))
                items.remove(items.get(i));
        }
    }
    @Override
    public String toString() {
        return "Order "+ "Num " + orderNum + "\nItems " + items + "\nOrder Feedback " + orderFeedback + "\nCustomer Name" + customer.getName() + "\nLocation " + location + "\nPayment " + payment + "\nBill " + bill  ;
    }
    
    @Override
    public void makeNewOrder(boolean status, ArrayList<Item> items, Feedback orderFeedback, CustomerObserver customer, ArrayList<CustomerServiceObserver> customerServices, String location, Payment payment, int orderNum)
    {
        this.setStatus(status);
        this.setBill();
        this.setCustomer(customer);
        this.setCustomerServices(customerServices);
        this.setItems(items);
        this.setLocation(location);
        this.setLocation(location);
        this.setFeedback(orderFeedback);
        this.setOrderNum(orderNum);
        this.setPayment(payment);
    }

    @Override
    public String reviseOrderDetails()
    {
        return this.toString();

    }
    @Override
    public OrderCustomerInt monitorOrder()
    {
      return this;
    }
    @Override
    public void deleteOrder()
    {
        this.status=false;
        this.customer=null;
        this.customerServices=null;
        this.items=null;
        this.location="";
        this.orderFeedback=null;
        this.orderNum=0;
        this.payment=null;
        this.bill=null;
    }

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public void setCustomer(CustomerObserver customer)
    {
            this.customer = customer;
    }
    
    
    @Override
    public void  addNewCustomerService(CustomerServiceObserver customerService)
    {
        customerServices.add(customerService);
    }
    @Override
    public void removeCustomerService(String name)
    {
        for (int i = 0; i < customerServices.size(); i++) {
            if(customerServices.get(i).getName().equals(name))
                customerServices.remove(customerServices.get(i));
        }
    }
    
    @Override
    public void notifyAllCustomerServices() {
        String notification = "new Order is made";
        for (int i = 0; i < customerServices.size(); i++) {
            customerServices.get(i).getNotification(notification);
        }
    }

    
}
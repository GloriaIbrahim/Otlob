/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

/**
 *
 * @author 
 */
public interface NewOrderSubject 
{
    public void notifyAllCustomerServices();
    public void addNewCustomerService(CustomerServiceObserver customerService);
    public void removeCustomerService(String name);
}

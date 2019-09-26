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
public interface CustomerObserver
{
    public void getStatusChangeNotification(String notification);
    public String getAddress();
    public Payment getPayment();
    public int getID();
    public String getName();
    public String getPhone();
}

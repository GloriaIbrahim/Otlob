/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

/**
 *
 * @author glori
 */
public interface Component {
    public Component getComponent(String name);
    public void addNewComponent(Component component);
    public void removeComponent(String name);
    public void editComponent(String name,float price);
    public float getPrice();
    public String getName();
    public String getType();
    public void setPrice(float price);
}

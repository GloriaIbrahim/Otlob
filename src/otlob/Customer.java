package otlob;
import java.util.*;

/**
 *
 * @author 
 */
public class Customer extends Person implements CustomerObserver{
    private String email;
    private String phone;
    private String address;
    private Payment payment;
    private int ID;
    private ArrayList <OrderCustomerInt> Orders; 

    public Customer(String email, String phone, String address, Payment payment, 
            int ID, ArrayList<OrderCustomerInt> Orders, String username, String password, String name) {
        super(username, password, name);
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.payment = payment;
        this.ID = ID;
        this.Orders = Orders;
    }

    public Customer(String email, String phone, String address, Payment payment, int ID, String username, String password, String name) {
        super(username, password, name);
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.payment = payment;
        this.ID = ID;
        this.Orders =new ArrayList<>();
    }
    
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Payment getPayment() {
        return payment;
    }

    @Override
    public int getID() {
        return ID;
    }

    public ArrayList<OrderCustomerInt> getOrders() {
        return Orders;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setOrders(ArrayList<OrderCustomerInt> Orders) {
        this.Orders = Orders;
    }
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public void addNewOrder(OrderCustomerInt order){
        this.Orders.add(order);
    }
    
    public OrderCustomerInt getOrder(int orderNum){
        OrderCustomerInt order=null;
        for(int i=0;i<this.Orders.size();i++)
        {
            if(Orders.get(i).getOrderNum()==orderNum)
                order=Orders.get(i);
        }
        return order;
    }
    
    public void register(String email, String phone, String address, Payment payment, 
            int ID , String name,String username, String password){
        setName(name);
        setPassword(password);
        setEmail(email);
        setPhone(phone);
        setAddress (address);
        setPayment(payment);
        setID(ID);
        setUsername(username);
    }   

    
    
    public void deleteAccount(String username,String password){
        if(this.checkValidation(username, password))
        {
            setName(null);
            setPassword(null);
            setEmail(null);
            setPhone(null);
            setAddress (null);
            setPayment(null);
            setID(0);
            setOrders(null);     
            setUsername(null);
        }
    }

    @Override
    public String toString() {
        return "Name " +name+"\nEmail " + email + "\nPhone " + phone + "\nAddress " + address + "\nPayment " + payment + "\nID " + ID + "\nOrders " + Orders+"\n" ;
    }
    
    public Customer viewAccount()
    {
        return this;
    }
    
    public Customer editProfile(String email, String phone, String address, Payment payment, int ID, String username, String name, String password)
    {
        setName(name);
        setPassword(password);
        setEmail(email);
        setPhone(phone);
        setAddress (address);
        setPayment(payment);
        setID(ID);
        setUsername(username);
        return this;
        
    }
    public ArrayList <OrderCustomerInt> viewPendingOrders ()
    {
        ArrayList<OrderCustomerInt> pendingOrders=new ArrayList<>();
        for(int i=0;i<this.Orders.size();i++)
        {
            if(!Orders.get(i).getStatus())
                pendingOrders.add(Orders.get(i));
        }
        return pendingOrders;
    }
    
    @Override
    public void getStatusChangeNotification(String notification){
        
    }

}



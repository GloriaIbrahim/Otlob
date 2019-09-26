package otlob;
public class CustomerService extends Person implements CustomerServiceObserver{
    
    public CustomerService(String username, String password, String name) {
        super(username, password, name);
    }
    
    @Override
    public void getNotification(String notification) {
        
    }

    @Override
    public String toString() {
        return "Customer Service " +"Name " +name+"\nUsername " +username+ '\n';
    }
    
}

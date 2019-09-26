
package otlob;


public class Cash implements Payment {
    
    @Override
    
    public void pay(String payment) {
        
    }

    @Override
    public String getPaymentMethod() {
        return "Pay on Delivery";
    }

    @Override
    public String toString() {
        return "Pay on Delivery";
    }
    
}

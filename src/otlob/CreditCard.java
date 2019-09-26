
package otlob;

public class CreditCard implements Payment {
   private String creditCardNum;

    public void setCreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }
    
    public String getCreditCardNum() {
        return creditCardNum;
    }

    public CreditCard(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }
     
    @Override
    public void pay(String payment) {
        creditCardNum=payment;
    }

    @Override
    public String getPaymentMethod() {
            return creditCardNum;
    }

    
    
}

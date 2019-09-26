
package otlob;


public class PayPal implements Payment {
    private String paypalNum;

    public void setPaypalNum(String paypalNum) {
        this.paypalNum = paypalNum;
    }

    public PayPal(String paypalNum) {
        this.paypalNum = paypalNum;
    }

    public String getPaypalNum() {
        return paypalNum;
    }
    

    

    @Override
    public void pay(String payment) {
        paypalNum=payment;
    }

    @Override
    public String getPaymentMethod() {
        if(paypalNum.length()!=16)
            return "Invalid Credit Card Number";
        else
        {
            return paypalNum;
        }
    }
    
}

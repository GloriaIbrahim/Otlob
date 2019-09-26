
package otlob;

public class Feedback {
    private int OrderNum;
    private String Complain;
    private int ResturantRate;
    private String CustomerName;
    private String CustomerPhone;
    

    public Feedback(int OrderNum, String Complain, int ResturantRate, String CustomerName, String CustomerPhone) {
        this.OrderNum = OrderNum;
        this.Complain = Complain;
        this.ResturantRate = ResturantRate;
        this.CustomerName = CustomerName;
        this.CustomerPhone = CustomerPhone;
    }

    public void setOrderNum(int OrderNum) {
        this.OrderNum = OrderNum;
    }

    public void setComplain(String Complain) {
        this.Complain = Complain;
    }

    public void setResturantRate(int ResturantRate) {
        this.ResturantRate = ResturantRate;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setCustomerPhone(String CustomerPhone) {
        this.CustomerPhone = CustomerPhone;
    }
    

    public int getOrderNum() {
        return OrderNum;
    }

    public String getComplain() {
        return Complain;
    }

    public int getResturantRate() {
        return ResturantRate;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    @Override
    public String toString() {
        return "Feedback\n" + "Order Number" + OrderNum + "\nComplain " + Complain + "\nResturant Rate " + ResturantRate + "\nCustomer Name " + CustomerName + "\nCustomer Phone " + CustomerPhone ;
    }
    
    
    
    
    public void fillForm(int OrderNum, String Complain, int ResturantRate, String CustomerName, String CustomerPhone) {
        this.setComplain(Complain);
        this.setCustomerName(CustomerName);
        this.setCustomerPhone(CustomerPhone);
        this.setOrderNum(OrderNum);
        this.setResturantRate(ResturantRate);
    }








}

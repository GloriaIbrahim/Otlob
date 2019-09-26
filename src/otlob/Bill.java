
package otlob;

public class Bill {
    private static int ID=0;
    private final int OrderNum;
    private final String Location;
    private final float Amount;
    private final String CustomerName;

    public Bill( int OrderNum, String Location, float Amount,String CustomerName) {
        Bill.ID += 1;
        this.OrderNum = OrderNum;
        this.Location = Location;
        this.Amount = Amount;
        this.CustomerName=CustomerName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public int getID() {
        return ID;
    }

    public int getOrderNum() {
        return OrderNum;
    }

    public String getLocation() {
        return Location;
    }

    public float getAmount() {
        return Amount;
    }

    @Override
    public String toString() {
        return "Bill\n" + "\nCustomer Name " + CustomerName +"Number " + ID + "\nOrder Number " + OrderNum + "\nLocation=" + Location + "\nAmount=" + Amount ;
    }

   

    
    

    
    
    
    
}

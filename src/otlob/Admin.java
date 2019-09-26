package otlob;
public class Admin extends Person {
    private static Admin applicationAdmin;

    private Admin() {
        super("wemg_esne", "1631202", "Wemg Esne");
    }

    public static Admin getInstance()
    {
        applicationAdmin=new Admin();
       return applicationAdmin;
    }
     
}

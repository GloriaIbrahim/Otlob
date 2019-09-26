package otlob;
public abstract class Person {
    protected String username;
    protected String password;
    protected String name;

    public Person(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Person login (String username, String password){
        if (checkValidation (username,password) == true)
        {
            return this;
        }
        else {return null;}
    }
    public boolean checkValidation (String username, String password)
    {
        if ( this.username.equals(username) &&  this.password.equals(password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}

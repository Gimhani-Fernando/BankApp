
public class Customer{
    private String name;
    public double initial_amount;
    
    public String getName() {
        return this.name;
    }
  

    public double getInit() {
        return this.initial_amount;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setInit(double initial_amount) {
        this.initial_amount = initial_amount;
    }
    
}
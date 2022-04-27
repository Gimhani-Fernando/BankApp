public class Customer{
    private String name;
    //private int account_num;
    public float initial_amount;
    
    public String getName() {
        return this.name;
    }
    
    public float getInito() {
        return this.initial_amount;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setInit(float initial_amount) {
        this.initial_amount = initial_amount;
    }
    
}
import java.util.Scanner;
public class Account {
    private String name;
    private String NIC;
    private float initial_amount;
    private int ac_num=0;

    public void setData(){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your full name");
            this.name=sc.next();
            System.out.println("Enter your NIC number");
            this.NIC=sc.next();
            boolean init_bool=true;
        
            while(init_bool){
                System.out.println("Enter the initial amount you wish to provide");
                float init=sc.nextFloat(); 

                if(init>=500){
                    System.out.println("Account is successfully created");
                    this.initial_amount=sc.nextFloat(); init_bool=false;

                }else{
                    System.out.println("Please provide an initial amount more than or equal to 500");
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    public void getData(){
        System.out.println("\nAccount number "+ac_num+" details");
        System.out.println("Account holder details: ");
        System.out.println("NIC: "+this.NIC+"\nName: "+this.name);
    }
}

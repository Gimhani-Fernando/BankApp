import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Account {
    private String name;
    private String NIC;
    private float initial_amount;
    private int ac_num=0;
    Scanner sc=new Scanner(System.in);
      // Here i am going to create Map in java for stroing data temperory
      Map<String,List> Database=new HashMap();
      // temprary List 
      List tempList=new ArrayList<>();

    public void setData(){
        try{
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
                    this.initial_amount=init;
                    init_bool=false;

                }else{
                    System.out.println("Please provide an initial amount more than or equal to 500");
                }
            }
            sc.close();
            //Set those data into the Database
            tempList.add(this.name);
            tempList.add(this.initial_amount);
            Database.put(this.NIC, tempList);
            tempList.clear();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void getData(){
        String askID;
        // System.out.println("\nAccount number "+ac_num+" details");
        // System.out.println("Account holder details: ");
        // System.out.println("NIC: "+this.NIC+"\nName: "+this.name);


        // Get data from Map and going to print
        System.out.println("Enter your correct NIC number");
        askID=sc.nextLine();
        if (Database.containsKey(askID)){
            System.out.println("\nWelcome you are my customer and Your Details are\n");
            System.out.println("Your name is :"+Database.get(askID).get(0)+"\n"+"Your balance is:-"+Database.get(askID).get(1));

        }
    }
}
/*import java.util.Scanner;
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
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Bank {
    private String name;
    private String NIC;
    private float initial_amount;
    private int ac_num=0;

    Map<String,List<String>> Database=new HashMap<>();
    List tempList=new ArrayList<>();

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
                    this.initial_amount=init; init_bool=false;

                }else{
                    System.out.println("Please provide an initial amount more than or equal to 500");
                }
            }
            tempList.add(this.name);
            tempList.add(this.initial_amount);
            Database.put(this.NIC, tempList);
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    public void getData(){
        try{
            Scanner c=new Scanner(System.in);

            String askID;

            // Get data from Map and going to print
            System.out.println("Enter your correct NIC number");
            askID=c.nextLine();
            if (Database.containsKey(askID)){
                System.out.println("\nWelcome you are my customer and Your Details are\n");
                System.out.println("Your name is :-"+Database.get(askID).get(0));
                System.out.printf("Your balance is :-%.3f",Database.get(askID).get(1));
               
               
            }
           
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    void closeAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your NIC for closing accout");
        String Nic=sc.nextLine();
        System.out.println(Nic);
        if(Database.containsKey(Nic)){
            System.out.println("Your name is :-"+Database.get(Nic).get(0));
            System.out.printf("Your balance is :-%.3f",Database.get(Nic).get(1));
            System.out.println("\nWould you Like to close it type Yes to close account other wise type No");
            String temp=sc.nextLine();
            if(temp.equals("Yes")){
                Database.remove(Nic);
                System.out.println("Your account has been deleted from our database");
            }else{

                System.out.println("Okay bye");
            }

        }else{
            System.out.println("There is no account with this NIC");
        }

    }
}

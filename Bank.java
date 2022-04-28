import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Bank {
    // private String name;
    // private String NIC;
    // private double initial_amount;
    // private int ac_num=0;

    Map<String,Customer> Database=new HashMap<>();
    Scanner sc=new Scanner(System.in);

    public void setData(){

        try{
            Customer e=new Customer();
            System.out.println("Enter your full name");
            String name=sc.next();
            System.out.println("Enter your NIC number");
            String NIC=sc.next();
            boolean init_bool=true;
           double initial_amount=0;
            while(init_bool){
                System.out.println("Enter the initial amount you wish to provide");
                double init=sc.nextDouble(); 

                if(init>=500){
                    initial_amount=init;
                    System.out.println("Account is successfully created");
                    init_bool=false;

                }else{
                    System.out.println("Please provide an initial amount more than or equal to 500");
                }
            }
           
           e.setName(name);
           e.setInit(initial_amount);
           Database.put(NIC, e);
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    public void getData(){
        try{
            

            String askID;

            // Get data from Map and going to print
            System.out.println("Enter your correct NIC number");
            askID=sc.nextLine();
            if (Database.containsKey(askID)){
                System.out.println("\nWelcome you are my customer and Your Details are\n");
                System.out.println("Your name is :-"+Database.get(askID).getName());
                System.out.printf("Your balance is :-%.3f",Database.get(askID).getInito());
               
               
            }else{
                System.out.println("\nThere is no account with this Nic number");
            }
           
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    void closeAccount(){
      
        System.out.println("Enter Your NIC for closing accout");
        
        String Nic=sc.next();
        if(Database.containsKey(Nic)){
            System.out.println("Your name is :-"+Database.get(Nic).getName());
            System.out.printf("Your balance is :-%.3f",Database.get(Nic).getInito());
            System.out.println("\nWould you Like to close it type Yes to close account other wise type No");
            String temp=sc.next();
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
  void withdraw(){
    System.out.println("Enter your valid NIC number to access your account?");
    String Nic=sc.next();

      if(Database.containsKey(Nic)){
          double currAm=Database.get(Nic).getInito();
        System.out.println("Your name is :-"+Database.get(Nic).getName());
        System.out.printf("Your balance is :-%.3f",Database.get(Nic).getInito());
        System.out.println("\nEnter amount that you are going to withdraw?");
        double temp_amount=sc.nextDouble();
    
        if(Database.get(Nic).getInito()<temp_amount){
                System.out.println("There is no sufficient amount to withdraw");
        }else{
                currAm=temp_amount-Database.get(Nic).getInito();
                Database.get(Nic).setInit(currAm);
                System.out.println("Succesfully withdraw\n");
               System.out.printf("Your current balance is :-%.3f",currAm);
        }

      }else{
         
        System.out.println("There is no account with this NIC");

      }
  }

  void deposit(){
    System.out.println("Enter your valid NIC number to access your account?");
    String Nic=sc.next();

      if(Database.containsKey(Nic)){
          double currAm=Database.get(Nic).getInito();
        System.out.println("Your name is :-"+Database.get(Nic).getName());
        System.out.printf("Your balance is :-%.3f",Database.get(Nic).getInito());
        System.out.println("\nEnter amount that you are going to Deposite?");
        double temp_amount=sc.nextDouble();
    
        if(Database.get(Nic).getInito()<temp_amount){
                System.out.println("There is no sufficient amount to withdraw");
        }else{
                currAm=temp_amount+Database.get(Nic).getInito();
                Database.get(Nic).setInit(currAm);
                System.out.println("Succesfully deposit\n");
               System.out.printf("Your current balance is :-%.3f",currAm);
        }

      }else{
         
        System.out.println("There is no account with this NIC");

      }
  }

  void viewAccounts(){
    System.out.println("Enter your valid NIC number to access your account?");
    String Nic=sc.next();
    System.out.println("-------------Here our All custome details----------");
      if(Database.containsKey(Nic)){
            for(Customer val:Database.values()){
                System.out.println("-------------------------------------------------------");
                System.out.println("name is :-"+val.getName());
                System.out.printf("balance is :-%.3f",val.getInito());
                System.out.println("\n-------------------------------------------------------");
                
            }

      }else{
        System.out.println("There is no account with this NIC");
      }
  }

  void edit(){
    System.out.println("Enter your valid NIC number to access your account?");
    String Nic=sc.next();

      if(Database.containsKey(Nic)){
            System.out.println("You can only edit your name , can not edit your NIC ");
            System.out.println("Your name is :-"+Database.get(Nic).getName());
            System.out.printf("Your balance is :-%.3f",Database.get(Nic).getInito());
            System.out.println("\nWould you Like to edit your name if yes , type Yes otherwise type No");
            String temp=sc.next();
            if(temp.equals("Yes")){
                System.out.println("Type your new name?");
                String temp2=sc.next();
                Database.get(Nic).setName(temp2);
                System.out.println("Succesfully updated");

      }else{
            System.out.println("ok bye");
      }
  }else{
    System.out.println("There is no account with this NIC");
  }


}
}

import java.util.Scanner;
public class MyClass{
    public static void main(String args[]) {
        try{
            System.out.println(" Hello! Welcome to Bank Managment App\n ");
            showOptions();
            Scanner sc=new Scanner(System.in);
            int option = sc.nextInt();

            Bank BOC=new Bank();

            while(option!=0){
                switch(option){
                    case 1:
                        BOC.setData(); break;
                    case 2:
                        BOC.getData();break;
                    case 5:
                        BOC.closeAccount();
                    default:
                        System.out.println("Invalid option");
                }
                System.out.println("\n\nDo you wish to proceed? ");
                showOptions();
                option = sc.nextInt();
            }
            
            System.out.println("Thank you! Have a nice day...");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void showOptions(){
        System.out.println("\nEnter 1 to create new account");
        System.out.println("Enter 2 to view account holders record");
        System.out.println("Enter 3 to withdraw and deposit amount");
        System.out.println("Enter 4 to balance inquiry");
        System.out.println("Enter 5 to close an account");
        System.out.println("Enter 6 to edit account details");
        System.out.println("Enter 0 to exit");
    }
}
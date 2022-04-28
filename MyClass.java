import java.util.Scanner;
public class MyClass{
    public static void main(String args[]) {
        try{
            System.out.println("\n****************Hello! Welcome to Bank Managment App*******************");
            showOptions();
            Scanner sc=new Scanner(System.in);
            int option = sc.nextInt();

            Bank BOC=new Bank();

            while(option!=0){
                switch(option){
                    case 1:
                        BOC.setData(); 
                        break;
                    case 2:
                        BOC.getData();
                        break;
                    case 3:
                        BOC.withdraw();
                        break;
                    case 4:
                        BOC.deposit();
                        break;
                    case 5:
                        BOC.closeAccount();
                        break;
                    case 6:
                        BOC.edit();
                        break;
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
        System.out.println("Enter 1 to create new account");
        System.out.println("Enter 2 to view account holders record");
        System.out.println("Enter 3 to withdraw");
        System.out.println("Enter 4 to deposit");
        System.out.println("Enter 5 to close an account");
        System.out.println("Enter 6 to edit account details");
        System.out.println("Enter 0 to exit");
    }
}
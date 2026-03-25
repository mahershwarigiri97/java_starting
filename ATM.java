import java.util.*;

public class ATM {
    public static void main(){
        
        Scanner scanner=new Scanner(System.in);
        double balance=5000;
         

        while (true) {
            System.out.println("\nWelcome to the ATM ");
            System.out.println("1. check balance");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4. exit");
            System.out.print("choose an option:");

            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("your balance is:"+balance);
                    break;
                case 2:
                    System.out.println("enter amount to deposit:");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited:"+deposit);
                    break;
                case 3:
                    System.out.println("enter amount tom withdraw :");
                    double withdraw = scanner.nextDouble();
                    if(withdraw <= balance){
                        balance-=withdraw;
                        System.out.println("withdrew:"+withdraw);
                    } else{
                        System.out.println("insufficient funds!");

                        }
                      break;
                case 4 :
                    System.out.println("thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("invalid option . please tryb again.");

            }

        }

    }
}

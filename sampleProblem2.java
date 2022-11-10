import java.util.*;
public class sampleProblem2{
  public static void main (String[] args){

   Scanner sc = new Scanner(System.in);

   double balance = 1000;
   String transaction;

   System.out.print("Enter PIN: ");
   int pin = sc.nextInt();

   while(pin!=123456){
    System.out.println("**Invalid PIN**");
    System.out.print("Enter PIN: ");
    pin = sc.nextInt();
}

   if(pin==123456){
    while(true) {
        System.out.println("Please choose transaction: ");
        System.out.println("[W]- Withdraw");
        System.out.println("[D]- Deposit");
        System.out.println("[C]- Check balance");
        System.out.print("Enter here: ");
        String choose = sc.next();
        
        switch(choose){
            
            case "W":
            case "w":
            System.out.println("How much would you like to withdraw? ");
            double w = sc.nextDouble();
             if(w>balance){
                 System.out.println("**Insufficient balance**");
                 System.exit(0);
             }
             else{  
                double w1 = balance - w;
                System.out.println("Your remaining balance is: "+w1);
                System.out.println("You'll get "+w+" pesos");
                System.out.println("Do you want another transaction? ");
                transaction = sc.next();
                if(transaction.equalsIgnoreCase("no")){
                System.exit(0);
            }
            else if(transaction.equalsIgnoreCase("yes")){
                break;
            }
            else{
                System.out.println("Invalid input");
                System.exit(0);
             }
             }
             
            case "D":
            case "d":
            System.out.println("How much would you like to deposit? ");
            double d = sc.nextDouble();
            double d1 = balance + d;
            System.out.println("Your remaining balance is: "+d1);
            System.out.println(d+" was added");
            System.out.println("Do you want another transaction? ");
            transaction = sc.next();
            if(transaction.equalsIgnoreCase("no")){
                System.exit(0);
            }
            else if(transaction.equalsIgnoreCase("yes")){
                break;
            }
            else{
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            
            case "C":
            case "c":
            System.out.println("Your remaining balance is: "+balance);
            System.out.println("Do you want another transaction? ");
            transaction = sc.next();
            if(transaction.equalsIgnoreCase("no")){
                System.exit(0);
            }
            else if(transaction.equalsIgnoreCase("yes")){
                break;
            }
            else{
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            default:
            System.out.println("**Invalid input**");
            break;
        }

    }
}


  }
}
//finals sample problem #2

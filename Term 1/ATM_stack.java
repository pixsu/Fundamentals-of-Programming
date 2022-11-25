import java.util.*;
public class ATM_stack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String key = "y";
        double bal=0,balance = 1000;


        while(key.equalsIgnoreCase("y")){
            System.out.print("Enter PIN: ");
            int pin=sc.nextInt();
            int i=1, attempt=2;
            while(pin!=123456 && i<=attempt){
                System.out.println("Invalid PIN");
                System.out.print("Enter PIN: ");
                pin=sc.nextInt();
                i++;
            }

            if(pin==123456){
                System.out.println("Please choose transaction: ");
                System.out.println("[W] - WITHDRAW");
                System.out.println("[D] - DEPOSIT");
                System.out.println("[B] - BANK TRANSFER");
                System.out.println("[C] - CHECK BALANCE");
                System.out.print("Enter here: ");
                String trans = sc.next();

                while(!trans.equalsIgnoreCase("W") && !trans.equalsIgnoreCase("d") && !trans.equalsIgnoreCase("b") && !trans.equalsIgnoreCase("c")){
                    System.out.println("Invalid Input");
                    System.out.print("Enter here: ");
                    trans = sc.next();  
                }
                switch(trans){
                    case "W": case "w":
                    System.out.print("How much would you like to withdraw?: ");
                    double withdraw=sc.nextDouble();
                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();
                    while(i<=3){
                        if(pin!=123456){
                            System.out.println("Invalid PIN: ");
                            System.out.print("Enter PIN: ");
                            pin = sc.nextInt();
                            i++;
                        }
                        else if(pin==123456){
                            i += 3;
                        }
                        else{
                            System.out.println("System Timeout");
                            i++;
                        }
                    }
            
                    while(withdraw%100!=0){
                        System.out.println("Invalid Input");
                        System.out.print("How much would you like to withdraw?: ");
                        withdraw = sc.nextDouble();
                    }
                    if(withdraw>balance){
                        System.out.println("Insufficient balance");
                    }
                    else if(withdraw<balance){
                        bal = balance - withdraw;
                        System.out.println("You'll get "+withdraw);
                        System.out.println("Your remaining balance is: "+bal);
                    }
                    break;

                    case "d": case "D":
                    System.out.print("How much would you like to deposit: ");
                    double deposit = sc.nextDouble();
                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();
                    while(i<=3){
                        if(pin!=123456){
                            System.out.println("Invalid PIN: ");
                            System.out.print("Enter PIN: ");
                            pin = sc.nextInt();
                            i++;
                        }
                        else if(pin==123456){
                            bal = deposit + balance;
                            System.out.println(bal+" was added to your account");
                            System.out.println("Your new balance is: "+bal);
                            i += 3;
                        }
                        else{
                            System.out.println("System Timeout");
                            i++;
                        }
                    }
                    break;

                    case "b": case "B":
                    System.out.println("Account Number: ");
                    int accnum = sc.nextInt();
                    System.out.print("Account Name: ");
                    String accname = sc.nextLine();
                    System.out.println("Amount to transfer: ");
                    double amount = sc.nextDouble();
                    if(amount>balance){
                        System.out.println("Insufficient balance");
                    }
                    else{
                        System.out.println(amount+" was transferred");
                        bal = balance-amount;
                        System.out.println("Your remaining balance is: "+bal);
                    }
                    break;

                    case "c": case "C":
                    System.out.println("Balance: "+bal);
                    break;
                    
                    default:
                    System.out.println("Invalid Input");
                    break;
                }
                System.out.println("Do you want another transaction?[Y]/[N]");
                key = sc.next();
                
                while(!key.equalsIgnoreCase("y") && !key.equalsIgnoreCase("n")){
                    System.out.println("Invalid Input");
                    System.out.println("Do you want another transaction?[Y]/[N]");
                    key = sc.next();
                }
                if(key.equalsIgnoreCase("N")){
                    System.out.println("Thank you for banking with us!");
                    System.exit(0);
                }
                
            }
            else{
                System.out.println("Invalid PIN");
                System.exit(0);
            }
        }


    }
    
}
/* Create a program that will process basic transaction of an ATM. The program must have a withdrawal, deposit, balance check, and bank transfer.
* Default cash is 1000, the program must test if the PIN is correct; if the user tries to enter the incorrect pin three times, the program will be terminated.
* Take note that every transaction that you make needs to be entered with PIN once more and reflected or saved in your current balance.
* Ask if the user wants another transaction, if yes it will go back to the main menu. If no, the program will be terminated. **The withdrawal should be by hundreds only.
 * 
 * Sample output:
 * 
 * Enter PIN: 123
 * Invalid PIN
 * Enter PIN: 69
 * Invalid PIN
 * Enter PIN: 123456
 * 
 * Please choose transaction:
 * [W] - WITHDRAW
 * [D] - DEPOSIT
 * [B] - BANK TRANSFER
 * [C] - CHECK BALANCE
 * Enter here: w
 * 
 * How much would you like to withdraw?: 500
 * Enter PIN: 123456
 * You'll get 500 
 * Your remaining balance is: 500
 * Thank you for banking wih us!
 * Do you want another transaction?[Y]/[N]
 * Enter here: y
 * 
 * Enter PIN: 123456
 * 
 * Please choose transaction:
 * [W] - WITHDRAW
 * [D] - DEPOSIT
 * [B] - BANK TRANSFER
 * [C] - CHECK BALANCE
 * Enter here: b
 * 
 * Account number: 123
 * Account name: uwu
 * Amount to transfer: 700
 * Your remaining balance is: 800
 * Do you want another transaction?[Y]/[N]
 * Enter here: N
 * 
 * System terminated
 */

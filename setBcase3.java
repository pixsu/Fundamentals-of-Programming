import java.util.*;
public class setBcase3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double balance = 1000;

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

//declared the expected pin 
        if (pin==123456){
            
            System.out.println("Choose Transaction: ");
            System.out.println("[W]-Withdraw");
            System.out.println("[D]-Deposit");
            System.out.println("[C]-Check balance");
            System.out.print("Enter here: ");
            String enter = sc.next();
            
              //declared W to a String data type by using double quotations ""
                 if(enter.equalsIgnoreCase("W")){
                 System.out.println("How much would you like to withdraw?");
                 double w1 = sc.nextDouble();
// if w1 input is greater than the balance it will print Insufficient balance
                     if(w1>balance){
                     System.out.println("Insufficient balance");
                     System.out.println("Try again");
                     }
                     else {
                     double w2 = balance - w1;
                     System.out.println("Your remaining balance is: "+w2);
                     System.out.println("Thank you for banking with us!");
                     }
                    }
                else if(enter.equalsIgnoreCase("D")){
                System.out.println("How much would you like to deposit?");
                double d1 = sc.nextDouble();
                double d2 = balance + d1;
                System.out.println("Your remaining balance is: "+d2);
                System.out.println("Thank you for shopping with us!");
                }
                else if(enter.equalsIgnoreCase("C")){
                System.out.println("Your remaining balance is: "+balance);
                System.out.println("Thank you for banking with us!");
                }
                else  
                System.out.println("Invalid Input"); 
            }
        else{
            System.out.println("Invalid pin");
        }  
 
    }
    }
//Set B Case 3 hard
//Create a program that will process a basic transaction of an ATM. The program must have a withdrawal, deposit, and checking of balance. The default PIN is “123456”, the default cash on account is: 1000. 
//One transaction per execution of program to test. The program must test if the PIN is correct, it also check if the amount to withdraw is less than or equal to the current cash on account. 
//You can create your own message per test cases like: “Insufficient Fund”, “Incorrect PIN” etc

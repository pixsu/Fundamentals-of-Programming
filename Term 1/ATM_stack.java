import java.util.*;
public class ATM_stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int pin = 123456, bal=1000, x=1, y=1, z=1, enter, accnum;
        int [] num = {1,2,3};
        String ex, trans, accname;


        do {
            System.out.print("ENTER PIN: ");
            enter = sc.nextInt();
            if (enter==pin) {
                do {
                    System.out.println("Please choose transaction: ");
                    System.out.println("[W] - WITHDRAW");
                    System.out.println("[D] - DEPOSIT");
                    System.out.println("[B] - BANK TRANSFER");
                    System.out.println("[C] - CHECK BALANCE");
                    System.out.print("Enter here: ");
                    trans = sc.next();

                    switch (trans) {
                        case "W": case "w":
                            System.out.println("How much would you like to withdraw?: ");
                            num[0] = sc.nextInt();
                            if (num[0]%100!=0) {
                                while (num[0]%100!=0) {
                                    System.out.println("How much would you like to withdraw?: ");
                                    num[0] = sc.nextInt();
                                }
                            }
                            if (num[0] > bal) {
                                System.out.println("Insufficient Amount");
                            } 
                            else {
                                System.out.print("Enter PIN: ");
                                enter = sc.nextInt();
                                while (x<=3) {
                                    if (enter==pin) {
                                        bal = bal-num[0];
                                        System.out.println("Your remaining balance: " +bal);
                                        x += 3;
                                    } 
                                    else if (enter!=pin) {
                                        System.out.print("Invalid PIN, try again: ");
                                        enter = sc.nextInt();
                                        x++;
                                    }
                                    else{
                                        System.out.print ("SYSTEM TIMEOUT");
                                        x++;
                                    }   
                                }
                            }
                        break;

                        case "D": case "d":
                            System.out.print("How much would you like to deposit?: ");
                            num[1] = sc.nextInt();
                            System.out.print("Enter PIN: ");
                            enter = sc.nextInt();
                            while (y<=3) {
                                if (enter==pin) {
                                    bal = bal+num[1];
                                    System.out.println("Your remaining balance: " +bal);
                                    y += 3;
                                }
                                else if (enter!=pin) {
                                    System.out.print("Invalid PIN, try again: ");
                                    enter = sc.nextInt();
                                    y++;
                                }
                                else {
                                    System.out.print ("SYSTEM TIMEOUT");
                                    y++;
                                }
                            }
                        break;

                        case "B": case "b":
                            System.out.println("Account Number: ");
                            accnum = sc.nextInt();
                            System.out.println("Account Name: ");
                            accname = sc.next();
                            System.out.println("Amount to transfer: ");
                            num[2] = sc.nextInt();
                            if (num[2] > bal) {
                                System.out.println("Insufficient amount");
                            }
                            else {
                            bal = bal-num[2];
                            System.out.println("Balance: " +bal);
                            }
                        break;

                        case "C": case "c":
                                System.out.println("Your balance is: "+bal);
                        break;

                        default:
                            System.out.print("Invalid Input");
                        break;
                    }

                    System.out.print("Do you want another transaction?[Y]/[N]: ");
                    ex = sc.next();
                    
                }
                while (ex.equalsIgnoreCase("Y"));
                if (ex.equalsIgnoreCase("N")); {
                    System.out.println("Thank you for banking with us!");
                    break;
                }
            }
            else if (enter!=pin) {
                System.out.println("Invalid PIN");
                z++;
            }
        }
        while (z<=3);   
        System.out.println("SYSTEM TERMINATED");


    }
}


import java.util.*;
public class sampleProblem1 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        double[] price={15.00,50.00,25.00};
        String choose,order;
        
        System.out.println("Welcome to Java Store!");
        System.out.print("Enter customer's name: ");
        String name = sc.nextLine();
        while(true){
        System.out.println("Menu: ");
        System.out.println("[C]-Coffee=15.00");
        System.out.println("[M]-Milk=50.00");
        System.out.println("[T]-Tea=25.00 ");
        System.out.print("Enter order here: ");
        order = sc.next();
        
        switch(order){
            case "m":
            case "M":
            {
                System.out.print("How many orders of milk: ");
                double quantity = sc.nextDouble();
                double total = quantity * price[1];
                System.out.println("The total amount to be pay is: "+total);
                System.out.print("Enter payment: ");
                double payment = sc.nextDouble();

                if(total>=payment){
                    System.out.println("Insufficient funds!");
                    System.exit(0);
                }
                else{
                    double change = payment - total;
                    System.out.println("Your change is "+change+", thank you for ordering!");
                    System.out.print("Do you want another transaction? ");
                    choose = sc.next();
                    if(choose.equalsIgnoreCase("no")){
                        System.out.println("Thank you!");
                        System.exit(0);
                    }
                    else if(choose.equalsIgnoreCase("yes"))
                    break;
                    else {
                        System.out.println("Invalid input");
                        System.exit(0);
                    }
                }
            }

            case "C":
            case "c":
            {
                System.out.print("How many orders of coffee: ");
                double quantity = sc.nextDouble();
                double total= quantity * price[0];
                System.out.println("The total amount to be pay is: "+total);
                System.out.print("Enter payment: ");
                double payment = sc.nextDouble();

                if(total>=payment){
                    System.out.println("Insufficient funds!");
                    System.exit(0);
                }
                else{
                    double change = payment - total;
                    System.out.println("Your change is "+change+", thank you for ordering!");
                    System.out.print("Do you want another transaction? ");
                    choose = sc.next();
                    if(choose.equalsIgnoreCase("no")){
                        System.out.println("Thank you!");
                        System.exit(0);
                    }
                    else if(choose.equalsIgnoreCase("yes"))
                    break;
                    else{
                        System.out.println("Invalid input");
                        System.exit(0);
                    }

                }
            }

            case "T":
            case "t":
            {
                System.out.print("How many orders of tea: ");
                double quantity = sc.nextDouble();
                double total = quantity * price[2];
                System.out.println("The total amount to be pay is: "+total);
                System.out.print("Enter payment: ");
                double payment = sc.nextDouble();

                if(total>=payment){
                    System.out.println("Insufficient funds!");
                    System.exit(0);
                }
                else{
                    double change =payment - total;
                    System.out.println("Your change is "+change+", thank you for ordering!");
                    System.out.print("Do you want another transaction? ");
                    choose = sc.next();
                    if(choose.equalsIgnoreCase("no")){
                        System.out.println("Thank you!");
                        System.exit(0);
                    }
                    else if(choose.equalsIgnoreCase("yes"))
                    break;
                    else{
                        System.out.println("Invalid input");
                        System.exit(0);            
                    }
                }
            }
            default:
            System.out.println("Invalid input!");

        }        
    }


    } 
}
//finals sample problem #1 

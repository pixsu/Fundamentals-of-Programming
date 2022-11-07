import java.util.*;
public class sampleProblem1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double milk=50.00,coffee=15.00,tea=25.00;
        String choose="",order="";
        
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
                double quantityM = sc.nextDouble();
                double total = quantityM * milk;
                System.out.println("The total amount to be pay is: "+total);
                System.out.print("Enter payment: ");
                double payment = sc.nextDouble();

                if(total>=payment){
                    System.out.println("Insufficient funds");
                    System.exit(0);
                }
                else{
                    double change = payment - total;
                    System.out.println("Your change is "+change+", thank you for ordering!");
                    System.out.print("Do you want another transaction?");
                    choose = sc.next();
                    if(choose.equalsIgnoreCase("no")){
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
                double quantityC = sc.nextDouble();
                double totalc= quantityC * coffee;
                System.out.println("The total amount to be pay is: "+totalc);
                System.out.print("Enter payment: ");
                double paymentc = sc.nextDouble();

                if(totalc>=paymentc){
                    System.out.println("Insufficient funds");
                    System.exit(0);
                }
                else{
                    double changec = paymentc - totalc;
                    System.out.println("Your change is "+changec+", thank you for ordering!");
                    System.out.print("Do you want another transaction?");
                    choose = sc.next();
                    if(choose.equalsIgnoreCase("no")){
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
                double quantityT = sc.nextDouble();
                double totalt = quantityT * tea;
                System.out.println("The total amount to be pay is: "+totalt);
                System.out.print("Enter payment: ");
                double paymentt = sc.nextDouble();

                if(totalt>=paymentt){
                    System.out.println("Insufficient funds");
                    System.exit(0);
                }
                else{
                    double changet =paymentt - totalt;
                    System.out.println("Your change is "+changet+", thank you for ordering!");
                    System.out.print("Do you want another transaction?");
                    choose = sc.next();
                    if(choose.equalsIgnoreCase("no")){
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
        }        
    }


    } 
}
//finals sample problem #1 

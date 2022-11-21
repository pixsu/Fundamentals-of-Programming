import java.util.*;
public class commission_switch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double price=0, quan, comm=0;

        System.out.println("Department Code: ");
        System.out.println("[1] - Toy Section");
        System.out.println("[2] - Ladies Wear Section");
        System.out.println("[3] - Mens Wear Section");
        System.out.println("[4] - Kiddie Section");
        System.out.print("Enter Sales Representatives' Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID Number: ");
        int idnum = sc.nextInt();
        System.out.print("Enter Department Code: ");
        int depcode = sc.nextInt();

        while(depcode!=1 && depcode!=2 && depcode!=3 && depcode!=4){
            System.out.println("Code is incorrect, try again!");
            System.out.print("Enter Department code: ");
            depcode = sc.nextInt();
        }

        switch(depcode){
            case 1:
            System.out.println("You are in Toy Section");
            System.out.println("Toy Section Available Products and Price:");
            System.out.println("[A] - Toy Car    |300.00Php");
            System.out.println("[B] - Stuff Toys |500.00Php");
            System.out.println("Enter product: ");
            String prod=sc.next();
            while(!prod.equalsIgnoreCase("a") && !prod.equalsIgnoreCase("b")){
                System.out.println("Code is incorrect, try again!");
                System.out.print("Enter product: ");
                prod = sc.next();
            }
            switch(prod){
                case "A": case "a":
                price=300.00;
                break;

                case "b": case "B":
                price=500.00;
                break;

                default:
                break;
            }
            break;

            case 2:
            System.out.println("You are in Ladies Wear Section");
            System.out.println("Ladies Wear Section Available Products and Price");
            System.out.println("[C] - Pants     |799.00Php");
            System.out.println("[D] - Blouse    |599.00Php");
            System.out.println("[E] - Underwear |499.00Php");
            System.out.print("Enter product: ");
            prod = sc.next();
            while(!prod.equalsIgnoreCase("c") && !prod.equalsIgnoreCase("d") && !prod.equalsIgnoreCase("e")){
                System.out.println("Code is incorrect, try again!");
                System.out.print("Enter product: ");
                prod = sc.next();
            }
            switch(prod){
                case "c": case "C":
                price=799.00;
                break;

                case "D": case "d":
                price=599.00;
                break;

                case "E": case "e":
                price=499.00;
                break;

                default:
                break;
            }
            break;

            case 3:
            System.out.println("You are in Men Wear Section");
            System.out.println("Men Wear Section Available Products and Price:");
            System.out.println("[F] - Necktie    |249.00Php");
            System.out.println("[G] - T-Shirt    |349.00Php");
            System.out.println("[H] - Belt       |199.00Php");
            System.out.print("Enter product: ");
            prod = sc.next();
            while(!prod.equalsIgnoreCase("f") && !prod.equalsIgnoreCase("g") && !prod.equalsIgnoreCase("h")){
                System.out.println("Code is incorrect, try again!");
                System.out.print("Enter product: ");
                prod = sc.next();
            }
            switch(prod){
                case "F": case "f":
                price=249.00;
                break;

                case "g": case "G":
                price=349.00;
                break;

                case "h": case "H":
                price=199.00;
                break;

                default:
                break;
            }
            break;

            case 4:
            System.out.println("You are in Kiddie Section");
            System.out.println("Kiddie Section Available Products and Price");
            System.out.println("[I] - Milk Bottle    |99.00Php");
            System.out.println("[J] - Walker         |899.00Php");
            System.out.println("Enter product: ");
            prod=sc.next();
            while(!prod.equalsIgnoreCase("i") && !prod.equalsIgnoreCase("j")){
                System.out.println("Code is incorrect, try again!");
                System.out.print("Enter product: ");
                prod = sc.next();
            }
            switch(prod){
                case "I": case "i":
                price=99.00;
                break;

                case "j": case "J":
                price=899.00;
                break;

                default:
                break;
            }
            break;

            default:
            break;
        }
        System.out.print("Enter Quantity: ");
        quan=sc.nextInt();
        while(quan<=0){
            System.out.println("Invalid input, try again!");
            System.out.print("Enter Quantity: ");
            quan=sc.nextInt();
        }
        double total = price*quan;
        System.out.println("Quantity: "+quan);
        System.out.println("Total amount: "+total);

        if(total>5000){
            comm=total*0.10;
        }
        else if(total>10000){
            comm=total*0.20;
        }
        else if(total>15000){
            comm=total*0.30;
        }
        else if(total<5000){
            comm=total*0;
        }

        System.out.println("Commission: "+comm);
/*
Department Code:
[1] - Toy Section
[2] - Ladies Wear Section
[3] - Mens Wear Section
[4] - Kiddie Section
Enter Sales Representatives' Name: gelo
Enter ID Number: 143
Enter Department Code: 
0
Code is incorrect, try again!
Enter Department Code: 1
You are in Toy Section
Toy Section Available Products and Price:
[A] - Toy Car    |300.00Php
[B] - Stuff Toys |500.00Php
Enter product: d
Code is incorrect, Try Again!
Enter product: a
Enter Quantity: 0
Invalid Quantity: 
Enter Quantity: 12
Quantity: 12.0
Total Amount: 3600.0
Commission: 0.0
*/

    }
}

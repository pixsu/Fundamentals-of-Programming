import java.util.*;
public class charPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String choose = "y";

        while(choose.equalsIgnoreCase("y")){
            System.out.print("Enter any single character here: ");
            String character = sc.next();
            System.out.print("How many rows: ");
            int rows = sc.nextInt();
            System.out.print("How many columns: ");
            int columns = sc.nextInt();
            System.out.println("Here's the output: ");

            for(int i=0; i<columns; i++){
                for(int j=0; j<rows; j++){
                    System.out.print(" "+character);
                }
                System.out.println();
            }

            int total = rows*columns;
            System.out.println("Total character used: "+total);
            System.out.print("Press [X] to exit, [Y] to try again: ");
            choose = sc.next();
            if(choose.equalsIgnoreCase("x")){
                System.exit(0);
            }
            else{
                while(!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("x")){
                    System.out.println("Invalid Input");
                    System.out.print("Press [X] to exit, [Y] to try again: ");
                    choose = sc.next();
                }         
            }
            
        }
        

    }
    
}
/*Create a program that will allow the user to enter a single character to be used in printing an output,
it will also accept a total number of rows and columns to be printed using the entered single character. 
After entering a character, a number of rows, and columns, it will display the table of characters based on the entered rows and columns by the user.
It will also show the total characters on the table. The execution of the program will stop if the user typed "X" to exit the program.
Consider re-entering of required input if invalid action has been encountered. 

Sample output:

Enter any single character: #
How many rows: 3
How many columns: 5
Here's the output:
# # # # # 
# # # # # 
# # # # # 

Total character used: 15
[Press [X] to exit, [Y] to try again: ]
*/

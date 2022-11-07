import java.util.*;
public class DoWhileSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num=0,sum=0;
       
        do{
            sum += num;
            System.out.print("Enter number: ");
            num=sc.nextInt();
        }
        while(num>=0);
        System.out.println("Sum: "+ sum);

    }
}
//Create a program that makes the user input positive integers, the program will only end if the user inputs a negative integer.
//Print only the sum of the positive integers entered by the user (ignore the negative integer) using Do-while loop only.

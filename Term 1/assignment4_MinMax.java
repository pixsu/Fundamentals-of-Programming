import java.util.*;
public class assignment4_MinMax {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        int i=1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        while(i<=5)
        {
            System.out.print("Enter number: ");
            int num=sc.nextInt();
            i++;

            if (num<min)
            {
                min=num;
            }
            else if(num>max)
            {
                max=num;
            }
        }
        System.out.println("Smallest number: "+min);
        System.out.println("Largest number: "+max);

    }
}
//Assignment #4
//Write a program that makes the user to input a number 5 times and at the end of the program it should display the largest and smallest number entered by the user 
//using loops

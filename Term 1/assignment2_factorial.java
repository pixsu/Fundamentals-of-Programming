import java.util.*;
public class assignment2_factorial {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double result = 1;

    System.out.print("Enter number: ");
    int base = sc.nextInt();
    System.out.print("Enter number: ");
    int exponent=sc.nextInt();
    
    
    for(;exponent !=0; --exponent){
        result = base * result;
    }
    System.out.println("Result: "+result);
    
  }
}
//Assignment #2
//user will input two numbers, create a program to calculate the value of an integer(1st input) raised to a certain power(2nd input) 

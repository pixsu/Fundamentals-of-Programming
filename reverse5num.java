import java.util.*;
public class reverse5num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String reverse ="";
        int a=1;

        while(a<=5){
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            reverse =num+reverse;
            a++;
        }
        System.out.println("Output: "+ reverse);


    }
}
//Assignment #3
//Write a program that prompts the user to input integer 5 times and then outputs the number with the digits reversed


import java.util.*; 
public class whileSum {
    public static void main(String[] args){
    
        Scanner sc= new Scanner(System.in);

        int sum=0, num;

        System.out.println("Enter number: ");
        num = sc.nextInt();

        while (num>=0){
            sum = num+sum;
            System.out.println("Enter number: ");
            num = sc.nextInt();
        }
        System.out.println("Sum: "+sum);
        
    }
}

//Create a program that makes the user input positive integers, the program will only end if the user inputs a negative integer.
//Print only the sum of the positive integers entered by the user (ignore the negative integer) using while loop only.

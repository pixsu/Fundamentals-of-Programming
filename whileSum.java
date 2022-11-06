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
//Create a program that makes the user input integers 5 times and print the sum of the 5 integers 

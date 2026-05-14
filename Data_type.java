import java.util.*;
public class  Data_type{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your first number :");
        float x = sc.nextFloat();
        System.out.println("Enter your Second number :");
        float y = sc.nextFloat();

        float result = (x+y);

        System.out.println("The result is: " + result);

        sc.close();
        
    }
    
}
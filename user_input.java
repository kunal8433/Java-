import java.util.*;
public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First number :");
        int a = sc.nextInt();

        System.out.println("Enter your Second number : ");
        int b = sc.nextInt();

        int result = (a+b);
        System.out.println("The Sum of a and b is :" + result);
        sc.close();

        
    }
    
}

import java.util.*;

public class ku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your first number:");
        int x = sc.nextInt();

        System.out.println("Enterr your second number:");
        int y = sc.nextInt();

        int result = x*y;
        System.out.println("The result is:"+result);

        
        sc.close();
    }
    
}
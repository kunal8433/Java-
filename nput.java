import java.util.*;
public class nput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number :");
        int x = sc.nextInt();

        System.out.println("Enter your Second number :");
        int y = sc.nextInt();


        int result = (x+y);

        System.out.println("The Result is :>>>" + result);

        sc.close();



    }
}

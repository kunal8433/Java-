import java.util.*;
public class sub {
    public static void main(String[] args) {
        Scanner Sub = new Scanner (System.in);

        System.out.println("Enter your first number :");
        int x = Sub.nextInt();

        System.out.println("Enter your Second number :");
        int y = Sub.nextInt();

        int result = (x-y);
        System.out.println("The Subtraction of a and b is : " + result);

        Sub.close();
    }

    
}

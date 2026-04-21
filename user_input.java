import java.util.*;

public class user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First number : ");
        int x = sc.nextInt();

        System.out.println("Enter your Second name : " );
        int y = sc.nextInt();

        int result = (x/y);

        System.out.println("The Division value of x and y is :" + result);
        sc.close();
        

    }
    
}

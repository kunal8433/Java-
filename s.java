import java.util.*;
public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First Name :");
        String x = sc.nextLine();

        System.out.println("Enter your last Name :");
        String y = sc.nextLine();

        String  result = x+" "+y;

        System.out.println("The Full name is:" + result);

        sc.close();
    }
    
}

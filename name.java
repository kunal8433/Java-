import java.util.*;
public class name {
    public static void main(String[] args) {
        
        Scanner k = new Scanner (System.in);

        System.out.println("Enter your first name :");
        String a  = k.nextLine();

        System.out.println("Enter your Sur name : ");
        String  b = k.nextLine();

        String result = (a + " " + b);
        System.out.println("The full name of k is :" + result);

        k.close();
        
    }
}

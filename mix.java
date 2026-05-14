
import java.util.*;

public class mix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter anything (int, float, or string): ");
        String input = sc.nextLine();

        try {
            // check int
            int intValue = Integer.parseInt(input);
            System.out.println("You entered Integer: " + intValue);
        } 
        catch (NumberFormatException e1) {
            try {
                // check float
                float floatValue = Float.parseFloat(input);
                System.out.println("You entered Float: " + floatValue);
            } 
            catch (NumberFormatException e2) {
                // otherwise string
                System.out.println("You entered String: " + input);
            }
        }

        sc.close();
    }
}


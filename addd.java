import java.util.*;

public class addd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value:");
        String x = sc.next();

        System.out.println("Enter second value:");
        String y = sc.next();

        // check if both are int
        if (x.matches("-?\\d+") && y.matches("-?\\d+")) {
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            System.out.println("Result: " + (a + b));
        }

        // check if both are float
        else if (x.matches("-?\\d+\\.\\d+") && y.matches("-?\\d+\\.\\d+")) {
            float a = Float.parseFloat(x);
            float b = Float.parseFloat(y);
            System.out.println("Result: " + (a + b));
        }

        // both are string
        else if (x.matches("[a-zA-Z]+") && y.matches("[a-zA-Z]+")) {
            System.out.println("Result: " + x + y);
        }

        // different data types
        else {
            System.out.println("Different data type! Program stopped.");
        }

        sc.close();
    }
}
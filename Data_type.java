import java.util.*;

public class Data_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter anything:");

        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            System.out.println("Integer hai: " + x);
        }
        else if (sc.hasNextFloat()) {
            float y = sc.nextFloat();
            System.out.println("Float hai: " + y);
        }
        else {
            String str = sc.next();
            System.out.println("String hai: " + str);
        }

        sc.close();
    }
}
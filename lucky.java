import java.util.*;
public class lucky {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {   

            System.out.println("Enter your number (0 to exit): ");
            int x = sc.nextInt();

            if (x == 0) {
                System.out.println("Program Ended!");
                break;  // loop stop
            }

            if (x < 100) {
                System.out.println("Less than 100!");
            } 
            else if (x > 100) {
                System.out.println("Greater than 100!");
            } 
            else {
                System.out.println("Equal to 100!");
            }
        }

        sc.close();
    }
}
    


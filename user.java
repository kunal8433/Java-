import java.util.*;
public class user {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        

        System.out.println("Enter your number :");
        int x = sc.nextInt();

        if (x<=100)
            System.out.println("Less then 100 !");
        else if (x>=100)
            System.out.println("Grater then 100 !");
        else 
            System.out.println("Invalid Character !!");
        sc.close();
        
    }
    
}

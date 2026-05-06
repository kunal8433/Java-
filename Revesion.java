import java.util.*;

public class Revesion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        while (true){

        System.out.println("Enter your number and 0 for EXIT :");
        int x = sc.nextInt ();

        if (x==0)
        {
            
            System.out.println("Exit !");
             break ;
        }
        else if (x>100)
        {
            System.out.println("Grater !");
        }
        else if (x<100)
        {
            System.out.println("Smaller !");
        }
        else {

            System.out.println("Invalid character!");
        }


        }
         sc.close();
    }

    
}
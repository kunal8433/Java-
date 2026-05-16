import java.util.*;
public class D_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter which you want Data type :");

        if(sc.hasNextInt()){

        
        int x = sc.nextInt();
        System.out.println("This is an Integer  : " +  x );
        }

        else if (sc.hasNextFloat()){

        
        Float y = sc.nextFloat();
        System.out.println("This is an Float : "  +  y);}
    

        else {
            String z = sc.nextLine();
            System.out.println("This is an String  : " + z);
        }
        sc.close();
    }
    
}

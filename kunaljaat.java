import java.util.*;
public class kunaljaat {
    public static void main(String[] args) {
        Scanner kunal = new Scanner(System.in);

        System.out.println("Enter your name MR.");
        String first  = kunal.nextLine();

        System.out.println("Enter your last name :");
        String second = kunal.nextLine();

        String result = (first+ " " + second);
        System.out.println("The name is : " + result);

        kunal.close();
    }
    
}

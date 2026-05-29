import java.util.*;
public class  info {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name :");
        String name = sc.nextLine();

        System.out.println("Enter Marks 1 :");
        int m1  = sc.nextInt();

        
        System.out.println("Enter Marks 2 :");
        int m2  = sc.nextInt();

        
        System.out.println("Enter Marks 3 :");
        int m3  = sc.nextInt();

        int total = m1+m2+m3;
        double avg = total/3.0;

        if(avg >250)
            System.out.println("A+");
        else if (avg >200)
            System.out.println("B+");
        else if (avg >100)
            System.out.println("C+");
        else
            System.out.println("");
        System.out.println("REPORT CARD OF STUDENT !!");
        System.out.println("The name of Student is :" + name );
        System.out.println("Marks 1 : " + m1);
        System.out.println("Marks 2 :" + m2);
        System.out.println("Marks 3 :" + m3);
        System.out.println("Avg of Marks is :" + avg);
        System.out.println("Thank you !!");
        sc.close();



    }
    
}
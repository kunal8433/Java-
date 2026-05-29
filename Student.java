import java.util.*;
public class Student {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Studen Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Student Marks 1 :");
        int m1 = sc.nextInt();

        System.out.println("Enter Student Marks 2 :");
        int m2 = sc.nextInt();

        System.out.println("Enter Student Marks 3 :");
        int m3 = sc.nextInt();

        int total = m1+m2+m3;
        double average  = total/2;

        if (average>90)
            System.out.println("A+");
        else if (average>70)
            System.out.println("B+");
        else if (average<50)
            System.out.println("C+");

        System.out.println("The Name of Student is " + name);
        System.out.println("Total marks " + total );
        System.out.println("Avg" + average);
        
        sc.close();







    

        
    }
    
}

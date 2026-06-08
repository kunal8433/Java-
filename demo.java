import java.util.*;
public class demo{
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();

        list.add("Malik");// index = 3
        list.addFirst("Lucky");//index = 2
        list.addFirst("Malik");// index = 1
        list.addFirst("Kunal");//index = 0
        System.out.println("The LinkedList is: " + list  );
        list.remove(2);
        System.out.println("The update list is :" + list);
        list.remove("Kunal");
        System.out.println("Only Malik list is:" + list);
        

    }
}
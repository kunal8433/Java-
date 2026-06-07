import java.util.*;
public class Linklist{
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();

        list.add("Malik");
        list.addFirst("Lucky");
        list.addFirst("And");
        list.addFirst("Malik");
        list.addFirst("Kunal");
        
        System.out.println(list);

        System.out.println("The Size of List is: " + list.size());

        for(int i=0; i<list.size(); i++){
        
            System.out.println(list.get(i) + " -->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}
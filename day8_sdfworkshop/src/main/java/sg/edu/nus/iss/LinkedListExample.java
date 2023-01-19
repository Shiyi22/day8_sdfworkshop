package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {

    public void example() {
        
        LinkedList<String> ll = new LinkedList<>(); 
        ll.add("A"); 
        ll.add("B"); 
        ll.add("C"); 
        ll.add("D");
        ll.add("E");
        ll.add("F"); 
        ll.add("G");

        System.out.println(ll); 
        // ll.forEach(itm -> System.out.println(itm)); // few ways to print linkedlist

        // remove particular item 
        ll.remove("C");
        System.out.println(ll); 

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll); 

    }
    
}

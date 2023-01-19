package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public void example() {

        Stack<Integer> stack = new Stack<>(); 
        
        for (int i = 0; i < 10; i++) {
            stack.push(i); // putting sth on the stack 
        }

        // pop or taking sth from the stack
        for (int i = 0; i < 5; i++) {
            Integer stackItem = stack.pop();
            System.out.println("Stack item (pop): " + stackItem);
        }

        // see what is the last item on top of the track
        Integer item= stack.peek();
        System.out.println("Item on top of stack: " + item);
        // see what is the first item added into the stack 
        Integer firstItem = stack.firstElement(); 
        System.out.println("First element of stack: " + firstItem);

        //search at which index is the element 
        Integer indexElement = stack.search(2); 
        System.out.println("Stack element found at index " + indexElement);

        // iterate using iterator 
        Iterator<Integer> its = stack.iterator(); 
        while(its.hasNext()) {
            Integer stackIt = its.next(); 
            System.out.println("Iterator stack item: " + stackIt);
        }
    }
    
}

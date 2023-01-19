package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

    public void example() {
        String name[] = {"darryl", "elaine", "james", "zoanne", "chris", "mark", "sophia", "asher", "brandon", "helen", "daniel","marcus"}; 
        System.out.println("Unsorted arr: " + Arrays.toString(name));

        // sort the array in ascending order
        Arrays.sort(name); 
        // print out sorted array 
        System.out.println("Sorted arr: " + Arrays.toString(name));

        // sort array in descending order
        Arrays.sort(name, Collections.reverseOrder()); 
        System.out.println("Sorted arr (descending): " + Arrays.toString(name));
    }
    
    public void example2 () {
        Integer[] numbers = {10, 5, 1, 2, 4, 3, 6, 7, 9, 8}; 
        
        // sort array in ascending order 
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers)); 
        
        // sort array in descending order 
        Arrays.sort(numbers, Collections.reverseOrder()); 
        System.err.println("Sorted numbers (reverse): " + Arrays.toString(numbers));
    }
}

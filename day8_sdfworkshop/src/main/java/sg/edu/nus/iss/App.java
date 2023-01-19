package sg.edu.nus.iss;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // run example from ArraySortExample
        ArraySortExample ase = new ArraySortExample(); 
        // ase.example();
        // ase.example2();

        CollectionSortExample cse = new CollectionSortExample(); 
        // cse.example();
        //cse.example2();

        HashMapExample hme = new HashMapExample(); 
        // hme.example();

        ConcurrentHashMapExample che = new ConcurrentHashMapExample(); 
        //che.example();

        LinkedListExample lle = new LinkedListExample(); 
        // lle.example();

        StackExample se = new StackExample(); 
        se.example();
    }
}

package sg.edu.nus.iss;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    // replicating HashMap example 
    public void example() {
        
        Map<String, Integer> phones = new Hashtable<>(); // map out the demographics 

        phones.put("iPhone", 10); // 10 person has iPhone 
        phones.put("Huawei",2);
        phones.put("Oppo", 4);
        phones.put("Samsung", 20); 

        System.out.println("Total phone types: " + phones.size()); // to print how many phone types 

        for (String key: phones.keySet()) {
            System.out.println(key + " - " + phones.get(key));
        }

        // find out whether there is a specific key from console 
        String searchString = ""; 
        Console cons = System.console(); 
        
        while (!searchString.equals("quit")) {
            searchString = cons.readLine("Enter searchString: "); 
            
            if (phones.containsKey(searchString)) {
                System.out.println(searchString + " - " + phones.get(searchString));
            } else {
                System.out.println("Item not found");
            }
        }
        // once program exits, remove all the map data in memory 
        phones.clear(); 
    }
}

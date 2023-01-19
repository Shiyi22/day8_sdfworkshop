package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSortExample {

    public void example() {
        List<Integer> numbers = new ArrayList<>(); 

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100)); 
        }
        // print out unsorted list 
        System.out.println("Unsorted list: " + numbers);

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Sort in descending order
        // Collections.sort(numbers, Collections.reverseOrder()); 
        numbers.sort(Comparator.reverseOrder()); // alternative to the code above 
        System.out.println("Sorted list (reverse): " + numbers);
    }
    
    public void example2() {
        
        Employee emp1 = new Employee("12345", "Darryl Ng", "SS", "Lecturer", "darrylng@nus.edu.sg", 20000); 
        Employee emp2 = new Employee("2345", "Dennis Ng", "SS", "Lecturer", "dennisng@nus.edu.sg", 15000); 
        Employee emp3 = new Employee("54354", "Dendon Ng", "SS", "Lecturer", "dendonng@nus.edu.sg", 25000); 

        
        List<Employee> employees = new ArrayList<>(); 
        employees.add(emp1); 
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Employees before sorting: " + employees); 

        // sort employees using collections on fullname 
        Collections.sort(employees); // uses the compareTo function, which is overriden in the class 
        System.out.println("Employees after sorting: " + employees); 

        // sort using Comparator and Lambda 
        employees.sort(Comparator.comparing(e -> e.getSalary())); 
        System.out.println("Sorted employees (salary): " + employees);

        List<Employee> filteredEmployees = employees.stream().filter(e -> e.getFullName().equalsIgnoreCase("darryl ng")).collect(Collectors.toList());
        System.out.println("Filtered employees: " + filteredEmployees);


    }
    
}

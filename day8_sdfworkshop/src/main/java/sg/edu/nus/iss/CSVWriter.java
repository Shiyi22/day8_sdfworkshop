package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    // members 
    public static final String COMMA_DELIMITER = ","; 
    public static final String NEWLINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "staffNo, fullName, department, role, emailAdd, salary"; 
    
    // declare empty arraylist 
    public List<Employee> employees = null; 

    // function to generate employees
    public List<Employee> generateEmployees() {
        employees = new ArrayList<>(); 

        // create some employees 
        Employee emp1 = new Employee("12345", "Darryl Ng", "SS", "Lecturer", "darrylng@nus.edu.sg", 20000); 
        Employee emp2 = new Employee("2345", "Dennis Ng", "SS", "Lecturer", "dennisng@nus.edu.sg", 15000); 
        Employee emp3 = new Employee("54354", "Dendon Ng", "SS", "Lecturer", "dendonng@nus.edu.sg", 25000); 

        // add the employees to the list of employees 
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees; 
    }
    
    // function to open and write into file 
    public void writeToCSV(List<Employee> employees, String fileName) throws IOException { // pass in the data 

        FileWriter fw = new FileWriter(fileName);

        // write FILE HEADER to csv 
        fw.append(FILE_HEADER.toString()); 
        fw.append(NEWLINE_SEPARATOR); // append does not separate items into new line 

        // read records row by row and write it using fw.append()
        for (Employee e : employees) {
            fw.append(e.getStaffNo()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(e.getFullName()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(e.getDepartment()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(e.getRole()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(e.getEmailAdd()); 
            fw.append(COMMA_DELIMITER); 
            fw.append(String.valueOf(e.getSalary())); // need to type cast integer to string as append only takes string?
            fw.append(COMMA_DELIMITER); 
            
            fw.append(NEWLINE_SEPARATOR); 
        }
        fw.flush();
        fw.close();

    }

    // function to read CSV file 
    public void readCSVFile(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName); 
        BufferedReader br = new BufferedReader(fr); 

        String lines = br.readLine(); // to skip the header first line 
        String[] columns; // create new array to store the csv columns 
        List<Employee> employees = new ArrayList<>(); 

        while ((lines = br.readLine()) != null) {
            columns = lines.trim().split(COMMA_DELIMITER); 

            // put data in col[] into employee object 
            // System.out.println(columns[5]);
            Employee emp = new Employee(columns[0], columns[1], columns[2], columns[3], columns[4], Integer.parseInt(columns[5])); 

            // add employee object into list of employees 
            employees.add(emp);
        }
        // print list of employee 
        // System.out.println(employees);
        employees.forEach(e -> System.out.println(e));

        // close filereader 
        br.close();
        fr.close();
    }
    
    // my version 
    public void readCSVFile2(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName); 
        BufferedReader br = new BufferedReader(fr); 

        // this is to read the header separately 
        String lines; 
        String[] columns; // create new array to store the csv columns 

        while ((lines = br.readLine()) != null) {
            System.out.println(lines);
        }
    }

}

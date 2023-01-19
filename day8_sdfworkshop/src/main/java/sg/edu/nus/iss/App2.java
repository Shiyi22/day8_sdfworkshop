package sg.edu.nus.iss;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class App2 {

    // used for CSVWriter
    public static void main(String[] args) throws IOException {

        // write the csv file to a txt file 
        String dirPath = "data"; 
        String fileEmployee = "employee.txt"; 

        // create a file in the directory created above 
        File newEmployeeFile = new File(dirPath + File.separator + fileEmployee); 
        // System.out.println(newFile);
        boolean isFileCreated = newEmployeeFile.createNewFile(); 

        if (isFileCreated)
            System.out.println("New file: " + fileEmployee + " created");
        else 
            System.out.println("File " + fileEmployee + " already exists");
        
        CSVWriter csvw = new CSVWriter(); 
        List<Employee> employees = csvw.generateEmployees();

        csvw.writeToCSV(employees, dirPath + File.separator + fileEmployee);

        // read the csv file in output 
        csvw.readCSVFile(dirPath + File.separator + fileEmployee);

        
    }
    
}

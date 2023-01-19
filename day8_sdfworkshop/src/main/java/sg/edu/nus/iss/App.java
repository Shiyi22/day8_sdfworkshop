package sg.edu.nus.iss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // // run example from ArraySortExample
        // ArraySortExample ase = new ArraySortExample(); 
        // // ase.example();
        // // ase.example2();

        // CollectionSortExample cse = new CollectionSortExample(); 
        // // cse.example();
        // //cse.example2();

        // HashMapExample hme = new HashMapExample(); 
        // // hme.example();

        // ConcurrentHashMapExample che = new ConcurrentHashMapExample(); 
        // //che.example();

        // LinkedListExample lle = new LinkedListExample(); 
        // // lle.example();

        // StackExample se = new StackExample(); 
        // se.example();


        // // File IO revision 
        String dirPath = "data"; 
        String fileName = "data.txt"; 

        // create a directory
        File newDir = new File(dirPath); 
        // FileWriter fw = new FileWriter(newDir); 
        boolean isDirCreated = newDir.mkdir(); 
        
        if (isDirCreated)
            System.out.println("New directory " + dirPath + " created");
        else 
            System.out.println("Directory " + dirPath + " already exists");

        // create a file in the directory created above 
        File newFile = new File(dirPath + File.separator + fileName); 
        // System.out.println(newFile);
        boolean isFileCreated = newFile.createNewFile(); 

        if (isFileCreated)
            System.out.println("New file: " + fileName + " created");
        else 
            System.out.println("File " + fileName + " already exists");

        // list files within a direcotry 
        File fileList[] = newDir.listFiles();
        for (File f: fileList) {
            System.out.println("File " + f.getPath() + f.getCanonicalFile());

            // use FileOutputStream to write 
            FileOutputStream fos = new FileOutputStream(newFile, true);
            for (int i = 0; i < 10; i++) {
                char str[] = Integer.toString(i).toCharArray();
                fos.write(str[0]);
                fos.write('\n');
            }
            // convert string to byte array using getBytes() function 
            String welcomeMessage = "Welcome to ISS TFIP programmme"; 
            byte outputData[] = welcomeMessage.getBytes(); // convert to byte as fos.write takes in byte 
            fos.write(outputData); // writing the string in byte array one character at a time to the file 

            // clear the outputstream >> force data to store to the file destination 
            fos.flush();
            fos.close();
        }
        
    }
}

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Methods {
    public void CreateDirectory() throws IOException {
        Path path = Paths.get("C:\\Users\\keshka\\Desktop\\study material\\java\\homework5\\src\\myFiles");
        Files.createDirectory(path);}


    public void CreateFile() {
        try {
            File myObj = new File("C:\\Users\\keshka\\Desktop\\study material\\java\\homework5\\src\\myFiles\\data.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }


    public void WriteToFile() {
        try {
            FileWriter myWriter = new FileWriter("data.txt");
            myWriter.write("24, "+"39, "+"-90 ");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }






}

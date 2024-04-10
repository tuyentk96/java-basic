package file;

import java.io.FileWriter;
import java.io.IOException;

public class OverrideFile {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("C:\\Users\\PC\\Desktop\\WORK\\input.txt");
            fileWriter.write("Hello World");
            fileWriter.close();
            System.out.println("Successfully Written to file");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

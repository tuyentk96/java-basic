package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            File myFile = new File("C:\\Users\\PC\\Desktop\\WORK\\input.txt");
            if(myFile.exists()){
                String str ="Append string";
                BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
                writer.write("\n");
                writer.write(str);
                writer.close();
                System.out.println("Successfully Written to file");
            }else {
                String str = "Hello World";
                FileWriter fileWriter = new FileWriter("C:\\Users\\PC\\Desktop\\WORK\\input.txt");
                fileWriter.write(str);
                fileWriter.close();
                System.out.println("Successfully Written to file");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

package file;

import java.io.File;
import java.io.IOException;

public class CreatedFile {
    public static void main(String[] args) {
        try{
            File myFile = new File("C:\\Users\\PC\\Desktop\\WORK\\input.txt");
            if (myFile.createNewFile()){
                System.out.println("File created");
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("File not created");
            e.printStackTrace();
        }
    }
}

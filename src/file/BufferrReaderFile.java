package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class BufferrReaderFile {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\PC\\Desktop\\WORK\\input.txt");
        try{
            BufferedReader br = Files.newBufferedReader(myFile.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

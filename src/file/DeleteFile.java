package file;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\PC\\Desktop\\WORK\\input.txt");
        if (myFile.delete()) {
            System.out.println("File deleted successfully");
        }else {
            System.out.println("File could not be deleted");
        }
    }
}

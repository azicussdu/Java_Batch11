package week10.day2;

import java.io.File;
import java.io.FileWriter;

public class FileTest {
    public static void main(String[] args) {

        File file = null;

        try {
            file = new File("myfile.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Files in Java might be tricky, but it is fun enough!");
            fileWriter.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
//        finally {
//            file.delete();
//        }

    }
}

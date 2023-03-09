package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class file01 {
    public static void main(String[] args) throws IOException {
        //File f1=new File("D:\\File\\java.txt");
        FileInputStream file1 = new FileInputStream("D:\\File\\java.txt");

        int by;
        while ((by=file1.read())!=-1){
            System.out.print((char)by);

        }
        file1.close();
    }
}

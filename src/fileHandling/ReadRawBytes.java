package fileHandling;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadRawBytes {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("fos.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        int data;
        while ((data = isr.read())!= -1){
            System.out.print((char) data+" ");
        }
        fis.close();


    }
}

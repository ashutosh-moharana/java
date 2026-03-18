package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("pepalbarry.jpg"); FileOutputStream fos = new FileOutputStream("copy.jpg")){
            byte[] buffer = new byte[1024];
            int data;
            while(( data= fis.read())!= -1){
                System.out.print(data+ " ");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

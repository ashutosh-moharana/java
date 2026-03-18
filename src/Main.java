
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     try(FileInputStream fis = new FileInputStream("rat.jpg"); FileOutputStream fos = new FileOutputStream("rat2.jpg")){

         byte[] buffer = new byte[1024];
         int bytesRead;
         while((bytesRead = fis.read(buffer))!= -1){
             fos.write(buffer,0,bytesRead);
         }

     }catch(IOException e){
         System.out.println("Error: "+e.getMessage());
     }

    }
}
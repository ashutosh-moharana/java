package fileHandling;


import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        try(FileReader file = new FileReader("ashutosh.txt")){
            int ch;
            while(( ch = file.read())!=-1){
                System.out.print((char)ch);
            }
            System.out.println("\nSuccessfully Written");
        }catch(IOException e){
            System.out.println("Error occured: "+e.getMessage());
        }

    }
}

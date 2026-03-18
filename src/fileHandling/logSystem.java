package fileHandling;

import java.io.*;
import java.time.LocalDateTime;

public class logSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try(BufferedWriter bw = new BufferedWriter(new FileWriter("app.log",true))){
             String message;
             while(true){
                 message = br.readLine();
                 if(message.equals("exit")) break;

                 bw.write(LocalDateTime.now()+" - "+message);


                 bw.newLine();
                 System.out.println("Logged: "+message);
             }

        }

        br.close();
    }
}

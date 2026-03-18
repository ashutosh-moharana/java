package fileHandling;

import java.io.FileOutputStream;

public class FileStoresBytes {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        byte[] b = {97,98,99};
        fos.write(b);
        fos.close();
    }
}

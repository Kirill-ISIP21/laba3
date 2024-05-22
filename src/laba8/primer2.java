package laba8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class primer2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            InputStream inFile = new FileInputStream("C:\\Games\\text.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();
        InputStream inUrl = new URL("http://google.com").openStream();
        readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            InputStream inArray=new ByteArrayInputStream(new byte[]{7,9,3,7,4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        }catch (IOException e){
            System.out.print("Ошибка:"+ e);
        }
    }
}

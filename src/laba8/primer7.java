package laba8;

import java.io.*;

public class primer7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try{
            br = new BufferedReader(new FileReader(""),1024);
            out = new BufferedWriter(new FileWriter(""));
            int LineCount = 0;
            String s;
            while ((s = br.readLine())!=null){
                LineCount++;
                System.out.println(LineCount+":"+s);
                out.write(s);
                out.newLine();
            }
        }catch (IOException e) {
            System.out.println("Ошибка!!!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

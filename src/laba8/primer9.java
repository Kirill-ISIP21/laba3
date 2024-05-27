package laba8;

import java.io.*;

public class primer9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try{
            br = new BufferedReader( new InputStreamReader( new FileInputStream("E:\\MyFile1.txt"), "cp1251"));

            out = new BufferedWriter( new OutputStreamWriter( new FileOutputStream("E:\\MyFile2.txt"), "cp1251"));

            int lineCount = 0;

            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount+": " +s);
                out.write(lineCount+": "+s); //без перехода
                out.newLine(); // принудительный переход на новую строку
            }
        } catch (IOException e){
            System.out.println(e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

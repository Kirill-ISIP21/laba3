package laba8;

import java.io.*;

public class primer10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;

        try{
            br = new BufferedReader( new InputStreamReader( new FileInputStream("E:\\MyFile2.txt"), "cp1251"));

            out = new PrintWriter("E:\\MyFile1.txt");

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                out.println(lineCount+": "+s);
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

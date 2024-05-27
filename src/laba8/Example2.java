package laba8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) throws IOException {
        String filename = "E:\\MyFile1.txt";
        String cloneFileName = "E:\\MyFile2.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), StandardCharsets.UTF_8));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(cloneFileName), StandardCharsets.UTF_8));
            List<String> lines = new ArrayList<>();
            String buf;
            while ((buf = br.readLine()) != null){
                lines.add(buf);
            }
            bw.write(lines.get(1) + "\n");
            for (int i = 2; i < lines.size(); i++) {
                double num = Double.parseDouble(lines.get(i));
                if(num > 0) {
                    buf = String.valueOf(num);
                    bw.write(buf + "\n");
                }
            }
        } catch (IOException e){
            System.out.println(e);
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}

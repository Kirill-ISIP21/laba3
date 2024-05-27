package laba8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Example3 {
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
            String[] arrayBuf;
            while ((buf = br.readLine()) != null){
                lines.add(buf);
            }
            for (int i = 0; i < lines.size(); i++) {
                buf = lines.get(i);
                arrayBuf = buf.split(" ");
                boolean flagCons = false;
                for (int j = 0; j < arrayBuf.length; j++) {
                    if (isConsonant(arrayBuf[j]) && !flagCons) {
                        flagCons = true;
                        bw.write(i + ": (" + arrayBuf.length + ") " + arrayBuf[j] + " ");
                    } else if (isConsonant(arrayBuf[j])) bw.write(arrayBuf[j] + " ");
                }
                if (flagCons) bw.newLine();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
    public static boolean isConsonant(String text){
        char firstChar = text.charAt(0);
        return !(firstChar == 'а' || firstChar == 'о' || firstChar == 'и' || firstChar == 'е' ||
                firstChar == 'ё' || firstChar == 'э' || firstChar == 'ы' || firstChar == 'у' ||
                firstChar == 'ю' || firstChar == 'я' || firstChar == 'А' || firstChar == 'О' ||
                firstChar == 'И' || firstChar == 'Е' || firstChar == 'Ё' || firstChar == 'Э' ||
                firstChar == 'Ы' || firstChar == 'У' || firstChar == 'Ю' || firstChar == 'Я');
    }
}

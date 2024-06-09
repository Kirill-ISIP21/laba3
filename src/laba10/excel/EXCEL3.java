package laba10.excel;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EXCEL3 {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(new File("src/laba10/excel/EXCEL1.xlsx"));

            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            file.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (IOException e) {
            System.err.println("Ошибка ввода/вывода");
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


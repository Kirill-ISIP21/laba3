package laba10.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class EXCEL2 {
    public static void main(String[] args) throws IOException {

        // Путь к файлу Excel
        String filePath = "src/laba10/excel/EXCEL2.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        // Создание объекта Workbook
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Получение листа по имени
        XSSFSheet sheet = workbook.getSheet("Лист1");

        if (sheet == null) {
            System.out.println("Лист не найден в Excel.");
        } else {
            // Чтение данных из таблицы
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Вывод ячейки в консоль
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        }
        workbook.close();
        inputStream.close();
    }
}


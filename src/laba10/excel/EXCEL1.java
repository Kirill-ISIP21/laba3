package laba10.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class EXCEL1 {
    public static void main(String[] args) throws IOException {

        // Создание нового экземпляра книги Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Создание нового листа в книге
        XSSFSheet sheet = workbook.createSheet("Лист1");

        // Заполнение шапки таблицы
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Наименование");
        headerRow.createCell(1).setCellValue("Описание");
        headerRow.createCell(2).setCellValue("Цена");

        Row headerRow1 = sheet.createRow(1);
        headerRow1.createCell(0).setCellValue("Товар");
        headerRow1.createCell(1).setCellValue("Производитель: неизвестен, Вес: кг.");
        headerRow1.createCell(2).setCellValue(500);

        Row headerRow2 = sheet.createRow(2);
        headerRow2.createCell(0).setCellValue("Услуга");
        headerRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Частота: ГГц.");
        headerRow2.createCell(2).setCellValue(25000.0);

        // Сохранение Excel файла
        String filePath = "src/laba10/excel/EXCEL1.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Файл Excel сохранен по адресу: " + filePath);
    }
}


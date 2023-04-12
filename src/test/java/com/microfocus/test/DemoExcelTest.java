package com.microfocus.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoExcelTest {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("test_data/orange_data.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheet("invalidLoginTest");


        Object[][] arr=new Object[2][3];

        for(int r=1;r<3;r++)
        {
            for (int c=0;c<3;c++)
            {
                String value=sheet.getRow(r).getCell(c).getStringCellValue();
                System.out.println(value);
                arr[r-1][c]=value;
            }
        }
        book.close();
        file.close();
    }
}

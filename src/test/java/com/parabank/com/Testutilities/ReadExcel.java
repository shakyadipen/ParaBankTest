package com.parabank.com.Testutilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    //public FileInputStream fis = null;
    private XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row;
    private XSSFCell cell=null;

    public ReadExcel() throws IOException {

        // //Create an object of File class to open xlsx file

        File file = new File(System.getProperty("user.dir") + "\\TestData\\Data.xlsx");
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet("Sheet1");
    }
        public String getCellData (String sheetName,int colnum, int rownum){

            int index = workbook.getSheetIndex(sheetName);
            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(rownum);
            cell = row.getCell(colnum);
            System.out.println(cell.getStringCellValue());
            return (cell.getStringCellValue());

        }
    public String getPassword (String sheetName,int colnum, int rownum){
        int index = workbook.getSheetIndex(sheetName);
        sheet = workbook.getSheetAt(index);
        row = sheet.getRow(rownum);
        cell = row.getCell(colnum);
        System.out.println(cell.getStringCellValue());
        return (cell.getStringCellValue());

    }

    }



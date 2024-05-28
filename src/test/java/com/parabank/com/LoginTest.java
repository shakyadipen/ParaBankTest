package com.parabank.com;

import Pages.LoginPage;
import com.parabank.com.Testutilities.ReadExcel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;


public class LoginTest extends BaseTest {

    @Test
    public void LoginPageTest() throws IOException {
        ReadExcel read=new ReadExcel();
        LoginPage login = new LoginPage(driver);
        String username=read.getCellData("Sheet1",1,1);
        String password=read.getPassword("Sheet1",2,1);
        System.out.println(username);
        login.setUsername(username);
        login.setPassword(password);
        login.clickLogin();
        //Verification of the login page
       // assertTrue(login.verifyLogin().contains("Welcome"));
    }
}

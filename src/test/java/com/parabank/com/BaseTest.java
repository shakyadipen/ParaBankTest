package com.parabank.com;

import com.parabank.com.Testutilities.ReadExcel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BaseTest {
    public static WebDriver driver;
    @Parameters("browser")
    @BeforeTest
    //for multiple browsers
    //public void setup(String browser) throws IOException {
            //For single browser
             public void setup() throws IOException {
   // ReadExcel read=new ReadExcel();
        ReadExcel read=new ReadExcel();
        //Fetch the URL from Excel
        String URL=read.getCellData("Sheet1",0,1);
        //Run on multiple browsers
//        if (browser.equalsIgnoreCase("edge")) {
//            System.out.println(" Executing on  Microsoft Edge");
//            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+".\\Resources\\msedgedriver.exe");
//            driver=new EdgeDriver();
//            driver.get(URL);
//            driver.manage().window().maximize();
//        } else if (browser.equalsIgnoreCase("chrome")) {
//            System.out.println(" Executing on CHROME");
//            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".\\Resources\\chromedriver.exe");
//            driver = new ChromeDriver();
//            driver.get(URL);
//            driver.manage().window().maximize();
//        }
        System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+".\\Resources\\msedgedriver.exe");
        driver=new EdgeDriver();
        //driver = new ChromeDriver();
        driver.get(URL);
//        //driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
    }
    //using after test annotation will run all the methods
    @AfterTest

    public void quit(){
    driver.quit();
    }
}

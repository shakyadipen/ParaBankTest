package com.parabank.com;
import Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class RegisterTest extends BaseTest{
   
@Test
    public void RegisterPageTest() throws InterruptedException {
        RegisterPage register=new RegisterPage(driver);

            register.clickRegister();
            assertTrue(register.getTitle().contains("Signing up is easy!"));
            register.fillDetails();
            register.clickRegisterButton();
            register.verifyTitle().contains("ParaSoft Demo Website");

            Thread.sleep(1000);




}
}

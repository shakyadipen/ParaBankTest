package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
    public WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }
    By RegisterCLick=By.partialLinkText("Register");
    By Title=By.className("title");
    By FirstNameField= By.id("customer.firstName");
    By LastNameField=By.id("customer.lastName");
    By AddressField=By.id("customer.address.street");
    By CityField =By.id("customer.address.city");
    By StateField=By.id("customer.address.state");
    By ZipField=By.id("customer.address.zipCode");
    By PhoneField=By.id("customer.phoneNumber");
    By SSNField=By.id("customer.ssn");
    By UsernameField=By.id("customer.username");
    By PasswordField=By.id("customer.password");
    By ConfirmField= By.id("repeatedPassword");
   // By FindField=By.className("button");
    By RegisterButton=By.className("button");
    By afterRegisterTitle=By.className("title");
    //Clicking on RegisterLink
    public void clickRegister(){
        driver.findElement(RegisterCLick).click();

    }

    //Verification of the Register Page
    public String getTitle(){
        return driver.findElement(Title).getText();

    }
    public String verifyTitle(){
        return driver.findElement(afterRegisterTitle).getText();
    }
    //Filling the details in Register Page
    public void fillDetails(){
        driver.findElement(FirstNameField).sendKeys("Dipendra");
        driver.findElement(LastNameField).sendKeys("Shakya");
        driver.findElement(AddressField).sendKeys("Imadol");
        driver.findElement(CityField).sendKeys("Bagmati");
        driver.findElement(StateField).sendKeys("01");
        driver.findElement(ZipField).sendKeys("57760");
        driver.findElement(PhoneField).sendKeys("9849594238");
        driver.findElement(SSNField).sendKeys("6768");
        driver.findElement(UsernameField).sendKeys("shakya02");
        driver.findElement(PasswordField).sendKeys("admin1234");
        driver.findElement(ConfirmField).sendKeys("admin1234");


    }
    public void clickRegisterButton(){
        driver.findElement(RegisterButton).click();
    }



}


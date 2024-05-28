package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPage {
    public WebDriver driver;
    public ForgetPage(WebDriver driver){

        this.driver=driver;
    }
    By forgetPageverify = By.xpath("//div[@id='rightPanel']/h1[@class='title']");
    By forgetLink =By.xpath("//a[@href='lookup.htm']");
    By FirstNameField= By.id("firstName");
    By LastNameField=By.id("lastName");
    By AddressField=By.id("address.street");
    By CityField =By.id("address.city");
    By StateField=By.id("address.state");
    By ZipField=By.id("address.zipCode");
    By SSNField=By.id("ssn");
    By FindLoginField=By.className("button");
    public void ClickForgetLink(){
        driver.findElement(forgetLink).click();
    }
    public void fillDetails(){
        driver.findElement(FirstNameField).sendKeys("Dipendra");
        driver.findElement(LastNameField).sendKeys("Shakya");
        driver.findElement(AddressField).sendKeys("Imadol");
        driver.findElement(CityField).sendKeys("Kathmandu");
        driver.findElement(StateField).sendKeys("01");
        driver.findElement(ZipField).sendKeys("0011");
        driver.findElement(SSNField).sendKeys("667");

    }
    public void clickFind(){
        driver.findElement(FindLoginField).click();
    }
    public String forgetPageVerify(){
        return driver.findElement(forgetPageverify).getText();
    }
}

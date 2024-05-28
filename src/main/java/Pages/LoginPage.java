package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    //By usernameField=By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By usernameField=By.xpath("//input[@name='username']");
    By passwordField=By.xpath("//input[@name='password']");
    By LoginButton=By.xpath("//input[@type='submit']");
   // By WelcomeText=By.xpath("//div[@id='leftPanel']//b[.='Welcome']");
    By WelcomeText=By.xpath("//div[@id='leftPanel']//b");
    //Set username here
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);

    }
    public void setPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(LoginButton).click();
    }
    public String verifyLogin(){
        //System.out.println(driver.findElement(WelcomeText).getText());
        return driver.findElement(WelcomeText).getText();
    }
}

package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.PropertyReader;

public class LoginPage {

    private WebDriver driver;
    private static By by = null;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    
	private By txt_username(){
		by = By.xpath(PropertyReader.readORProperty("LOC_TXT_UserName"));
		return by;
	}
 
	private By txt_password(){
		by = By.xpath(PropertyReader.readORProperty("LOC_TXT_Password"));
		return by;
	}
	
	private By btn_login(){
		by = By.xpath(PropertyReader.readORProperty("LOC_BTN_Login"));
		return by;
	}
    
    public void setUsername(String username){
        driver.findElement(txt_username()).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(txt_password()).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(btn_login()).click();
        return new SecureAreaPage(driver);
    }
}
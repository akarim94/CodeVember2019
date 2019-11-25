package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Base.PropertyReader;

public class SecureAreaPage extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    
	private By msg_succss_login(){
		by = By.xpath(PropertyReader.readORProperty("LOC_MSG_Succ_Login"));
		return by;
	}
   
    public String getSuccessMsgText(){
        return driver.findElement(msg_succss_login()).getText();
    }
}

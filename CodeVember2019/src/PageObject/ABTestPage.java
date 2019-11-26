package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Base.PropertyReader;

public class ABTestPage extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public ABTestPage(WebDriver driver){
        this.driver = driver;
    }
		   
 	private By msg_abTest(){
		by = By.xpath(PropertyReader.readORProperty("LOC_MSG_abtest_var"));
		return by;
	}
   
    public String getabTestMsgText(){
        return driver.findElement(msg_abTest()).getText();
    }

}

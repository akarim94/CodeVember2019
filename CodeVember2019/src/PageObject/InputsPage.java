package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;
import Base.PropertyReader;

public class InputsPage extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public InputsPage(WebDriver driver){
        this.driver = driver;
    }
		   
 	private By txt_Number(){
		by = By.xpath(PropertyReader.readORProperty("LOC_TXT_number"));
		return by;
	}
   
    public void enterCharacter(String str){
        driver.findElement(txt_Number()).sendKeys(str);
    }
    
    public void enterNumber(int number){
        driver.findElement(txt_Number()).sendKeys("" + number);
    }
     
    public String getInputValue()
		{
    return driver.findElement(txt_Number()).getAttribute("value");
		}

}

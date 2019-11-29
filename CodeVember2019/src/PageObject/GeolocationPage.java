package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Base.PropertyReader;

public class GeolocationPage extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public GeolocationPage(WebDriver driver){
        this.driver = driver;
    }
 
    private By btn_WhereAmI(){
    	by = By.xpath(PropertyReader.readORProperty("LOC_BTN_whereAmI"));
    	return by;
    	}  		 			   
    
    private By msg_Latitude(){
    	by = By.xpath(PropertyReader.readORProperty("LOC_MSG_latitude"));
    	return by;
    	}   
    
    private By msg_Longitude(){
    	by = By.xpath(PropertyReader.readORProperty("LOC_MSG_longitude"));
    	return by;
    	} 
    
    public void clickWhereAmIButton() throws Exception{
        driver.findElement(btn_WhereAmI()).click();
        Thread.sleep(1000);
    }
    
    public String getLatitude(){
        return driver.findElement(msg_Latitude()).getText();
    }
    
    public String getLongitude(){
        return driver.findElement(msg_Longitude()).getText();
    }
}

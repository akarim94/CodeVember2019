package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Base.PropertyReader;

public class FileUploadPage extends BaseClass {

    private WebDriver driver;
    private static By by = null;

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
   
    private By browse_file(){
    	by = By.xpath(PropertyReader.readORProperty("LOC_BROWSE_file"));
    	return by;
    	}
    		 
    private By btn_upload(){
    	by = By.xpath(PropertyReader.readORProperty("LOC_BTN_Upload"));
    	return by;
    	}

    public FileUploadedPage clickUploadButton(){
        driver.findElement(btn_upload()).click();
        return new FileUploadedPage(driver);
    }
	
    public void uploadFile(String filePath){
        driver.findElement(browse_file()).sendKeys(filePath);
    }


}

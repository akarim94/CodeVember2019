package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    
    public ABTestPage clickABTesting(){
        clickLink("A/B Testing");
        return new ABTestPage(driver);
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    
    public AddRemoveElementsPage clickAddRemoveElements(){
        clickLink("Add/Remove Elements");
        return new AddRemoveElementsPage(driver);
    }

    public CheckBoxesPage clickCheckboxes(){
        clickLink("Checkboxes");
        return new CheckBoxesPage(driver);
    }

    public BrokenImagesPage clickBrokenImages(){
        clickLink("Broken Images");
        return new BrokenImagesPage(driver);
    }
    
    public InputsPage clickInputs(){
        clickLink("Inputs");
        return new InputsPage (driver);
    }
    
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage (driver);
    }
    
    public GeolocationPage clickGeolocation(){
        clickLink("Geolocation");
        return new GeolocationPage (driver);
    }
    
    

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
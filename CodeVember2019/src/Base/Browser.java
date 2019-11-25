package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageObject.*;
import Utility.FilePath;

public class Browser implements FilePath{

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
    	System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
   public void tearDown(){
       driver.quit();
    }
}
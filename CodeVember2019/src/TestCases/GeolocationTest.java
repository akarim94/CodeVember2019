package TestCases;

import Base.Browser;
import org.testng.annotations.Test;

import PageObject.GeolocationPage;
import PageObject.LoginPage;
import PageObject.SecureAreaPage;

import static org.testng.Assert.*;

public class GeolocationTest extends Browser {

    @Test
    public void testGeolocation(){
    	GeolocationPage geolocationPage = homePage.clickGeolocation();
    	try {
			geolocationPage.clickWhereAmIButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Latitude of my location is : " + geolocationPage.getLatitude());
    	System.out.println("Longitude of my location is : " + geolocationPage.getLongitude());
    }
}

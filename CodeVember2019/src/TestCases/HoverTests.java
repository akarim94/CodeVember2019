package TestCases;

import Base.Browser;
import PageObject.HoversPage;
import PageObject.HoversPage.FigureCaption;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests extends Browser {

    @Test
    public void testHoverUsers(){
    	HoversPage hoverspage = homePage.clickHovers();
    	FigureCaption caption = hoverspage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}

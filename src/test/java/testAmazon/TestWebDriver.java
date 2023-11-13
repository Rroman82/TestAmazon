package pageObject.test;

import pageObject.PageObject.AmazonHomePage;
import org.testng.annotations.Test;

public class TestWebDriver extends TestInit {

    @Test
    public void runAmazon() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        AmazonHomePage amazonHomePage1 = new AmazonHomePage(driver);
        amazonHomePage1.navigateAmazon();
        amazonHomePage.getSearchField().sendKeys("hat");
        amazonHomePage.getSearchField().click();
    }

    @Test
    public void clickEnterBtn() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.getEnterBtn().click();

    }

}

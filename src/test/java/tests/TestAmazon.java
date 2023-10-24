package tests;

import PageObject.AmazonHomePage;
import PageObject.AmazonResultsPage;
import PageObject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon extends TestInit {

    @Test
    public void checkHeader() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        Assert.assertTrue(amazonHomePage.getChooseLang().isDisplayed());
        Assert.assertTrue(amazonHomePage.getReturn().isDisplayed());
        Assert.assertTrue(amazonHomePage.getBasket().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearch().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearchImageBtn().isDisplayed());
        Assert.assertTrue(amazonHomePage.getChooseCountry().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearchFieldMonik().isDisplayed());



        AmazonResultsPage amazonSerchResultsPage = new AmazonResultsPage(driver);

    }

    @Test
    public void checkSeach() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        amazonHomePage.getSearchField().sendKeys("hat");
        amazonHomePage.getEnterBtn().click();
    }

    @Test
    public void checkSeachPen() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        amazonHomePage.getSearchField().sendKeys("Pen");
        amazonHomePage.getEnterBtn().click();
    }
    @Test
    public void ChooseCountry(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        amazonHomePage.getChooseCountry().sendKeys("");
        amazonHomePage.getEnterBtn().click();
    }
    @Test
    public void SearchFieldMonik() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        amazonHomePage.getSearchField().sendKeys("Monitor");
        amazonHomePage.getEnterBtn().click();
    }

}

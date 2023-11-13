package testUkrnet;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ukrnet.HomePage;
import testAmazon.TestInit;

public class UkNetHPTest extends TestInit {
    @Test
    public void checkHeader() {
        HomePage ukrNetHomePage = new HomePage(driver);

        ukrNetHomePage.navigate();
        System.out.println();
        driver.navigate().refresh();
        sleep(5);
    }

    @Test
    public void checkLogo() {
//        arrange
        HomePage ukrNetHomePage = new HomePage(driver);
//        act
        ukrNetHomePage.navigate();
        ukrNetHomePage.getCheckLogo().click();
        sleep(5);
//        assert
        Assert.assertTrue(ukrNetHomePage.getCheckLogo().isDisplayed());
    }

    @Test
    public void checkSearchField() {
        HomePage ukrNetHomePage = new HomePage(driver);

        ukrNetHomePage.navigate();
        Assert.assertTrue(ukrNetHomePage.getCheckSearchField().isDisplayed());
        ukrNetHomePage.getCheckSearchField().sendKeys("шини");
        ukrNetHomePage.enterBtnSearch().click();

        Assert.assertTrue(ukrNetHomePage.getCheckSearchField().isDisplayed());
    }

    @Test
    public void btnLanguage() {
        HomePage ukrNetHomePage = new HomePage(driver);

        ukrNetHomePage.navigate();
        ukrNetHomePage.getEnterLanguageBtn().click();

        Assert.assertTrue(ukrNetHomePage.getEnterLanguageBtn().isDisplayed());
    }

    @Test
    public void btnWeather() {
        HomePage ukrNetHomePage = new HomePage(driver);

        ukrNetHomePage.navigate();
        ukrNetHomePage.getWeatherTitle().click();

        Assert.assertTrue(ukrNetHomePage.getWeatherTitle().isDisplayed());
    }

    @Test
    public void btnCurrency() {
        HomePage ukrNetHomePage = new HomePage(driver);

        ukrNetHomePage.navigate();
        ukrNetHomePage.getCurrencyTitle().click();

        Assert.assertTrue(ukrNetHomePage.getCurrencyTitle().isDisplayed());
    }

    @Test
    public void btnFuel() {
        HomePage ukrNetHomePage = new HomePage(driver);

        ukrNetHomePage.navigate();
        ukrNetHomePage.getFuelTitle().click();

        Assert.assertTrue(ukrNetHomePage.getFuelTitle().isDisplayed());
    }

    @Test
    public void btnOracul() {
        HomePage ukrNetHomePage = new HomePage(driver);

        ukrNetHomePage.navigate();
        ukrNetHomePage.getOraculTitle().click();

        Assert.assertTrue(ukrNetHomePage.getOraculTitle().isDisplayed());
    }

    @Test
    public void btnAfisha() {
        HomePage ukrNetHomePage = new HomePage(driver);

        ukrNetHomePage.navigate();
        ukrNetHomePage.getAfishaTitle().click();

        Assert.assertTrue(ukrNetHomePage.getAfishaTitle().isDisplayed());
    }
    @Test
    public void generalHeaderObj(){
        HomePage ukrNetHomePage = new HomePage(driver);

        ukrNetHomePage.navigate();
        ukrNetHomePage.getCheckLogo().click();
        ukrNetHomePage.getCheckSearchField().click();
        ukrNetHomePage.getEnterLanguageBtn().click();
        ukrNetHomePage.getWeatherTitle().click();
        ukrNetHomePage.getCurrencyTitle().click();
        ukrNetHomePage.getFuelTitle().click();
        ukrNetHomePage.getOraculTitle().click();
        ukrNetHomePage.getAfishaTitle().click();

        Assert.assertTrue(ukrNetHomePage.getCheckLogo().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.getCheckSearchField().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.getEnterLanguageBtn().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.getWeatherTitle().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.getCurrencyTitle().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.getFuelTitle().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.getOraculTitle().isDisplayed());
        Assert.assertTrue(ukrNetHomePage.getAfishaTitle().isDisplayed());
    }
}


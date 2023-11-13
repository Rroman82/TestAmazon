package testAmazon;

import pages.Amazon.AmazonHomePage;
import pages.Amazon.AmazonResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestAmazon extends TestInit {
    //    public List<WebElement> listCountry(){
//        return driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']//li//a[contains(text(),'%s')]"));
//    }
    public List<WebElement> iFrame() {
        return driver.findElements(By.xpath("//span[@class='a-button-inner']"));
    }

    public WebElement iFrameBody() {
        return driver.findElement(By.xpath("//div[@id='glow-toaster-body']"));
    }
    public WebElement btnDone(){
        return driver.findElement(By.xpath("//button[@class='a-button-text']"));
    }

    @Test
    public void checkHeader() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        Assert.assertTrue(amazonHomePage.getChooseLang().isDisplayed());
        Assert.assertTrue(amazonHomePage.getReturn().isDisplayed());
        Assert.assertTrue(amazonHomePage.getBasket().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearch().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearchImageBtn().isDisplayed());


        AmazonResultsPage amazonSerchResultsPage = new AmazonResultsPage(driver);

    }

    @Test
    public void checkSeach() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();
        Assert.assertTrue(amazonHomePage.getSearch().isDisplayed());
        amazonHomePage.getSearchField().sendKeys("hat");
        amazonHomePage.getEnterBtn().click();
        Assert.assertTrue(amazonHomePage.getSearch().isDisplayed());

    }

    @Test
    public void checkSeachPen() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();
        Assert.assertTrue(amazonHomePage.getSearchField().isDisplayed());
        amazonHomePage.getSearchField().sendKeys("Pen");
        amazonHomePage.getEnterBtn().click();

    }

    @Test
    public void ChooseCountry() {
        String cityNameItaly = "Italy";
        String cityNameFrance = "France";
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        amazonHomePage.getChooseCountry().click();
        sleep(3);

        amazonHomePage.getListCountries().click();
        sleep(3);
//        String num = "34";
//        int a = Integer.parseInt(num);
//        a > 50 && a <100

        amazonHomePage.clickOnFieldWithName(cityNameFrance).click();
        sleep(10);
//        List<String> country = listCountry().stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
//        country.forEach(System.out::println);
//
//        List<WebElement> countryList = listCountry();
//
//        WebElement italyOption = countryList.stream()
//                .filter(element -> element.getText().equals("Italy"))
//                .findFirst()
//                .orElse(null);
//
//        if (italyOption == null) {
//            throw new NoSuchElementException("Italy option not found");
//        }
//
//        italyOption.click();
//        sleep(10);

        //List<String> country = listCountry().stream("Italy")
        Assert.assertTrue(amazonHomePage.getChooseCountry().isDisplayed());
    }


    @Test
    public void SearchFieldMonik() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        amazonHomePage.getSearchField().sendKeys("Monitor");
        amazonHomePage.getEnterBtn().click();

        Assert.assertTrue(amazonHomePage.getSearchFieldMonik().isDisplayed());
    }

    @Test
    public void ChangeLanguage() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();
        amazonHomePage.btnLang().click();
        amazonHomePage.listLanguages().get(3).click();
        sleep(3);
        Assert.assertTrue(amazonHomePage.getChooseLang().isDisplayed());
    }

    @Test
    public void SelectPrice() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();
        String cityNameFrance = "France";
        amazonHomePage.getChooseCountry().click();
        sleep(3);
        amazonHomePage.getListCountries().click();
        sleep(3);
        amazonHomePage.clickOnFieldWithName(cityNameFrance).click();
        btnDone().click();
        sleep(3);
//        moveToElement(amazonHomePage.btnLang());
//        driver.switchTo().frame(iFrameBody());
//        click(iFrame().get(0));
//        driver.switchTo().defaultContent();
//        sleep(4);
        amazonHomePage.deals().click();
        sleep(4);
        scroll(3200);
        sleep(4);
        amazonHomePage.priceLag().click();
        sleep(7);

//        String num = "79";
//        int a = Integer.parseInt(num);
//     if (a > 50 && a <100) {
//         System.out.println("The number is between 50 and 100");
//              } else {
//         System.out.println("The number is not between 50 and 100");
//     }

        Assert.assertTrue(amazonHomePage.priceLag().isDisplayed());
    }
@Test
    public void SelectAll() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();
        amazonHomePage.btnAll().click();
        scroll(2500);
        sleep(7);
        amazonHomePage.listAll().click();
        sleep(7);
    Assert.assertTrue(amazonHomePage.listAll().isDisplayed());
    }
    @Test
    public void mouseMove(){
        AmazonHomePage amazonHomePage =new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();
        moveToElement(amazonHomePage.getBasket());
        sleep(7);
        //Assert.assertTrue(amazonHomePage.getMouseMove().isDisplayed());
    }
}

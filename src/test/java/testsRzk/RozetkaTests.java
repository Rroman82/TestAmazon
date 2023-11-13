package rozetka.Tests;

import pageObject.test.TestInit;
import rozetka.Pages.RozetHPElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RozetkaTests extends TestInit {

    //@Test
//    public void checkHeader() {
//        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
//        rozetkaHomePage.navigate();
//        System.out.println();
//        driver.navigate().refresh();
//        sleep(7);
     //       }

    @Test
    public void CheckCatalog() {
        RozetHPElements rozetkaHomePage = new RozetHPElements(driver);
        rozetkaHomePage.navigate();
        rozetkaHomePage.getCheckCatalog().click();
        sleep(5);
        Assert.assertTrue(rozetkaHomePage.getCheckCatalog().isDisplayed());
    }

    @Test
    public void checkSmile() {
        RozetHPElements rozetkaHomePage = new RozetHPElements(driver);
        rozetkaHomePage.navigate();
        rozetkaHomePage.getCheckSmile().click();
        sleep(5);
        Assert.assertTrue(rozetkaHomePage.getCheckSmile().isDisplayed());
    }

    @Test
    public void checkCompTech() {
        RozetHPElements rozetkaHomePage = new RozetHPElements(driver);
        rozetkaHomePage.navigate();
        rozetkaHomePage.getCheckCatalog().click();
        rozetkaHomePage.getCheckCompTech().click();
        //rozetkaHomePage.getComp().click();
        sleep(5);
        Assert.assertTrue(rozetkaHomePage.getCheckCompTech().isDisplayed());
        scroll(700);
        sleep(5);
        rozetkaHomePage.getCheckMonik().click();
        Assert.assertTrue(rozetkaHomePage.getCheckMonik().isDisplayed());


    }

    @Test
    public void getChoosePrice() {
        RozetHPElements rozetkaHomePage = new RozetHPElements(driver);
        rozetkaHomePage.navigate();
        rozetkaHomePage.getCheckCompTech().click();
        rozetkaHomePage.getCheckMonik().click();
        rozetkaHomePage.getChoosePrice();
        rozetkaHomePage.showPrice();
    }

    @Test
    public void getChooseGood() {
        RozetHPElements rozetkaHomePage = new RozetHPElements(driver);
        rozetkaHomePage.navigate();
        rozetkaHomePage.getCheckCompTech().click();
        rozetkaHomePage.getCheckMonik().click();
        rozetkaHomePage.getChooseGood().click();
        moveToElement(rozetkaHomePage.getBasket());
        sleep(5);


    }
}

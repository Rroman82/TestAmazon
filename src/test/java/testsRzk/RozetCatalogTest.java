package testsRzk;

import testAmazon.TestInit;
import pages.Rzk.RozetHPElements;
import org.testng.annotations.Test;

public class RozetCatalogTest extends TestInit {

    @Test
    public void testCheckCatalog(){
        RozetHPElements rozetka = new RozetHPElements(driver);
        rozetka.navigate();
        sleep(2);
        rozetka.getCheckCatalog().click();
//        rozetka.getCheckCompTech().click();
        sleep(5);
        rozetka.getCheckMonik().click();

    }
    @Test
    public void showPrice(){
        RozetHPElements rozetka = new RozetHPElements(driver);
        driver.get("https://hard.rozetka.com.ua/monitors/c80089/price=5000-10000/");
    }

}

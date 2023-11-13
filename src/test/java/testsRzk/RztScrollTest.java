package testsRzk;

import testAmazon.TestInit;
import pages.Rzk.RozetHPElements;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RztScrollTest extends TestInit {


@Test
public void getCheckScroll(){
    Actions actions = new Actions(driver);
    RozetHPElements rozetka = new RozetHPElements(driver);
    rozetka.navigate();
    rozetka.getCheckCompTech().click();
    sleep(3);
    actions.moveToElement(driver.findElement(By.xpath("//li[@class='portal-grid__cell ng-star-inserted']//*[@alt= 'Монітори']")));
    click(rozetka.getMonitor());

}
}

package testsRzk;

import org.openqa.selenium.support.ui.*;
import testAmazon.TestInit;
import pages.Rzk.RozetHPElements;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class RzkBasketTEst extends TestInit {

    //driver.manage().implicit Wait(10);

    @Test
    public void getBasket() {
        RozetHPElements rozetka = new RozetHPElements(driver);
        rozetka.navigate();
        rozetka.getCheckCatalog().click();
        sleep(3);
        rozetka.getCheckMonik().click();
        sleep(3);
        rozetka.getBtnBasket().click();
        sleep(3);
        rozetka.getBasket().click();
        sleep(3);
    }

    //    public void getBasket(){
//        RozetHPElements rozetka = new RozetHPElements(driver);
//        rozetka.navigate();
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(elementtobeclickable(By.ByXPath))
    // }
    //____________
//    {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
//        driver.findElement(By.id("adder")).click();
//        WebElement added = driver.findElement(By.id("box0"));
//    }
//_______________

    //explicitwait
//    {
//        WebElement revealed = driver.findElement(By.id("revealed"));
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//
//        driver.findElement(By.id("reveal")).click();
//        wait.until(d -> revealed.isDisplayed());
//        revealed.sendKeys("Displayed");
//    }
    //____________

//    {
//        WebElement revealed = driver.findElement(By.id("revealed"));
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(2))
//                .pollingEvery(Duration.ofMillis(300))
//                .ignoring(ElementNotInteractableException.class);
//
//        driver.findElement(By.id("reveal")).click();
//        wait.until(d -> {
//            revealed.sendKeys("Displayed");
//            return true;
//
//        }
//
//    }
    //___________________

    @Test
    public void getBasket2() {
        RozetHPElements rozetka = new RozetHPElements(driver);
        rozetka.navigate();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class= 'header-actns__item header-actions__item--cart']")));
        rozetka.getCheckCatalog().click();
        rozetka.getCheckMonik().click();
        rozetka.getBtnBasket().click();
        rozetka.getBasket().click();

    }
}









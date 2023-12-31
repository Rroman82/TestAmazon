package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BasePage {
    private static final int WAIT_TIME =15;

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
                    }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public List<WebElement> findListElements(String byf){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(byf)));
    }

    public WebElement waitUntilElementToBeLocated(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public List<WebElement> listElemets(String element){
        return findListElements(element);
    }
    public List<WebElement> listElementsNoWaiter(String element){
        return driver.findElements(By.xpath(element));
    }


}

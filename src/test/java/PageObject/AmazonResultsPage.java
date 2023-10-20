package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.TestInit;

public class AmazonResultsPage extends BasePage {



    public WebElement getResultsField(){
        return driver.findElement(By.xpath(""));
    }


    public AmazonResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultsFieldd(){
        return driver.findElement(By.xpath("//div[@,'RESULTS"));
    }
}

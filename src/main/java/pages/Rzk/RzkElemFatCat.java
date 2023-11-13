package pages.Rzk;

import org.openqa.selenium.WebDriver;
import pages.Amazon.BasePage;

public class RzkElemFatCat extends BasePage {
    public RzkElemFatCat(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        driver.get("https://rozetka.com.ua/ua/");
    }
}


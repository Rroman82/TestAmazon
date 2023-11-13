package pageObject.PageObject;

import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate(){
        driver.get("https://www.amazon.com/");

    }
}

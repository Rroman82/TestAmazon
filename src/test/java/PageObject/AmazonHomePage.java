package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonHomePage extends BasePage {
    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateAmazon() {
        driver.get("https://www.amazon.com/");


        System.out.println(listElementsNoWaiter("//a[@id='icp-nav-flyout']").size() + " On");
        while (listElementsNoWaiter("//a[@id='icp-nav-flyout']").size() == 0) {
            driver.navigate().refresh();
            sleep(2);
        }
    }

    public WebElement getChooseLang() {
        return driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
    }

    public WebElement getReturn() {
        return driver.findElement(By.xpath("//a[@id='nav-orders']"));
    }

    public WebElement getBasket() {
        return driver.findElement(By.xpath("//a[@id='nav-cart']"));
    }

    public WebElement getSearch() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }

    public WebElement getSearchImageBtn() {
        return driver.findElement(By.xpath("//div//input[@id='nav-search-submit-button']"));

    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//div[@class=\"nav-search-field \"]//*[@id=\"twotabsearchtextbox\"]"));
    }

    public WebElement getEnterBtn() {
        return driver.findElement(By.xpath("//div[@class=\"nav-right\"]/*[@class=\"nav-search-submit nav-sprite\"]/*"));
    }

    public WebElement getChooseCountry() {
        return driver.findElement(By.xpath("//a [@id='nav-global-location-popover-link']"));
    }

    public WebElement getEnterBtn2() {
        return driver.findElement(By.xpath("//div//span[@name= 'glowDoneButton']"));
    }

    public WebElement getSearchFieldMonik() {
        return driver.findElement(By.xpath("//div//input[@id= 'twotabsearchtextbox']"));

    }

    public WebElement getEnterBtn3() {
        return driver.findElement(By.xpath("//div//input[@id= 'nav-search-submit-button']"));
    }

    public WebElement getListCountries() {
        return driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));

    }

    public List<WebElement> listCountry() {
        return driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']"));
    }

    public WebElement clickOnFieldWithName(String nameCity){
        return waitUntilElementToBeLocated(String.format("//ul[@class='a-nostyle a-list-link']//li//a[contains(text(),'%s')]", nameCity));
    }
    public List<WebElement> listLanguages(){
        return driver.findElements(By.xpath("//i[@class= 'a-icon a-icon-radio']"));
    }

public WebElement btnLang(){
        return driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
}
public WebElement deals() {
    return driver.findElement(By.xpath("//a[@class='nav-a  '][1]"));
}
    public WebElement btnAll() {
        return driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
    }
    public WebElement listAll(){
        return driver.findElement(By.xpath("//a[@class='hmenu-item'][text()='Customer Service']"));

        }
public WebElement priceLag(){
        return driver.findElement(By.xpath("//a[@class='LinkFilterOption-module__linkFilterOption_k3Xp4bgxEaBmcgTA0UAxc']//span[text()='$50 to $100']"));
         }

    }




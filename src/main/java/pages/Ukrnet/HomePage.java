package pages.Ukrnet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Amazon.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        driver.get("https://www.ukr.net/");
    }

    public WebElement getSearchHeaderField() {
        return driver.findElement(By.xpath("//*[@class= 'header__search']"));
    }

    public WebElement getCheckLogo() {
        return driver.findElement(By.xpath("//*[@class= 'header__logo']"));
    }

    public WebElement getCheckSearchField() {
        return driver.findElement(By.xpath("//div//input[@id='search-input']"));
    }
    public WebElement getEnterSearchBtn(){
        return driver.findElement(By.xpath("//div//input[contains(@value, 'Пошук')]"));
    }
public WebElement getEnterLanguageBtn(){
        return driver.findElement(By.xpath("//div//span[@id='act-lang']"));
}
public  WebElement getWeatherTitle(){
        return driver.findElement(By.xpath("//ul//li[@class='sinoptik current']"));
    }
    public WebElement getCurrencyTitle(){
        return driver.findElement(By.xpath("//ul//li[@class='currency']"));
    }
    public WebElement getFuelTitle(){
        return driver.findElement(By.xpath("//ul//li[@class='fuel']"));
    }
    public WebElement getOraculTitle(){
        return driver.findElement(By.xpath("//ul//li[@class='orakul']"));
    }
    public WebElement getAfishaTitle(){
        return driver.findElement(By.xpath("//ul//li[@class='afisha']"));
    }
    public WebElement generalHaederObj(){
        return driver.findElement(By.xpath(""));
    }
}
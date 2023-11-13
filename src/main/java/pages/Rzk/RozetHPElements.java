package rozetka.Pages;

import pageObject.PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RozetHPElements extends BasePage {

    public RozetHPElements(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        driver.get("https://rozetka.com.ua/");
    }

    public WebElement getCheckCatalog() {
        return driver.findElement(By.xpath("//*[@id= ('fat-menu')]"));
    }

    public WebElement getCheckSmile() {

        return driver.findElement(By.xpath("//*[@alt= ('Rozetka Logo')]"));
    }


    public void navigateRozetka() {
    }

    public WebElement getCheckCompTech() {
        return driver.findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']//li[1]"));
    }


    public WebElement getCheckMonik() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"menu__main-cats\"]//a[contains(text(), 'Монітори')]")));
    ////li[@class='portal-grid__cell ng-star-inserted']//*[@alt= 'Монітори']
    }


    public WebElement getChoosePrice() {
        return driver.findElement(By.xpath(""));
    }

    public WebElement getChooseGood() {
        return driver.findElement(By.xpath("//*[@class=('buy-button goods-tile__buy-button ng-star-inserted buy-button_state_in-cart')]"));
    }

    public WebElement getBasket() {
        return driver.findElement(By.xpath("//*[@class= 'header-actions__item header-actions__item--cart']"));

    }
//public WebElement btnBasket(){
//        return driver.findElement(By.xpath("//*[contains(@href,'p372354219')]//following-sibling::div[contains(@class,'goods-tile__prices')]//app-buy-button"));

//}
    public void showPrice() {
        driver.get("https://hard.rozetka.com.ua/monitors/c80089/price=5000-10000/");

    }


    public WebElement getBtnBasket() {
        return driver.findElement(By.xpath("//*[contains(@href,'p372354219')]//following-sibling::div[contains(@class,'goods-tile__prices')]//app-buy-button"));
    }

    public WebElement getMonitor() {
        return driver.findElement(By.xpath("//li[@class='portal-grid__cell ng-star-inserted']//*[@alt= 'Монітори']"));
    }
}


    //public WebElement getChoosePrice(){
    // return driver.findElement(By.xpath());




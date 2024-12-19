package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SecurePage {
    private WebDriver driver;
    public SecurePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    // Locators
    private By buttonLogout = By.cssSelector("#content > div > a > i");

    // Actions
    public  void clickButtonLogout(){
        driver.findElement(buttonLogout).click();
    }

}

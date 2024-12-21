package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // Locators
    private By nameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By errorMessage = By.id("flash");
    // Actions
    public By getNameInput() {
        return nameInput;
    }

    public void setNameInput(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    public void setPasswordInput(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickButtonLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

}

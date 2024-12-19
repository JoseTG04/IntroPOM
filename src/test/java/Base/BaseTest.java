package Base;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;

    @BeforeTest
    public void setup(){
        driver = DriverManager.getDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);

    }
    @AfterTest
    public void tearDown(){
//        driver.quit();
    }
}

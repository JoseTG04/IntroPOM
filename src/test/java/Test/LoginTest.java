package Test;

import Base.BaseTest;
import Pages.SecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        loginPage.setNameInput("tomsmith");
        loginPage.setPasswordInput("SuperSecretPassword!");
        loginPage.clickButtonLogin();

        SecurePage securePage = new SecurePage(driver);
        securePage.clickButtonLogout();
    }
}

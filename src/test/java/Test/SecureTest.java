package Test;

import Base.BaseTest;
import Pages.SecurePage;
import org.testng.annotations.Test;

public class SecureTest extends BaseTest {

    @Test
    public void testValidLogout(){
        loginPage.setNameInput("tomsmith");
        loginPage.setPasswordInput("SuperSecretPassword!");
        loginPage.clickButtonLogin();

        SecurePage securePage = new SecurePage(driver);
        securePage.clickButtonLogout();
    }
}

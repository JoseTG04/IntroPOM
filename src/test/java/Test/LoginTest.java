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

    @Test
    public void testInvalidLogin(){
        loginPage.setNameInput("tomsmith");
        loginPage.setPasswordInput("123456");
        loginPage.clickButtonLogin();

        System.out.println(loginPage.getErrorMessage());
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Your password"));
//        Assert.assertTrue(errorMessage.contains("Your username"));

    }
}

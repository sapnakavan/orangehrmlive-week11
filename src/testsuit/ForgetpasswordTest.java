package testsuit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class ForgetpasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        //* Verify the text ‘Forgot Your Password?’
        String actualmess = getTextFromElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        String expectedmess = "Forgot your password?";

        Assert.assertEquals(expectedmess, actualmess);
        //* click on the ‘Forgot your password’ link
        clickOnElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));



    }

    @After
    public void teardown() {
        closeBrowser();
    }
}

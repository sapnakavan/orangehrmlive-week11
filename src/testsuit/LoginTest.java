package testsuit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        // * Enter “Admin” username
        sendKeysToElement(By.xpath("//input[@name='username']"),"Admin");

        //* Enter “admin123 password
        sendKeysToElement(By.xpath("//input[@name='password']"),"admin123");

        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@type='submit']"));


        //  * Verify the ‘Configuration’ text is display
        String actualmess = getTextFromElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']"));
        String expectedmess = "Configuration";

        Assert.assertEquals(expectedmess,actualmess);
    }
    @After
    public void teardown () {
        closeBrowser();
    }

}

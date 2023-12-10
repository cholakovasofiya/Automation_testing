package tests.noviniSite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestRegistrationForm extends TestPageNoviniSite {

    public void dataInputSetUp(String email, String username) {
        emailInput = email;
        usernameInput = username;

    }

    @Test
    public void registrationUser() throws InterruptedException {

        //temporary email used
        dataInputSetUp("pzr89357@zbock.com", "pzr89357");

        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/?signup");
        chromeDriver.findElement(By.id("tds_register_email")).sendKeys(emailInput);
        chromeDriver.findElement(By.id("tds_register_user")).sendKeys(usernameInput);
        chromeDriver.findElement(By.id("tds_register_pass")).sendKeys(passwordInput);
        chromeDriver.findElement(By.id("tds_register_retype_pass")).sendKeys(passwordInput);
        chromeDriver.findElement(By.id("tds_register_button")).click();

        Thread.sleep(5000);
        String textMessage = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tds-register-div\"]/div[1]/div[2]")).getText();
        Assert.assertEquals
                ("Please check your email (inbox or spam folder) to validate your account.",
                        textMessage);

    }
}

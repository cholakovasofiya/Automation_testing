package tests.noviniSite.login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import tests.noviniSite.TestPageNoviniSite;

public class TestLoginPage extends TestPageNoviniSite {
    @Test
    public void signIn() throws InterruptedException {
        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/");

        chromeDriver.findElement(By.id("tds_login_email")).sendKeys(emailInput);
        chromeDriver.findElement(By.id("tds_login_pass")).sendKeys(passwordInput);
        chromeDriver.findElement(By.id("tds_login_button")).click();
        Thread.sleep(5000);
        String url = chromeDriver.getCurrentUrl();
        String textDisplayed = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_97\"]/div/div/div/div/div/div/div/h3")).getText();

        Assert.assertEquals("My Account", textDisplayed);
        Assert.assertEquals("https://novini.site/my-account-downtown_pro/", url);
        Thread.sleep(3000);

    }


}

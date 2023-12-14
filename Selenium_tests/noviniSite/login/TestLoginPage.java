package test.noviniSite.login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.noviniSite.TestPageNoviniSite;

public class TestLoginPage extends TestPageNoviniSite {

    // valid email and valid password
    @Test
    public void signInEmail() throws InterruptedException {
        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/");

        chromeDriver.findElement(By.id("tds_login_email")).sendKeys(emailInput);
        chromeDriver.findElement(By.id("tds_login_pass")).sendKeys(passwordInput);
        chromeDriver.findElement(By.id("tds_login_button")).click();


        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("tds_login_button")));
        String url = chromeDriver.getCurrentUrl();
        String textDisplayed = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_97\"]/div/div/div/div/div/div/div/h3")).getText();

        Assert.assertEquals("My Account", textDisplayed);
        Assert.assertEquals("https://novini.site/my-account-downtown_pro/", url);

    }

    // valid username and valid password
    @Test
    public void signInUsername() throws InterruptedException {
        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/");

        chromeDriver.findElement(By.id("tds_login_email")).sendKeys(usernameInput);
        chromeDriver.findElement(By.id("tds_login_pass")).sendKeys(passwordInput);
        chromeDriver.findElement(By.id("tds_login_button")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("tds_login_button")));
        String url = chromeDriver.getCurrentUrl();
        String textDisplayed = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_97\"]/div/div/div/div/div/div/div/h3")).getText();

        Assert.assertEquals("My Account", textDisplayed);
        Assert.assertEquals("https://novini.site/my-account-downtown_pro/", url);

    }


    //valid username and invalid password
    @Test
    public void signInWrongPassword() throws InterruptedException {
        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/");

        chromeDriver.findElement(By.id("tds_login_email")).sendKeys(usernameInput);
        chromeDriver.findElement(By.id("tds_login_pass")).sendKeys(wrongPassword);
        chromeDriver.findElement(By.id("tds_login_button")).click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"tds-login-div\"]/div[1]/div[2]"), "User or password incorrect!"));
        String url = chromeDriver.getCurrentUrl();
        String textDisplayed = chromeDriver.findElement(By.xpath("//*[@id=\"tds-login-div\"]/div[1]/div[2]")).getText();

        Assert.assertEquals("User or password incorrect!", textDisplayed);

    }

    // case-sensitive username/email field
    @Test
    public void signInUsernameCaseSensitive() throws InterruptedException {
        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/");

        chromeDriver.findElement(By.id("tds_login_email")).sendKeys(emailInput.toUpperCase());
        chromeDriver.findElement(By.id("tds_login_pass")).sendKeys(passwordInput);
        chromeDriver.findElement(By.id("tds_login_button")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("tds_login_button")));

        String url = chromeDriver.getCurrentUrl();
        String textDisplayed = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_97\"]/div/div/div/div/div/div/div/h3")).getText();
        Assert.assertEquals("My Account", textDisplayed);
        Assert.assertEquals("https://novini.site/my-account-downtown_pro/", url);

    }

}

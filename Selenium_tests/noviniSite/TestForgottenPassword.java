package test.noviniSite;

import jdk.jfr.Name;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestForgottenPassword extends TestPageNoviniSite {
    @Test
    public void buttonIsClickable() throws InterruptedException {
        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/");
        WebElement forgotPasswordButton = chromeDriver.findElement(By.xpath(Constants.FORGOT_PASSWORD_BUTTON));
        wait.until(ExpectedConditions.elementToBeClickable(forgotPasswordButton));
        forgotPasswordButton.click();
        String url = chromeDriver.getCurrentUrl();
        Assert.assertEquals(url, "https://novini.site/login-register-downtown_pro/?password_recovery");
        String txtDisplayed = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tdi_103\"]/div/div[2]/div/div/div[2]/div/div[1]/h2")).getText();
        Assert.assertEquals(txtDisplayed, "Password recovery");
    }

    @Test
    @Name("Password recovery")
    public void passwordRecovery() throws InterruptedException {
        buttonIsClickable();

        WebElement emailRecoveryPassword = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tds_forgot_email\"]"));
        emailRecoveryPassword.click();
        emailRecoveryPassword.sendKeys("0juxkhps6e@skygazerhub.com");
        WebElement recoveryPasswordButton = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tds_forgot_button\"]"));
        recoveryPasswordButton.click();
        WebElement txtPasswordRecovery = chromeDriver.findElement(By.xpath
                ("//*[@id=\"td-forgot-pass-div\"]/div[1]/div[2]"));
        wait.until(ExpectedConditions.textToBePresentInElement(txtPasswordRecovery, "Your password is reset, check your email."));

    }


}


package test.noviniSite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TestHiddenLoginMenu extends TestPageNoviniSite{

    @Test
    public void hiddenLoginMenuShowUp () throws InterruptedException {
        pageDisplayAndCookiesClosure();

        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //scrolling up to unveil the hidden login menu
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollBy(0,250)", "");

        Actions actionHover = new Actions(chromeDriver);
        WebElement myAccountButton = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tdi_92\"]/div/div[1]/span"));
        WebElement loginButton = chromeDriver.findElement(By.cssSelector
                ("#tdi_92 > div > div.tdw-wml-menu.tdw-wml-guest > div >" +
                        " div.tdw-wml-menu-content > a.tdw-wml-login-link.tdw-wml-popup"));
        //hover to drop down the submenu of login/register
        actionHover.moveToElement(myAccountButton);
        actionHover.moveToElement(loginButton).build().perform();
        loginButton.click();

        String urlLoginPage = chromeDriver.getCurrentUrl();

        Assert.assertEquals("https://novini.site/login-register-downtown_pro/"
                , urlLoginPage);

        String txtLoginRegister = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tdi_97\"]/div/div/div/div/div/div/div/h3")).getText();
Assert.assertEquals("Login / Register", txtLoginRegister);
    }
}

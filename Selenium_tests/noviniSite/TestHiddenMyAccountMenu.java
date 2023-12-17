package test.noviniSite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestHiddenMyAccountMenu extends TestPageNoviniSite {
    public void scroll() {
        //scrolling up to unveil the hidden login menu
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    public void hover() {
        Actions actionHover = new Actions(chromeDriver);
        WebElement myAccountButton = chromeDriver.findElement(By.xpath
                (Constants.HIDDEN_ACCOUNT_BUTTON));
        wait.until(d -> myAccountButton.isDisplayed());

        //hover to drop down the submenu of login/register
        actionHover.moveToElement(myAccountButton).build().perform();

    }

    public void hiddenButtonClick(String cssSelectorButton) {
        WebElement button = chromeDriver.findElement(By.cssSelector
                (cssSelectorButton));
        wait.until(d -> button.isDisplayed());

        button.click();
    }


    @Test
    public void hiddenLoginButton() throws InterruptedException {
        pageDisplayAndCookiesClosure();

        scroll();
        hover();
        hiddenButtonClick(Constants.HIDDEN_LOGIN_BUTTON);

        String urlLoginPage = chromeDriver.getCurrentUrl();
        Assert.assertEquals("https://novini.site/login-register-downtown_pro/"
                , urlLoginPage);

        String txtLoginRegister = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tdi_97\"]/div/div/div/div/div/div/div/h3")).getText();
        Assert.assertEquals("Login / Register", txtLoginRegister);
    }

    @Test
    public void hiddenRegisterButton() throws InterruptedException {
        pageDisplayAndCookiesClosure();
        scroll();
        hover();

        hiddenButtonClick(Constants.HIDDEN_REGISTER_BUTTON);

        String urlSighUpPage = chromeDriver.getCurrentUrl();

        Assert.assertEquals("https://novini.site/login-register-downtown_pro/?signup"
                , urlSighUpPage);

        String txtSignUp = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tdi_103\"]/div/div[2]/div/div/div[2]/div/div[1]/h2")).getText();
        Assert.assertEquals("Sign up", txtSignUp);
    }
}
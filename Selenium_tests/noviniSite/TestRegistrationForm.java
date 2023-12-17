package test.noviniSite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestRegistrationForm extends TestPageNoviniSite {

    public void dataInputSetUp(String email, String username) {
        emailInput = email;
        usernameInput = username;
    }


    //registration temporary email used
    @Test
    public void registrationUser() throws InterruptedException {

        //temporary email used
        dataInputSetUp("spp51950@omeie.com", "spp51");

        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/?signup");
        chromeDriver.findElement(By.id(Constants.EMAIL_REGISTER)).sendKeys(emailInput);
        chromeDriver.findElement(By.id(Constants.USERNAME_REGISTER)).sendKeys(usernameInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER_RETYPE)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.REGISTER_BUTTON)).click();

        WebElement element = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tds-register-div\"]/div[1]/div[2]"));
        wait.until(d -> element.isDisplayed());
        String textMessage = element.getText();
        Assert.assertEquals
                ("Please check your email (inbox or spam folder) to validate your account.",
                        textMessage);

    }

    //registration with already existed user
    @Test
    public void registrationExistedUsername() throws InterruptedException {

//registration with valid email and existed username
        dataInputSetUp("lxf03353@zbock.com", "pzr89357");

        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/?signup");
        chromeDriver.findElement(By.id(Constants.EMAIL_REGISTER)).sendKeys(emailInput);
        chromeDriver.findElement(By.id(Constants.USERNAME_REGISTER)).sendKeys(usernameInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER_RETYPE)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.REGISTER_BUTTON)).click();


        WebElement element = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tds-register-div\"]/div[1]/div[2]"));
        wait.until(d -> element.isDisplayed());
        String textMessage = element.getText();
        Assert.assertEquals
                ("User already exists!", textMessage);

    }


    //registration with already registered email
    @Test
    public void registrationExistedEmail() throws InterruptedException {

// existed email and valid username
        dataInputSetUp("tuozuvdrqvodedddap@cazlp.com", "pzr89358");

        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/?signup");
        chromeDriver.findElement(By.id(Constants.EMAIL_REGISTER)).sendKeys(emailInput);
        chromeDriver.findElement(By.id(Constants.USERNAME_REGISTER)).sendKeys(usernameInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER_RETYPE)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.REGISTER_BUTTON)).click();

        WebElement element = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tds-register-div\"]/div[1]/div[2]"));
        wait.until(d -> element.isDisplayed());
        String textMessage = element.getText();

        Assert.assertEquals
                ("Email already exists!", textMessage);

    }

    // registration empty username field
    @Test
    public void registrationEmptyUsernameField() throws InterruptedException {


        dataInputSetUp("tuozuvdrqvodedddap@cazlp.com", "");

        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/?signup");
        chromeDriver.findElement(By.id(Constants.EMAIL_REGISTER)).sendKeys(emailInput);
        chromeDriver.findElement(By.id(Constants.USERNAME_REGISTER)).sendKeys(usernameInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER_RETYPE)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.REGISTER_BUTTON)).click();

        WebElement element = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tds-register-div\"]/div[1]/div[2]"));
        wait.until(d -> element.isDisplayed());
        String textMessage = element.getText();
        Assert.assertEquals
                ("Username incorrect!", textMessage);
    }

    // registration empty/incorrect email field
    @Test
    public void registrationIncorrectEmail() throws InterruptedException {


        dataInputSetUp("", "tuozuv");

        pageDisplayAndCookiesClosure();

        chromeDriver.navigate().to("https://novini.site/login-register-downtown_pro/?signup");
        chromeDriver.findElement(By.id(Constants.EMAIL_REGISTER)).sendKeys(emailInput);
        chromeDriver.findElement(By.id(Constants.USERNAME_REGISTER)).sendKeys(usernameInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.PASSWORD_REGISTER_RETYPE)).sendKeys(passwordInput);
        chromeDriver.findElement(By.id(Constants.REGISTER_BUTTON)).click();

        WebElement element = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tds-register-div\"]/div[1]/div[2]"));
        wait.until(d -> element.isDisplayed());
        String textMessage = element.getText();
        Assert.assertEquals
                ("Email incorrect!", textMessage);
    }
}

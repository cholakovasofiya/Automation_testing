package test.noviniSite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestPageNoviniSite {
    protected WebDriver chromeDriver = null;
    protected WebDriverWait wait = null;

    //temporary email used
    protected String emailInput = "pzr89357@zbock.com";
    protected String usernameInput = "pzr89357";
    protected String passwordInput = "Sofiya123!@#";
    protected String wrongPassword = "Pass123";

    protected void pageDisplayAndCookiesClosure() throws InterruptedException {
        chromeDriver.get("https://novini.site/");
        WebElement cookiesClosureButton = chromeDriver.findElement(By.xpath(Constants.COOKIES_CLOSURE));
        wait.until(d -> cookiesClosureButton.isDisplayed());
        cookiesClosureButton.click();

    }


    public void scroll() {
        //scrolling up to unveil the hidden login menu
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollBy(0,350)", "");
    }


    public void hover(String xpathElement) {
        Actions actionHover = new Actions(chromeDriver);
        WebElement myAccountButton = chromeDriver.findElement(By.xpath
                (xpathElement));
        wait.until(d -> myAccountButton.isDisplayed());

        //hover to drop down the submenu of login/register
        actionHover.moveToElement(myAccountButton).build().perform();
    }

    public void loginBypass(String cookieUsername, String cookiePassword) {
        Cookie username = new Cookie("wordpress_logged_in_2c8cb764c68c7b13821894b86f7a854b", cookieUsername);
        Cookie password = new Cookie("passwordUser", cookiePassword
        );
        chromeDriver.manage().addCookie(username);
        chromeDriver.manage().addCookie(password);
    }


    @Before
    public void setUp() {
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        chromeDriver.manage().window().maximize();

    }


    @After
    public void browserClosure() {
        chromeDriver.close();
        chromeDriver.quit();
    }


}

package test.noviniSite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        WebElement cookiesClosureButton = chromeDriver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[2]"));
        wait.until(d -> cookiesClosureButton.isDisplayed());
        cookiesClosureButton.click();

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

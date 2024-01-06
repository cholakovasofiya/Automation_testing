package test.practice;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeAutomationSite {
    protected WebDriver chromeDriver = null;
    protected WebDriverWait wait = null;

    protected void pageDisplayAndCookiesClosure() throws InterruptedException {
        chromeDriver.get("https://practice.automationtesting.in//");
        WebElement cookiesClosureButton = chromeDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
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


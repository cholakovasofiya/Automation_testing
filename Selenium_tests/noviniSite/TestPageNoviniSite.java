package test.noviniSite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageNoviniSite {
    protected WebDriver chromeDriver = new ChromeDriver();

    //temporary email used
    protected String emailInput = "pzr89357@zbock.com";
    protected String usernameInput = "pzr89357";
    protected String passwordInput = "Sofiya123!@#";
    protected  String wrongPassword = "Pass123";


    @Before
    public void setUp() {

        chromeDriver.manage().window().maximize();

    }


    @Test
    public void pageDisplayAndCookiesClosure() throws InterruptedException {
        chromeDriver.get("https://novini.site/");
        chromeDriver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[2]")).click();
        Thread.sleep(3000);
    }


    @After
    public void browserClosure() {
        chromeDriver.close();
        chromeDriver.quit();
    }


}

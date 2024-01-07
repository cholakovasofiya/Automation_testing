package test.practice;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeAutomationSite {
    @FindBy(xpath = Constants.BTN_SHOP)
    public WebElement shopButton;

    protected WebDriver chromeDriver = null;
    protected WebDriverWait wait = null;
    @FindBy(xpath = Constants.SLIDER_DRAG_DROP)
    WebElement dragDropSlider;

    @FindBy(xpath = Constants.BTN_FILTER)
    WebElement buttonFilter;

    @FindBy(xpath = Constants.BTN_HOME)
    WebElement homeButton;

    protected void pageDisplayAndCookiesClosure() throws InterruptedException {
        chromeDriver.get("https://practice.automationtesting.in//");
        WebElement cookiesClosureButton = chromeDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]"));
        wait.until(d -> cookiesClosureButton.isDisplayed());
        cookiesClosureButton.click();
    }

    public void clickButton(WebElement btn) {
        btn.click();
    }

    public void dragAndDrop() {
        Actions actions = new Actions(chromeDriver);
        actions.dragAndDropBy(this.dragDropSlider, 103, 0).build().perform();

    }


    @Before
    public void setUp() {

        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        chromeDriver.manage().window().maximize();
        PageFactory.initElements(chromeDriver, this);
    }

    @After
    public void browserClosure() {
        chromeDriver.close();
        chromeDriver.quit();
    }

}


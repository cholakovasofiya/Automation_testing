package novinite_site;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClassNoviniSite {


    public static WebDriver driver;
    public static WebDriverWait wait;
    public static DesiredCapabilities capabilities;
    public static ChromeOptions options;

    public static String validUsername = "pzr89357";
    public static String invalidUsername = "test123456";
    public static String validPassword = "Sofiya123!@#";
    public static String wrongPassword = "test123456";


    @FindBy(xpath = ConstantsNoviniSite.PASSWORD_FIELD)
    public static WebElement password_field_login;
    @FindBy(xpath = ConstantsNoviniSite.MY_ACCOUNT_BTN)
    public static WebElement myAccountButton;
    @FindBy(xpath = ConstantsNoviniSite.LOGIN_BTN_DROP_DOWN_MENU)
    public static WebElement loginButtonDropDown;

    @FindBy(xpath = ConstantsNoviniSite.BUTTON_LOGIN)
    public static WebElement buttonForLogin;

    @FindBy(xpath = ConstantsNoviniSite.USERNAME_FIELD)
    public static WebElement username_field_login;

    public static void browserClose() {
        driver.close();
        driver.quit();
    }


    public void browserSetUp() {

        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.addArguments("load-extension=C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\cjpalhdlnbpafiamejdnhcphjbkeiagm\\1.54.0_0");
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(EdgeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get(ConstantsNoviniSite.URL);

        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }


    public void fillInField(WebElement element, String argument) {
        element.click();
        element.clear();
        element.sendKeys(argument);
    }

    public void hover(WebElement element) {
        Actions actionHover = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOf(element));
        //hover to drop down the submenu of login/register
        actionHover.moveToElement(element).build().perform();


    }

    public void scroll() {
        //scrolling up to unveil the hidden login menu
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    protected void cookiesClosure() throws InterruptedException {

        WebElement cookiesClosureButton = driver.findElement(By.xpath(ConstantsNoviniSite.COOKIES_CLOSURE));
        wait.until(d -> cookiesClosureButton.isDisplayed());
        cookiesClosureButton.click();

    }
}



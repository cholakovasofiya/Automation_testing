package novinite_site.step_definitions_login;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import novinite_site.BaseClassNoviniSite;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Hooks extends BaseClassNoviniSite {

    @Before
    public void setUp() throws InterruptedException {
        browserSetUp();
        cookiesClosure();
    }

    @After
    public void close() {
        browserClose();
    }

    @Given("user navigates to myAccountMenu")
    public void user_navigates_to_my_account_menu() {
        scroll();
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        hover(myAccountButton);
        wait.until(ExpectedConditions.elementToBeClickable(loginButtonDropDown));
        loginButtonDropDown.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://novini.site/login-register-downtown_pro/");
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        buttonForLogin.click();


    }


}

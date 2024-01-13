package novinite_site.step_definitions_login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import novinite_site.BaseClassNoviniSite;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StepDefinitionsLogin extends BaseClassNoviniSite {


    @Given("user enters valid username in the username field")
    public void user_enters_valid_username_in_the_username_field() {
        wait.until(ExpectedConditions.visibilityOf(username_field_login));
        fillInField(username_field_login, validUsername);

    }

    @Given("user enters valid password in the password field")
    public void user_enters_valid_password_in_the_password_field() {
        wait.until(ExpectedConditions.visibilityOf(password_field_login));
        fillInField(password_field_login, validPassword);

    }


    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        wait.until(ExpectedConditions.invisibilityOf(buttonForLogin));
        String messageProfile = driver.findElement(By.xpath("//*[@id=\"t" +
                "di_97\"]/div/div/div/div/div/div/div/h3")).getText();
        Assert.assertEquals(messageProfile, "My Account");
    }

    @Given("user enters invalid username in the username field")
    public void userEntersInvalidUsernameInTheUsernameField() {
        wait.until(ExpectedConditions.visibilityOf(username_field_login));
        fillInField(username_field_login, invalidUsername);
    }

    @And("user enters wrong password in the password field")
    public void userEntersWrongPasswordInThePasswordField() {
        wait.until(ExpectedConditions.visibilityOf(password_field_login));
        fillInField(password_field_login, wrongPassword);
    }

    @Then("error message is displayed")
    public void errorMessageIsDisplayed() {

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"tds-login-div\"]/div[1]/div[2]"));
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        String error = errorMessage.getText();

        Assert.assertEquals("User or password incorrect!", error);
    }

}

package test.noviniSite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;

import java.io.File;

public class TestMyAccount extends TestPageNoviniSite {


    //verified user : asdf
    @Test
    public void pictureUploadVerifiedUser() throws InterruptedException {
        pageDisplayAndCookiesClosure();
        loginBypass(Constants.COOKIE_VERIFIED_USERNAME, Constants.COOKIE_VERIFIED_USERNAME_PASS);
        chromeDriver.navigate().to("https://novini.site/my-account-downtown_pro/?account_details");
        String txt = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_103\"]/div/div/div/div/div/di" +
                "v[2]/div/div/div[1]/div[1]/div")).getText();
        Assert.assertEquals(txt, "Manage your account details.");

        File pictureUpload = new File("src/test/java/test/resources/pic.jpeg");
        WebElement pictureUploadBox = chromeDriver.findElement(By.xpath(Constants.PROFILE_PICTURE));
        pictureUploadBox.sendKeys(pictureUpload.getAbsolutePath());

        WebElement buttonSave = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_103\"]/div/div/div/div/div/div[2]/div/" +
                "div/div[1]/div[2]/form/div[2]/button"));
//        wait.until(ExpectedConditions.elementToBeClickable(buttonSave));
        buttonSave.click();

        String txtDisplayed = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_103\"]/div/div/div/div/div/div[2]/div/div/div[1]/div")).getText();
        Assert.assertEquals(txtDisplayed, "Account details changed successfully.");


    }

    // unverified user : pzr89357
    @Test
    public void pictureUploadUnverifiedUser() throws InterruptedException {
        pageDisplayAndCookiesClosure();
        loginBypass(Constants.COOKIE_UNVERIFIED_USERNAME, Constants.COOKIE_UNVERIFIED_USERNAME_PASS);
        chromeDriver.navigate().to("https://novini.site/my-account-downtown_pro/?account_details");
        String txt = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_103\"]/div/div/di" +
                "v/div/div/div[2]/div[1]/div[1]")).getText();
        Assert.assertEquals(txt, "Please activate your account by following the link sent to your email address.");


        //name and surname fields mandatory
        chromeDriver.findElement(By.id("tds-first-name")).sendKeys("Johny");
        chromeDriver.findElement(By.id("tds-last-name")).sendKeys("Johnson");

        File pictureUpload = new File("src/test/java/test/resources/pic.jpeg");
        WebElement pictureUploadBox = chromeDriver.findElement(By.xpath(Constants.PROFILE_PICTURE));
        pictureUploadBox.sendKeys(pictureUpload.getAbsolutePath());

        WebElement buttonSave = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_103\"]/div/div/div/div/div/div[2]/div/" +
                "div/div[1]/div[2]/form/div[2]/button"));
        buttonSave.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tdi_103\"]/div/div/div/div/div/div[2]/div[2]/div/div[1]/ul")));
        String txtDisplayed = chromeDriver.findElement(By.cssSelector("#tdi_103 > div > div > div > div > div > div.tds-s" +
                "-acc-content > div.td_block_wrap.tds_account_details.tdi_108.td_block_template_1 > div > div.tds-s-notif.tds" +
                "-s-no" +
                "tif-sm.tds-s-notif-error > ul > li:nth-child(2)")).getText();
        Assert.assertEquals(txtDisplayed, "In order to update this filed, you have to activate your account.");
    }

    @AfterTest
    public void passwordChange() throws InterruptedException {
        pageDisplayAndCookiesClosure();
        loginBypass(Constants.COOKIE_VERIFIED_USERNAME, Constants.COOKIE_VERIFIED_USERNAME_PASS);
        chromeDriver.navigate().to("https://novini.site/my-account-downtown_pro/?account_details");

        WebElement currentPass = chromeDriver.findElement(By.id("tds-current-pass"));
        currentPass.click();
        currentPass.sendKeys(passwordInput);

        WebElement newPass = chromeDriver.findElement(By.id("tds-new-pass"));
        newPass.click();
        newPass.sendKeys("Asdf123");

        WebElement newPassRetype = chromeDriver.findElement(By.id("tds-retype-new-pass"));
        newPassRetype.click();
        newPassRetype.sendKeys("Asdf123");
        WebElement buttonSave = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_103\"]/div/div/div/div/div/div[2]/div/" +
                "div/div[1]/div[2]/form/div[2]/button"));
        buttonSave.click();

        String txtDisplayed = chromeDriver.findElement(By.xpath("//*[@id=\"tdi_103\"]/div/div/div/div/div/div[2]/div/div/div[1]/div")).getText();
        Assert.assertEquals(txtDisplayed, "Account details changed successfully.");


    }


}

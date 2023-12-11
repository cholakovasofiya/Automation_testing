package tests.noviniSite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TestSearchField extends TestPageNoviniSite {

    @Test
    public void searchInput() throws InterruptedException {
        pageDisplayAndCookiesClosure();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement searchButton = chromeDriver.findElement(By.cssSelector("#tdi_39 > div > div.vc_column.tdi_64.wpb_column.vc_column_container.tdc-column.td-pb-span3 > div > div > div > a > span > svg"));
//        Thread.sleep(3000);
        searchButton.click();
        String wordToSearch = "избори кмет";
//        Thread.sleep(3000);
        WebElement searchField = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tdi_39\"]/div/div[4]/div/div/div/div/div/form/div/input"));
        searchField.sendKeys(wordToSearch, Keys.ENTER);
//        Thread.sleep(3000);

        String foundedResult = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tdi_97\"]/div/div[2]/div/div[2]/div/h1/span")).getText();
        Assert.assertEquals("Намерихте:", foundedResult);
    }
}

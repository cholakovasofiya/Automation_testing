package test.noviniSite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TestSearchField extends TestPageNoviniSite {

    @Test
    public void searchInput() throws InterruptedException {
        pageDisplayAndCookiesClosure();
//        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement searchButton = chromeDriver.findElement(By.cssSelector(Constants.SEARCH_BUTTON));

        searchButton.click();
        String wordToSearch = "избори кмет";

        WebElement searchField = chromeDriver.findElement(By.xpath
                (Constants.SEARCH_FIELD));
        wait.until(d->searchField.isDisplayed());
        searchField.sendKeys(wordToSearch, Keys.ENTER);


        String foundedResult = chromeDriver.findElement(By.xpath
                ("//*[@id=\"tdi_97\"]/div/div[2]/div/div[2]/div/h1/span")).getText();
        Assert.assertEquals("Намерихте:", foundedResult);
    }
}

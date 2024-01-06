package test.practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ShopMenu extends PracticeAutomationSite {



    @Test
    public void checkCountSlides() throws InterruptedException {
        pageDisplayAndCookiesClosure();


        List<WebElement> images = chromeDriver.findElements(By.xpath("//*[@decoding=\"async\" and @class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\" ]"));
        List<String> slideNames = new ArrayList<>();

        for (WebElement element : images) {
            slideNames.add(element.getAttribute("alt"));
        }
        System.out.println(images.size());
        System.out.println(slideNames);

Assert.assertEquals(3,images.size());
    }
}



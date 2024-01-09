package test.practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ShopMenuPage extends PracticeAutomationSite {


    // Test case 1:Home page with three sliders only
    @Test
    public void checkCountSlides() {
        chromeDriver.get(URL);

        clickButton(this.shopButton);
        clickButton(this.homeButton);

        List<WebElement> images = chromeDriver.findElements(By.xpath("//*[@decoding=\"async\" and @class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\" ]"));
        List<String> slideNames = new ArrayList<>();

        for (WebElement element : images) {
            slideNames.add(element.getAttribute("alt"));
        }
        System.out.println(images.size());
        System.out.println(slideNames);

        Assert.assertEquals(3, images.size());
    }

    // TEST ShopMenu / Test case 1 Filter by price functionality
    @Test
    public void filterPriceProduct() throws InterruptedException, MalformedURLException {
        chromeDriver.get(URL);
        clickButton(this.shopButton);
        dragAndDrop();
        clickButton(this.buttonFilter);

        String urlHref = chromeDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/" +
                "li[2]/a[2]")).getAttribute("href");


        URL url = new URL(urlHref);
        String[] params = url.getQuery().split("&");
        System.out.printf(params[0] + "\n");
        System.out.printf(params[1]);

    }

}



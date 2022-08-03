import base.TestBase;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.PDP;
import pages.PLP;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class TestAddingProductToCart extends TestBase {
    HomePage homeObject;
    PLP plpObject;
    PDP pdpObject;
    CheckoutPage checkoutObject;

    @Test
    public void addItemToCart()
    {
        homeObject = new HomePage(driver);
        homeObject.goToFullCollection();
        plpObject = new PLP(driver);
        plpObject.addFirstItemToCart();
        pdpObject = new PDP(driver);

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-product-details[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h1[1]")));
        String itemToBeAddedName = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-product-details[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h1[1]")).getText();
        System.out.println(itemToBeAddedName);
        pdpObject.addItemToCart();
        pdpObject.closeAdditionalItemsPopup();
        checkoutObject = new CheckoutPage(driver);

        System.out.println(checkoutObject.addedItemName.getText());
        Assert.assertTrue(itemToBeAddedName.equals(checkoutObject.addedItemName.getText()));
    }
}

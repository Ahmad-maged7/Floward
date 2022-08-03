package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/app-root[1]/app-checkout[1]/div[2]/div[1]/div[2]/div[1]/app-cart[1]/div[1]/div[1]/div[2]/app-checkout-summary[1]/p-accordion[1]/div[1]/p-accordiontab[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]")
    public WebElement addedItemName;


}

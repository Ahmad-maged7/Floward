package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PDP extends PageBase{
    public PDP(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    @FindBy(xpath = "//button[contains(text(),'Add to Cart')]")
    public WebElement addToCartBtn;
    @FindBy(xpath = "//body/app-root[1]/app-checkout[1]/div[2]/div[1]/div[2]/div[1]/app-cart[1]/p-dialog[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement closeAdditionalItemsPopup;

    public void addItemToCart()
    {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
        addToCartBtn.click();
    }
    public void closeAdditionalItemsPopup(){
        wait.until(ExpectedConditions.visibilityOf(closeAdditionalItemsPopup));
    }
}

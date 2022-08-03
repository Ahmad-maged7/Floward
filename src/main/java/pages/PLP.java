package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PLP extends PageBase{
    public PLP(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "//body/app-root[1]/app-product-list[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/app-product-item[1]/div[2]/a[1]/div[1]/picture[1]")
    WebElement firstItem;

    public void addFirstItemToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(firstItem));
        firstItem.click();
    }
}

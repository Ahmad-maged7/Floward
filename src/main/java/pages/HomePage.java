package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement flowardLogo;
    @FindBy(xpath = "//header/nav[@id='scrollNavbar']/div[1]/div[2]/ul[1]/li[1]")
    WebElement fullCollection;

    public void goToFullCollection()
    {
        wait.until(ExpectedConditions.visibilityOf(flowardLogo));
        Assert.assertTrue(flowardLogo.isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(fullCollection));
        fullCollection.click();
    }


}

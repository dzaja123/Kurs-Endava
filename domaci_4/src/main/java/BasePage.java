import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;

public class BasePage {
    
    public WebDriver driver;

    protected BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public void closeBrowser() {
        if (this.driver != null) {
            driver.quit();
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickOnButton(By button) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        driver.findElement(button).click();
    }

    public void typeTextOnElement(By field, String keys) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(field));
        driver.findElement(field).sendKeys(keys);
    }

    public void waitForElementToBeClickable(By clickableElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(clickableElement));
    }
}

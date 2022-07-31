import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;

public class BasePage {
    public WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver", "D:\\Kurs_Testiranje_softvera\\domaci_4\\domaci_4\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions().setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        driver = new ChromeDriver(options);
        System.out.println("@Test started");
        driver.manage().window().maximize();
        driver.get("https://github.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TestBase {

    public static WebDriver setUpWebBrowser(String browser) {

        WebDriver driver;

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }else if(browser.equalsIgnoreCase("brave")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions().setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
            driver = new ChromeDriver(options);

        }else {
            throw new RuntimeException();
        }

        return driver;
    }

    public static void webDriverWait(WebDriver driver, By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }



}

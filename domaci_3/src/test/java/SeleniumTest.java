import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    @Test
    public void seleniumTest() {

        System.setProperty("webdriver.chrome.driver", "D:\\Kurs_Testiranje_softvera\\domaci_3\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions().setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://abodeqa.com");

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.quit();

    }

}

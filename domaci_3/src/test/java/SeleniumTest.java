import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {

    @Test
    public void seleniumTest() {

        System.setProperty("webdriver.chrome.driver", "D:\\Kurs_Testiranje_softvera\\domaci_3\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions().setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");

        WebDriver driver = new ChromeDriver(options);

        System.out.println("@Test started");

        driver.manage().window().maximize();

        driver.get("https://github.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement singUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a")));

        singUp.click();

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));

        email.sendKeys("kurs_endava_test_mail@gmail.com");

        WebElement continueButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/main/div[2]/text-suggester/div[1]/form/div[1]/div[2]/button")));

        continueButton1.click();

        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));

        password.sendKeys("Nekarandomsifra123");

        WebElement continueButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/main/div[2]/text-suggester/div[1]/form/div[2]/div[2]/button")));

        continueButton2.click();


        driver.quit();

    }

}

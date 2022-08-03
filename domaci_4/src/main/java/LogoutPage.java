import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage{

    public LogoutPage(WebDriver driver) {

        super(driver);
    }

    private String TEST_URL = "https://github.com";

    public void openWebPage() {
        driver.manage().window().maximize();
        driver.get(TEST_URL);
    }
}

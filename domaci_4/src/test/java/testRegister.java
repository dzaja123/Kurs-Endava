import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testRegister {

    String testEmail = "kurs_endava_test_mail@gmail.com";
    String testPassword = "Nekarandomsifra123";
    WebDriver driver;

    @BeforeMethod
    public void Setup(){
        BasePage basePage = new BasePage(driver);
        basePage.startBrowser();
    }

    @Test
    public void Test(){
        RegisterPage registerPage = new RegisterPage(driver);
        BasePage basePage = new BasePage(driver);

        basePage.isElementPresent(registerPage.getSingUpButton());
    }


}

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testRegister {

    String testEmail = "kurs_endava_test_mail@gmail.com";
    String testPassword = "Nekarandomsifra123";
    WebDriver driver;

    BasePage basePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void Setup(){
        basePage = new BasePage(driver);
        basePage.startBrowser();
    }

    @Test
    public void Test(){
        registerPage = new RegisterPage(driver);
        basePage = new BasePage(driver);

        basePage.isElementPresent(registerPage.getSingUpButton());
    }


}

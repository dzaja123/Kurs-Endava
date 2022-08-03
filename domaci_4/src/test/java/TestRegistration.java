import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestRegistration {

    private String testEmail = "kurs_endava_test_mail@gmail.com";
    
    private String testPassword = "Nekarandomsifra123";

    private String testUsername = "kursEndavaTestUsername";

    WebDriver driver;

    RegisterPage registerPage;

    LogoutPage logoutPage;

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser) {

        driver = TestBase.setUpWebBrowser(browser);
    }

    @Test
    public void testStartingWebBrowser(){

        registerPage = new RegisterPage(driver);
        logoutPage = new LogoutPage(driver);

        logoutPage.openWebPage();

        registerPage.insertEmailAndPasswordAndUsername(testEmail, testPassword, testUsername);


    }

    @AfterMethod
    public void closeBrowser(){

        registerPage.closeBrowser();
    }


}

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestRegistration {

    private String testEmail = "kurs_endava_test_mail@gmail.com";
    private String testPassword = "Nekarandomsifra123";
    private RegisterPage registerPage;

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser) {

        registerPage = TestBase.setUpWebBrowser(browser);
    }

    @Test
    public void testStartingWebBrowser(){

        registerPage.openWebPage();

        registerPage.insertEmailAndPassword(testEmail, testPassword);

    }

    @AfterMethod
    public void closeBrowser(){

        registerPage.closeBrowser();
    }


}

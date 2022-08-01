import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private By singUpButton = By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a");
    private By emailField = By.id("email");
    private By continueButtonEmail = By.xpath("/html/body/div[4]/main/div[2]/text-suggester/div[1]/form/div[1]/div[2]/button");
    private By passwordField = By.id("password");
    private By continueButtonPassword = By.xpath("/html/body/div[4]/main/div[2]/text-suggester/div[1]/form/div[2]/div[2]/button");
    private String TEST_URL = "https://github.com";

    public By getSingUpButton() {

        return singUpButton;
    }

    public By getEmailField() {

        return emailField;
    }

    public By getContinueButtonEmail() {

        return continueButtonEmail;
    }

    public By getPasswordField() {

        return passwordField;
    }

    public By getContinueButtonPassword() {

        return continueButtonPassword;
    }

    public void openWebPage() {
        driver.manage().window().maximize();
        driver.get(TEST_URL);
    }
    public void insertEmailInTextField(String email) {
        typeTextOnElement(emailField, email);
    }

    public void insertPasswordInTextField(String password){

        typeTextOnElement(passwordField, password);
    }

    public void insertEmailAndPassword(String email, String password) {

        waitForElementToBeClickable(getSingUpButton());
        clickOnButton(getSingUpButton());

        insertEmailInTextField(email);

        clickOnButton(continueButtonEmail);

        insertPasswordInTextField(password);

        clickOnButton(continueButtonPassword);
    }
}

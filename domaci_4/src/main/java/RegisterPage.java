import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {

        super(driver);
    }

    private By singUpButton = By.xpath("//*[@id=\"top\"]/body/div[1]/header/div/div[2]/div[2]/a");
    private By emailField = By.id("email");
    private By continueButtonEmail = By.xpath("//*[@id=\"email-container\"]/div[2]/button");
    private By passwordField = By.id("password");
    private By continueButtonPassword = By.xpath("//*[@id=\"password-container\"]/div[2]/button");

    private By usernameField = By.id("login");

    private By continueButtonUsername = By.xpath("//*[@id=\"username-container\"]/div[2]/button");

    public void insertEmailInTextField(String email) {

        typeTextOnElement(emailField, email);
    }

    public void insertPasswordInTextField(String password){

        typeTextOnElement(passwordField, password);
    }

    public void insertUsernameInTheField(String username){

        typeTextOnElement(usernameField, username);
    }

    public void insertEmailAndPasswordAndUsername(String email, String password, String username) {

        clickOnButton(singUpButton);

        insertEmailInTextField(email);

        clickOnButton(continueButtonEmail);

        insertPasswordInTextField(password);

        clickOnButton(continueButtonPassword);

        insertUsernameInTheField(username);

        clickOnButton(continueButtonUsername);
    }

}

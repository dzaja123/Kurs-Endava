import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    WebDriver driver;
    private By singUpButton = By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a");
    private By emailField = By.id("email");
    private By continueButtonEmail = By.xpath("/html/body/div[4]/main/div[2]/text-suggester/div[1]/form/div[1]/div[2]/button");
    private By passwordField = By.id("password");
    private By continueButtonPassword = By.xpath("/html/body/div[4]/main/div[2]/text-suggester/div[1]/form/div[2]/div[2]/button");

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

}

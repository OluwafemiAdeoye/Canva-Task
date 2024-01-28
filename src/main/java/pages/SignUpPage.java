package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    private WebDriver driver;
    private By signUpUsingEmail = By.xpath("//span[normalize-space()='Continue with email']");
    private By emailField = By.xpath("//input[@name='email']");
    private By continueButton = By.xpath("//span[normalize-space()='Continue']");
    private By fullNameField = By.xpath("//input[@id=':ra:']");
    private By createAccountButton = By.xpath("//span[normalize-space()='Create your account']");
    private By codeField = By.xpath("//*[@id=\":rf:\"]");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpUsingEmail() {
        driver.findElement(signUpUsingEmail).click();
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public void setFullName(String fullName) {
        driver.findElement(fullNameField).sendKeys(fullName);
    }

    public void clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }

    public void checkCodeField() {
        driver.findElement(codeField).isDisplayed();
    }
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private By signUpLink = By.xpath("//span[normalize-space()='Sign up']");
    private By uniqueElementOnRedirectPage = By.xpath("//span[normalize-space()='Continue with email']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage clickSignUp() {
        driver.findElement(signUpLink).click();
        return new SignUpPage(driver);
    }

    // New method to wait for the redirect page
    public void waitForRedirectPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

        // Adjust the locator based on the actual elements on the redirect page
        wait.until(ExpectedConditions.presenceOfElementLocated(uniqueElementOnRedirectPage));
    }
}
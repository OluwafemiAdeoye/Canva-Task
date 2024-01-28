package signup;

import basetest.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;
import utils.JsonReader;

import java.io.IOException;
import java.lang.reflect.Method;

public class SignUpTest extends BaseTest {

    @Test(dataProvider = "dataProvider")
    public void testSignUp(String email, String fullName) {
        homePage = new HomePage(driver);
        homePage.waitForRedirectPage();

        SignUpPage signUpPage = homePage.clickSignUp();
        signUpPage.clickSignUpUsingEmail();
        signUpPage.setEmail(email);
        signUpPage.clickContinueButton();
        signUpPage.setFullName(fullName);
        signUpPage.clickCreateAccountButton();
        signUpPage.checkCodeField();
    }

    @DataProvider(name = "dataProvider")
    public Object[][] getData(Method method) throws IOException, org.json.simple.parser.ParseException {
        if (method.getName().equals("testSignUp")) {
            return JsonReader.getJSONData("resources/test-data/TestData.json", "Search Input", 2);
        }
        return null;
    }
}
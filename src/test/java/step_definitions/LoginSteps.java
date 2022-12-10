package step_definitions;

import static net.serenitybdd.core.Serenity.getDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.LoginPage;
import mentutor.Page.adminPage.AdminInputMember;
import mentutor.Page.mentorPage.MentorHomePage;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
//    private final GetDriver getDriver;

//    public LoginSteps() {
//        super();
//        this.getDriver = step_definitions.Hooks.getDriver();
//    }

    @Given("User open the web page")
    public void userOpenTheWebPage() {
        getDriver().get(LoginPage.LOGIN_URL);
//        Assert.assertTrue(loginPage.isDisplayed());
    }

    @When("User input {string} as eMail and {string} as password")
    public void userInputAsEMailAndAsPassword(String eMail, String password) {
        getDriver().findElement(LoginPage.EMAIL_FIELD).clear();
        getDriver().findElement(LoginPage.EMAIL_FIELD).sendKeys(eMail);
        getDriver().findElement(LoginPage.PASSWORD_FIELD).clear();
        getDriver().findElement(LoginPage.PASSWORD_FIELD).sendKeys(password);
    }

    @Then("User click login button")
    public void userClickLoginButton() throws InterruptedException {
        getDriver().findElement(LoginPage.LOGIN_BTN).click();
        Thread.sleep(2000);
    }

    @And("Click OK button")
    public void clickOkButton() throws InterruptedException {
        getDriver().findElement(LoginPage.OK_BUTTON_LOGIN).click();
        Thread.sleep(3000);
    }

    @Given("User already on mentor home page")
    public void userAlreadyOnMentorHomePage(String eMail, String password) {
        getDriver().get(LoginPage.LOGIN_URL);
        getDriver().findElement(LoginPage.EMAIL_FIELD).clear();
        getDriver().findElement(LoginPage.EMAIL_FIELD).sendKeys(eMail);
        getDriver().findElement(LoginPage.PASSWORD_FIELD).clear();
        getDriver().findElement(LoginPage.PASSWORD_FIELD).sendKeys(password);
        getDriver().findElement(LoginPage.LOGIN_BTN).click();
        getDriver().findElement(LoginPage.OK_BUTTON_LOGIN).click();

    }
    @Given("User login as mentor")
    public void userLoginAsMentor() throws InterruptedException {
        getDriver().get(LoginPage.LOGIN_URL);
        getDriver().findElement(LoginPage.EMAIL_FIELD).sendKeys("fauzan.mentor@gmail.com");
        getDriver().findElement(LoginPage.PASSWORD_FIELD).sendKeys("Fauzan123$");
        getDriver().findElement(LoginPage.LOGIN_BTN).click();
//        Thread.sleep(3000);
    }
    @And("User logged in as mentor")
    public void userLoggedInAsMentor() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.OK_BUTTON_LOGIN));
        getDriver().findElement(LoginPage.OK_BUTTON_LOGIN).click();
        Assert.assertEquals(MentorHomePage.MENTORHOMEPAGE, getDriver().getCurrentUrl());
    }

    @Given("User login as mentor for edit")
    public void userLoginAsMentorForEdit() throws InterruptedException {
        getDriver().get(LoginPage.LOGIN_URL);
        getDriver().findElement(LoginPage.EMAIL_FIELD).sendKeys("testing.rimaaja@gmail.com");
        getDriver().findElement(LoginPage.PASSWORD_FIELD).sendKeys("Rimasya99@");
        getDriver().findElement(LoginPage.LOGIN_BTN).click();
//        Thread.sleep(3000);
    }
    @Given("User already on admin home page")
    public void userAlreadyOnAdminHomePage(String eMail, String password) {
        getDriver().get(LoginPage.LOGIN_URL);
        getDriver().findElement(LoginPage.EMAIL_FIELD).clear();
        getDriver().findElement(LoginPage.EMAIL_FIELD).sendKeys(eMail);
        getDriver().findElement(LoginPage.PASSWORD_FIELD).clear();
        getDriver().findElement(LoginPage.PASSWORD_FIELD).sendKeys(password);
        getDriver().findElement(LoginPage.LOGIN_BTN).click();
        getDriver().findElement(LoginPage.OK_BUTTON_LOGIN).click();

    }
    @Given("User login as admin")
    public void userLoginAsAdmin() throws InterruptedException {
        getDriver().get(LoginPage.LOGIN_URL);
        getDriver().findElement(LoginPage.EMAIL_FIELD).sendKeys("admin.mentutor@gmail.com");
        getDriver().findElement(LoginPage.PASSWORD_FIELD).sendKeys("Admin123$");
        getDriver().findElement(LoginPage.LOGIN_BTN).click();
    }

    @And("User logged in as admin")
    public void userLoggedInAsAdmin() {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.OK_BUTTON_LOGIN));
        getDriver().findElement(LoginPage.OK_BUTTON_LOGIN).click();
        Assert.assertEquals(AdminInputMember.ADMINHOMEPAGE, getDriver().getCurrentUrl());
    }


    @Then("User failed to login")
    public void userFailedToLogin() {
        Assert.assertEquals(LoginPage.LOGIN_URL, getDriver().getCurrentUrl());
//        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.ERROR_LOGIN));
//        getDriver().find
    }

    @And("Appear {string} on login page")
    public void appearOnLoginPage(String invalidCredential) {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.ERROR_LOGIN));
        getDriver().findElement(LoginPage.ERROR_LOGIN).click();
    }

    @And("Appear email required error {string} message on login page")
    public void appearEmailErrorMessageOnLoginPage(By emailRequired) {
//        Assert.assertEquals(LoginPage.ERROR_EMAIL_REQUIRED, getDriver().get(emailRequired));
        Assert.assertEquals(LoginPage.LOGIN_URL, getDriver().getCurrentUrl());
        assertTrue(loginPage.isEmailEmpty());
//        Assert.assertEquals(LoginPage.ERROR_EMAIL_REQUIRED, getDriver().findElement(LoginPage.ERROR_EMAIL_REQUIRED));
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.ERROR_EMAIL_REQUIRED));
//        Assertions.assertEquals("Email is required", getDriver().findElements(LoginPage.ERROR_EMAIL_REQUIRED));
    }
}



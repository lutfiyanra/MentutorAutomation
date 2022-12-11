package step_definitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.LoginPage;
import mentutor.Page.adminPage.AdminHomePage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class AdminHomePageStepDefs {
    @Given("User login as admin")
    public void userLoginAsAdmin() throws InterruptedException {
        getDriver().get(LoginPage.LOGIN_URL);
        getDriver().findElement(LoginPage.EMAIL_FIELD).sendKeys("admin.mentutor@gmail.com");
        getDriver().findElement(LoginPage.PASSWORD_FIELD).sendKeys("Admin123$");
        getDriver().findElement(LoginPage.LOGIN_BTN).click();
//        Thread.sleep(3000);
    }
    @And("User logged in as admin")
    public void userLoggedInAsAdmin() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.OK_BUTTON_LOGIN));
        getDriver().findElement(LoginPage.OK_BUTTON_LOGIN).click();
        Assert.assertEquals(AdminHomePage.ADMINHOMEPAGE, getDriver().getCurrentUrl());
    }

//skenario 1
    @When("User wait until all element in admin successfully loaded")
    public void userWaitUntilAllElementInAdminSuccessfullyLoaded() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Given("User already on admin home page")
    public void userAlreadyOnAdminHomePage() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("User click three dots buttom")
    public void userClickThreeDotsButtom() throws InterruptedException { new WebDriverWait(getDriver(),
        Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(AdminHomePage.THREE_DOT_HOME_PAGE));
        getDriver().findElement(AdminHomePage.THREE_DOT_HOME_PAGE).click();
    }

    @Then("User click Edit for Profile User")
    public void userClickEditForProfileUser() throws InterruptedException  {  new WebDriverWait(getDriver(),
            Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(AdminHomePage.EDIT_HOME_PAGE));
        getDriver().findElement(AdminHomePage.EDIT_HOME_PAGE).click();
    }

    @And("User close edit profile user")
    public void userCloseEditProfileUser() { getDriver().findElement(AdminHomePage.CLOSE_EDIT_PROFILE_USER).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

// skenario 2

    @Then("User click Delete for Profile User")
    public void userClickDeleteForProfileUser() { getDriver().findElement(AdminHomePage.DELETE_HOME_PAGE).click();
    }

    @And("User select Yes Delete")
    public void userSelectYesDelete() { getDriver().findElement(AdminHomePage.YES_DELETE_HOME_PAGE).click();
    }
    //skenario 3
    @And("User select Cancel")
    public void userSelectCancel() { getDriver().findElement(AdminHomePage.CANCEL_DELETE_HOME_PAGE).click();
    }
//skenario 4
    @Given("User input your name by {string}")
    public void userInputYourNameByName (String name){
        getDriver().findElement(AdminHomePage.INPUT_FULL_NAME_EDIT_PROFILE_USER).clear();
        getDriver().findElement(AdminHomePage.INPUT_FULL_NAME_EDIT_PROFILE_USER).sendKeys(name);
    }

    @Then("User input email by {string} and password by {string}")
    public void userInputEmailByAndPasswordBy (String eMail, String password){
        getDriver().findElement(AdminHomePage.INPUT_EMAIL_EDIT_PROFILE_USER).clear();
        getDriver().findElement(AdminHomePage.INPUT_EMAIL_EDIT_PROFILE_USER).sendKeys(eMail);
        getDriver().findElement(AdminHomePage.INPUT_PASSWORD_PROFILE_USER).clear();
        getDriver().findElement(AdminHomePage.INPUT_PASSWORD_PROFILE_USER).sendKeys(password);
    }

    @Then("User click class")
    public void userClickClass() { getDriver().findElement(AdminHomePage.INPUT_CLASS_EDIT_PROFILE_USER).click();
    }

    @Then("User select bahasa alien in list")
    public void userSelectBahasaAlienInList() { getDriver().findElement(AdminHomePage.SELECT_INPUT_CLASS_EDIT_PROFILE_USER).click();
    }

    @And("User click submit")
    public void userClickSubmit() {
        getDriver().findElement(AdminHomePage.SUBMITT_EDIT_PROFILE_USER).click();
    }

    @And("User click OK")
    public void userClickOK() {
        getDriver().findElement(AdminHomePage.SUCCESS_UPDATE_EDIT_PROFILE_USER).click();
    }
//skenario 5
    @Then("User home icon")
    public void userHomeIcon() {getDriver().findElement(AdminHomePage.HOME_ICON).click();
    }


}

package step_definitions.MentorProfilePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.mentorPage.MentorHomePage;
import mentutor.Page.mentorPage.MentorProfilePage;

import static net.serenitybdd.core.Serenity.getDriver;

public class MentorProfileFunctionStepDefs {
    MentorHomePage mentorHomePage;
    MentorProfilePage mentorProfilePage;

    @Then("User click name field on edit page profile")
    public void userClickNameFieldOnEditPageProfile() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_NAME).click();
        Thread.sleep(2000);
    }

    @Then("User click email field on edit page profile")
    public void userClickEmailFieldOnEditPageProfile() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).click();
        Thread.sleep(2000);
    }

    @Then("User click password field on edit page profile")
    public void userClickPasswordFieldOnEditPageProfile() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).click();
        Thread.sleep(2000);
    }


    @Then("User input {string} in field name on edit page profile")
    public void userInputAbcdInFieldNameOnEditPageProfile(String name) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_NAME).clear();
        getDriver().findElement(MentorProfilePage.EDIT_NAME).sendKeys(name);
        Thread.sleep(2000);
    }

    @Then("User input {string} in field email on edit page profile")
    public void userInputInFieldEmailOnEditPageProfile(String email) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).clear();
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).sendKeys(email);
        Thread.sleep(2000);
    }

    @Then("User input {string} in field password on edit page profile")
    public void userInputInFieldPasswordOnEditPageProfile(String pass) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).clear();
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).sendKeys(pass);
        Thread.sleep(2000);
    }

    @Then("User input numeric {string} in field name on edit page profile")
    public void userInputNumericInFieldNameOnEditPageProfile(String name) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_NAME).clear();
        getDriver().findElement(MentorProfilePage.EDIT_NAME).sendKeys(name);
        Thread.sleep(2000);
    }

    @Then("User input numeric {string} in field email on edit page profile")
    public void userInputNumericInFieldEmailOnEditPageProfile(String email) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).clear();
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).sendKeys(email);
        Thread.sleep(2000);
    }

    @Then("User input numeric {string} in field password on edit page profile")
    public void userInputNumericInFieldPasswordOnEditPageProfile(String pass) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).clear();
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).sendKeys(pass);
        Thread.sleep(2000);
    }

    @Then("User input special character {string} in field name on edit page profile")
    public void userInputSpecialCharacterInFieldNameOnEditPageProfile(String name) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_NAME).clear();
        getDriver().findElement(MentorProfilePage.EDIT_NAME).sendKeys(name);
        Thread.sleep(2000);
    }

    @Then("User input special character {string} in field email on edit page profile")
    public void userInputSpecialCharacterInFieldEmailOnEditPageProfile(String email) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).clear();
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).sendKeys(email);
        Thread.sleep(2000);
    }

    @Then("User input special character {string} in field password on edit page profile")
    public void userInputSpecialCharacterInFieldPasswordOnEditPageProfile(String pass) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).clear();
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).sendKeys(pass);
        Thread.sleep(2000);
    }

    @Then("User input combination {string} in field name on edit page profile")
    public void userInputCombinationTestInFieldNameOnEditPageProfile(String name) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_NAME).clear();
        getDriver().findElement(MentorProfilePage.EDIT_NAME).sendKeys(name);
        Thread.sleep(2000);
    }

    @Then("User input combination {string} in field email on edit page profile")
    public void userInputCombinationInFieldEmailOnEditPageProfile(String email) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).clear();
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).sendKeys(email);
        Thread.sleep(2000);
    }


    @Then("User input combination {string} in field password on edit page profile")
    public void userInputCombinationInFieldPasswordOnEditPageProfile(String pass) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).clear();
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).sendKeys(pass);
        Thread.sleep(2000);
    }
    @And("User input change to {string} in field name on edit page profile")
    public void userInputChangeToInFieldNameOnEditPageProfile(String name) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_NAME).clear();
        getDriver().findElement(MentorProfilePage.EDIT_NAME).sendKeys(name);
        Thread.sleep(2000);
    }
    @When("User click send button")
    public void userClickSendButton() {
        getDriver().findElement(MentorProfilePage.PROFILE_SUBMIT_BUTTON).click();
    }
    @And("Displayed popup card success update")
    public void displayedPopupCardSuccessUpdate() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.POPUP_CARD_SUCCESS).isDisplayed();
        Thread.sleep(2000);
    }
    @And("Displayed icon popup success update")
    public void displayedIconPopupSuccessUpdate() {
        getDriver().findElement(MentorProfilePage.POPUP_TITLE_SUCCESS).isDisplayed();
    }
    @And("Displayed title popup success update")
    public void displayedTitlePopupSuccessUpdate() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.POPUP_ICON_SUCCESS).isDisplayed();
        Thread.sleep(2000);
    }

    @Then("User click oke on popup success")
    public void userClickOkeOnPopupSuccess() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.POPUP_BUTTON_OK).click();
        Thread.sleep(2000);
    }

    @And("User input change to {string} in field email on edit page profile")
    public void userInputChangeToInFieldEmailOnEditPageProfile(String email) throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).clear();
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).sendKeys(email);
        Thread.sleep(2000);
    }
    //invalid popup updated
    @And("User input invalid name with numeric {string} in field name on edit page profile")
    public void userInputInvalidNameWithNumericInFieldNameOnEditPageProfile(String name) {
        getDriver().findElement(MentorProfilePage.EDIT_NAME).sendKeys(name);
    }
    @And("Displayed popup card failed update")
    public void displayedPopupCardFailedUpdate() {
        getDriver().findElement(MentorProfilePage.POPUP_CARD_FAILED).isDisplayed();
    }
    @And("Displayed icon popup failed update")
    public void displayedIconPopupFailedUpdate() {
        getDriver().findElement(MentorProfilePage.POPUP_ICON_FAILED).isDisplayed();
    }
    @And("Displayed title popup failed update")
    public void displayedTitlePopupFailedUpdate() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.POPUP_TITLE_FAILED).isDisplayed();
        Thread.sleep(2000);
    }
    @Then("User click oke on popup failed")
    public void userClickOkeOnPopupFailed() {
        getDriver().findElement(MentorProfilePage.POPUP_BUTTON_OK).click();
    }


    @And("User input invalid email with numeric {string} in field email on edit page profile")
    public void userInputInvalidEmailWithNumericInFieldEmailOnEditPageProfile(String email) {
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).sendKeys(email);
    }

    @And("User select image on edit page profile")
    public void userSelectImageOnEditPageProfile() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.UPLOAD_BUTTON).click();
        Thread.sleep(5000);
        getDriver().findElement(MentorProfilePage.UPLOAD_BUTTON).sendKeys(MentorProfilePage.IMAGE_ATTACHMENT+"/man.png");
        Thread.sleep(5000);
    }


}
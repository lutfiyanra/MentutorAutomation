package step_definitions.MentorProfilePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mentutor.Page.mentorPage.MentorHomePage;
import mentutor.Page.mentorPage.MentorProfilePage;
import org.junit.Assert;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class MentorProfilePageStepDefs {
    MentorHomePage mentorHomePage;
    MentorProfilePage mentorProfilePage;
    @Given("User click icon profile in home page mentor")
    public void userClickIconProfileInHomePageMentor() {
        getDriver().findElement(MentorProfilePage.PROFILE_ICON).click();
    }
    @And("Displayed profile page")
    public void displayedProfilePage() {
        getDriver().findElement(MentorHomePage.MENTOR_PROFILE_NAV).isDisplayed();
    }
    @And("Displayed title profile page")
    public void displayedTitleProfilePage() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.HEADER_PROFILE).isDisplayed();
        Thread.sleep(2000);
    }

    @Given("User already on mentor profile page")
    public void userAlreadyOnMentorProfilePage() {
        getDriver().findElement(MentorProfilePage.PROFILE_ICON).click();
        Assert.assertEquals(MentorHomePage.MENTOR_PROFILE_PAGE,getDriver().getCurrentUrl());
    }
    @And("from profile displays the name")
    public void fromProfileDisplaysTheName() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.PROFILE_NAME).isDisplayed();
        Thread.sleep(2000);
    }
    @And("from profile displays the role")
    public void fromProfileDisplaysTheRole() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.PROFILENAME_ROLE).isDisplayed();
        Thread.sleep(2000);
    }
    @Then("from profile displays the class")
    public void fromProfileDisplaysTheClass() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.PROFILE_CLASS).isDisplayed();
        Thread.sleep(2000);
    }
    @And("User click icon pen on card detail profile")
    public void userClickIconPenOnCardDetailProfile() {
        getDriver().findElement(MentorProfilePage.EDIT_ICON).click();
    }
    @And("Displayed on edit profile card")
    public void displayedOnEditProfileCard() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.PROFILE_EDIT).isDisplayed();
        Thread.sleep(2000);
    }
    @Given("Already on edit profile card")
    public void alreadyOnEditProfileCard() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.PROFILE_ICON).click();
        getDriver().findElement(MentorProfilePage.PROFILE_EDIT).isDisplayed();
        Thread.sleep(2000);
    }
    @And("verify name on edit profile card")
    public void verifyNameOnEditProfileCard() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_NAME).isDisplayed();
        Thread.sleep(2000);
    }

    @And("verify email on edit profile card")
    public void verifyEmailOnEditProfileCard() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).isDisplayed();
        Thread.sleep(2000);
    }

    @And("verify password on edit profile card")
    public void verifyPasswordOnEditProfileCard() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).isDisplayed();
        Thread.sleep(2000);
    }

    @And("verify images on edit profile card")
    public void verifyImagesOnEditProfileCard() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.IMAGE_PROFILE).isDisplayed();
        Thread.sleep(2000);
    }

    @And("verify button upload on edit profile card")
    public void verifyButtonUploadOnEditProfileCard() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.UPLOAD_BUTTON).isDisplayed();
        Thread.sleep(2000);
    }

    @And("verify button submit on edit profile card")
    public void verifyButtonSubmitOnEditProfileCard() throws InterruptedException {
        getDriver().findElement(MentorProfilePage.PROFILE_SUBMIT_BUTTON).isDisplayed();
        Thread.sleep(2000);
    }
}

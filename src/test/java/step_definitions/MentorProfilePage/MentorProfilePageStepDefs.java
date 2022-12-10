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
    public void displayedTitleProfilePage() {
        getDriver().findElement(MentorProfilePage.HEADER_PROFILE).isDisplayed();
    }

    @Given("User already on mentor profile page")
    public void userAlreadyOnMentorProfilePage() {
        getDriver().findElement(MentorProfilePage.PROFILE_ICON).click();
        getDriver().manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
        Assert.assertEquals(MentorHomePage.MENTOR_PROFILE_PAGE,getDriver().getCurrentUrl());
    }
    @And("from profile displays the name")
    public void fromProfileDisplaysTheName() {
        getDriver().findElement(MentorProfilePage.PROFILE_NAME).isDisplayed();
        getDriver().manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
    }
    @And("from profile displays the role")
    public void fromProfileDisplaysTheRole() {
        getDriver().findElement(MentorProfilePage.PROFILENAME_ROLE).isDisplayed();
    }
    @Then("from profile displays the class")
    public void fromProfileDisplaysTheClass() {
        getDriver().findElement(MentorProfilePage.PROFILE_CLASS).isDisplayed();
        getDriver().manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
    }

    @And("User click icon pen on card detail profile")
    public void userClickIconPenOnCardDetailProfile() {
        getDriver().findElement(MentorProfilePage.EDIT_ICON).click();
        getDriver().manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
    }
    @And("Displayed on edit profile card")
    public void displayedOnEditProfileCard() {
        getDriver().findElement(MentorProfilePage.PROFILE_EDIT).isDisplayed();
        getDriver().manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
    }

    @Given("Already on edit profile card")
    public void alreadyOnEditProfileCard() {
        getDriver().findElement(MentorProfilePage.PROFILE_ICON).click();
        getDriver().findElement(MentorProfilePage.PROFILE_EDIT).isDisplayed();
    }
    @And("verify name on edit profile card")
    public void verifyNameOnEditProfileCard() {
        getDriver().findElement(MentorProfilePage.EDIT_NAME).isDisplayed();
    }

    @And("verify email on edit profile card")
    public void verifyEmailOnEditProfileCard() {
        getDriver().findElement(MentorProfilePage.EDIT_EMAIL).isDisplayed();
    }

    @And("verify password on edit profile card")
    public void verifyPasswordOnEditProfileCard() {
        getDriver().findElement(MentorProfilePage.EDIT_PASSWORD).isDisplayed();
    }

    @And("verify images on edit profile card")
    public void verifyImagesOnEditProfileCard() {
        getDriver().findElement(MentorProfilePage.IMAGE_PROFILE).isDisplayed();
    }

    @And("verify button upload on edit profile card")
    public void verifyButtonUploadOnEditProfileCard() {
        getDriver().findElement(MentorProfilePage.UPLOAD_BUTTON).isDisplayed();
    }

    @And("verify button submit on edit profile card")
    public void verifyButtonSubmitOnEditProfileCard() {
        getDriver().findElement(MentorProfilePage.PROFILE_SUBMIT_BUTTON).isDisplayed();
    }
}

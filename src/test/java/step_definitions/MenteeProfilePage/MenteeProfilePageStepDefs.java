package step_definitions.MenteeProfilePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mentutor.Page.menteePage.MenteeEditProfile;
import mentutor.Page.menteePage.MenteeHomePage;

import static net.serenitybdd.core.Serenity.getDriver;
public class MenteeProfilePageStepDefs {
    MenteeEditProfile menteeEditProfile;
    MenteeHomePage menteeHomePage;

    @Then("All menu of mentee profile page is displayed")
    public void allMenuOfMenteeProfilePageIsDisplayed() {
        getDriver().findElement(MenteeHomePage.MENTEE_PROFILE_NAV).isDisplayed();
    }

    @And("title profile mentee is displayed")
    public void titleProfileMenteeIsDisplayed() {
        getDriver().findElement(MenteeEditProfile.MENTEE_PROFILE_TITLE).isDisplayed();
    }

    @And("description title profile mentee is displayed")
    public void descriptionTitleProfileMenteeIsDisplayed() {
        getDriver().findElement(MenteeEditProfile.MENTEE_PROFILE_TITLE_DESCRIPTION).isDisplayed();
    }

    @And("profile images mentee is displayed")
    public void profileImagesMenteeIsDisplayed() {
        getDriver().findElement(MenteeEditProfile.MENTEE_PROFILE_IMAGE).isDisplayed();
    }

    @And("profile card mentee is displayed")
    public void profileCardMenteeIsDisplayed() {
        getDriver().findElement(MenteeEditProfile.MENTEE_PROFILE_CARD).isDisplayed();
    }

    @And("button edit profile is displayed")
    public void buttonEditProfileIsDisplayed() {
        getDriver().findElement(MenteeEditProfile.MENTEE_BUTTON_EDIT).isDisplayed();
    }
}

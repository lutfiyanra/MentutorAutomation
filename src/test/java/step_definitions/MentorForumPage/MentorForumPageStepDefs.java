package step_definitions.MentorForumPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mentutor.Page.mentorPage.MentorForumPage;
import mentutor.Page.mentorPage.MentorHomePage;
import mentutor.Page.mentorPage.MentorProfilePage;

import static net.serenitybdd.core.Serenity.getDriver;

public class MentorForumPageStepDefs {
    MentorHomePage mentorHomePage;
    MentorProfilePage mentorProfilePage;
    MentorForumPage mentorForumPage;
    @Given("User click icon forum on home page mentor")
    public void userClickIconForumOnHomePageMentor() {
        getDriver().findElement(MentorProfilePage.PROFILE_ICON).click();
    }
    @And("Displayed forum page")
    public void displayedForumPage() {
        getDriver().findElement(MentorHomePage.MENTOR_FORUM_NAV).isDisplayed();
    }
    @And("Displayed title forum page")
    public void displayedTitleForumPage() {
        getDriver().findElement(MentorForumPage.HEADER_FORUM).isDisplayed();
    }

    @Given("User already on mentor forum page")
    public void userAlreadyOnMentorForumPage() {
        getDriver().findElement(MentorForumPage.FORUM_ICON).click();
    }

    @And("Displayed description title forum page")
    public void displayedDescriptionTitleForumPage() {
        getDriver().findElement(MentorForumPage.DESCRIPTION_TITLE_FORUM).isDisplayed();
    }

    @And("Displayed title card name forum")
    public void displayedTitleCardNameForum() {
        getDriver().findElement(MentorForumPage.TITLE_CARD_FORUM).isDisplayed();
    }

    @And("Displayed image profile on card name forum")
    public void displayedImageProfileOnCardNameForum() {
        getDriver().findElement(MentorForumPage.IMAGE_PROFILE_CARD).isDisplayed();
    }

    @And("Displayed name role profile on card forum")
    public void displayedNameRoleProfileOnCardForum() {
        getDriver().findElement(MentorForumPage.NAME_ROLE_FORUMCARD).isDisplayed();
    }

    @And("Displayed comment field on card forum")
    public void displayedCommentFieldOnCardForum() {
        getDriver().findElement(MentorForumPage.COMMENT_FIELD).isDisplayed();
    }

    @And("Displayed first card forum")
    public void displayedFirstCardForum() {
        getDriver().findElement(MentorForumPage.FORUM_CARD1).isDisplayed();
    }

    @And("Displayed second card forum")
    public void displayedSecondCardForum() {
        getDriver().findElement(MentorForumPage.FORUM_CARD2).isDisplayed();
    }
    @Then("Displayed third card forum")
    public void displayedThirdCardForum() {
        getDriver().findElement(MentorForumPage.FORUM_CARD3).isDisplayed();
    }

    @And("Displayed comment content on card forum")
    public void displayedCommentContentOnCardForum() {
        getDriver().findElement(MentorForumPage.CONTENT_COMMENT).isDisplayed();
    }
}

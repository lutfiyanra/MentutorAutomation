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
        getDriver().findElement(MentorForumPage.ICON_FORUM).click();
    }
    @And("Displayed forum page")
    public void displayedForumPage() throws InterruptedException {
        getDriver().findElement(MentorHomePage.MENTOR_FORUM_NAV).isDisplayed();
        Thread.sleep(2000);
    }
    @And("Displayed title forum page")
    public void displayedTitleForumPage() throws InterruptedException {
        getDriver().findElement(MentorForumPage.HEADER_FORUM).isDisplayed();
        Thread.sleep(2000);
    }

    @Given("User already on mentor forum page")
    public void userAlreadyOnMentorForumPage() {
        getDriver().findElement(MentorForumPage.FORUM_ICON).click();
    }

    @And("Displayed description title forum page")
    public void displayedDescriptionTitleForumPage() throws InterruptedException {
        getDriver().findElement(MentorForumPage.DESCRIPTION_TITLE_FORUM).isDisplayed();
        Thread.sleep(2000);
    }

    @And("Displayed title card name forum")
    public void displayedTitleCardNameForum() throws InterruptedException {
        getDriver().findElement(MentorForumPage.TITLE_CARD_FORUM).isDisplayed();
        Thread.sleep(2000);
    }

    @And("Displayed image profile on card name forum")
    public void displayedImageProfileOnCardNameForum() throws InterruptedException {
        getDriver().findElement(MentorForumPage.IMAGE_PROFILE_CARD).isDisplayed();
        Thread.sleep(2000);
    }

    @And("Displayed name role profile on card forum")
    public void displayedNameRoleProfileOnCardForum() throws InterruptedException {
        getDriver().findElement(MentorForumPage.NAME_ROLE_FORUMCARD).isDisplayed();
        Thread.sleep(2000);
    }

    @And("Displayed comment field on card forum")
    public void displayedCommentFieldOnCardForum() throws InterruptedException {
        getDriver().findElement(MentorForumPage.COMMENT_FIELD).isDisplayed();
        Thread.sleep(2000);
    }

    @And("Displayed first card forum")
    public void displayedFirstCardForum() throws InterruptedException {
        getDriver().findElement(MentorForumPage.FORUM_CARD1).isDisplayed();
        Thread.sleep(2000);
    }

    @And("Displayed second card forum")
    public void displayedSecondCardForum() throws InterruptedException {
        getDriver().findElement(MentorForumPage.FORUM_CARD2).isDisplayed();
        Thread.sleep(2000);
    }
    @Then("Displayed third card forum")
    public void displayedThirdCardForum() throws InterruptedException {
        getDriver().findElement(MentorForumPage.FORUM_CARD3).isDisplayed();
        Thread.sleep(2000);
    }

    @And("Displayed comment content on card forum")
    public void displayedCommentContentOnCardForum() {
        getDriver().findElement(MentorForumPage.CONTENT_COMMENT).isDisplayed();
    }

    @And("Displayed button load more comment on card forum")
    public void displayedButtonLoadMoreCommentOnCardForum() {
        getDriver().findElement(MentorForumPage.SHOWCOMMNET_BUTTON).isDisplayed();
    }

    @And("Displayed button hide on card forum")
    public void displayedButtonHideOnCardForum() {
        getDriver().findElement(MentorForumPage.HIDE_BUTTON).isDisplayed();
    }

    @And("Displayed button send comment on card forum")
    public void displayedButtonSendCommentOnCardForum() {
        getDriver().findElement(MentorForumPage.FORUM_SUBMIT_BUTTON).isDisplayed();
    }
}

package step_definitions.MenteeForumPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.menteePage.MenteeForumPage;
import mentutor.Page.menteePage.MenteeHomePage;

import static net.serenitybdd.core.Serenity.getDriver;


public class MenteeForumPageStepDefs {
    MenteeHomePage menteeHomePage;
    MenteeForumPage menteeForumPage;

    @Then("All menu of mentee forum page is displayed")
    public void allMenuOfMenteeForumPageIsDisplayed() throws InterruptedException {
        getDriver().findElement(MenteeHomePage.MENTEE_FORUM_NAV).isDisplayed();
        Thread.sleep(5000);
    }

    @And("forum page title is displayed")
    public void forumPageTitleIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_FORUM_TITLE).isDisplayed();
    }

    @And("description title on forum page in displayed")
    public void descriptionTitleOnForumPageInDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_FORUM_TITLE_DESCRIPTION).isDisplayed();
    }

    @And("forum card is displayed")
    public void forumCardIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_FORUM_CARD).isDisplayed();
    }

    @And("photo profile forum card is displayed")
    public void photoProfileForumCardIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_PROFILE_FORUM_CARD).isDisplayed();
    }

    @And("field status forum card is displayed")
    public void fieldStatusForumCardIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_FIELD_STATUS).isDisplayed();
    }

    @And("button upload images forum card is displayed")
    public void buttonUploadImagesForumCardIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_BUTTON_UPLOAD_IMAGES).isDisplayed();
    }

    @And("button send status is displayed")
    public void buttonSendStatusIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_BUTTON_SEND).isDisplayed();
    }


    @And("field comments status is displayed")
    public void fieldCommentsStatusIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_FIELD_COMMENT).isDisplayed();
    }

    @And("button send comments status is displayed")
    public void buttonSendCommentsStatusIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_BUTTON_SEND_COMMENT).isDisplayed();
    }

    @And("load more comments button is displayed")
    public void loadMoreCommentsButtonIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_BUTTON_LOAD_MORE_COMMENTS).isDisplayed();
    }

    @And("hidden comments button is displayed")
    public void hiddenCommentsButtonIsDisplayed() {
        getDriver().findElement(MenteeForumPage.MENTEE_BUTTON_HIDDEN_COMMENTS).isDisplayed();
    }
}

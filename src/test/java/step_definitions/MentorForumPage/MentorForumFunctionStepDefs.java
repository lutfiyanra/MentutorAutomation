package step_definitions.MentorForumPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mentutor.Page.mentorPage.MentorForumPage;

import static net.serenitybdd.core.Serenity.getDriver;

public class MentorForumFunctionStepDefs {
    MentorForumPage mentorForumPage;
    @Then("User click comment field on forum card")
    public void userClickCommentFieldOnForumCard() throws InterruptedException {
        getDriver().findElement(MentorForumPage.COMMENT_FIELD).click();
        Thread.sleep(2000);
    }

    @Then("User input {string} in comment field on forum card")
    public void userInputInCommentFieldOnForumCard(String comment) throws InterruptedException {
        getDriver().findElement(MentorForumPage.COMMENT_FIELD).sendKeys(comment);
        Thread.sleep(2000);
    }

    @Then("User click send comment button")
    public void userClickSendCommentButton() throws InterruptedException {
        getDriver().findElement(MentorForumPage.FORUM_SUBMIT_BUTTON).click();
        Thread.sleep(2000);
    }

    @And("Displayed image profile on content comment")
    public void displayedImageProfileOnContentComment() {
        getDriver().findElement(MentorForumPage.IMAGE_DETAIL_PROFILE_COMMENT).isDisplayed();
    }
    @And("Displayed name profile on content comment")
    public void displayedNameProfileOnContentComment() {
        getDriver().findElement(MentorForumPage.NAME_DETAIL_PROFILE_COMMENT).isDisplayed();
    }
    @And("Displayed role profile on content comment")
    public void displayedRoleProfileOnContentComment() {
        getDriver().findElement(MentorForumPage.ROLE_DETAIL_PROFILE_COMMENT).isDisplayed();
    }
    @Then("Displayed conten comment")
    public void displayedContenComment() throws InterruptedException {
        getDriver().findElement(MentorForumPage.CONTENT_PROFILE_COMMENT).isDisplayed();
        Thread.sleep(2000);
    }
}

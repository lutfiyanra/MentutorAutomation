package step_definitions.MentorrTaskPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mentutor.Page.LoginPage;
import mentutor.Page.mentorPage.MentorHomePage;
import mentutor.Page.mentorPage.MentorTaskPage;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class MentorTaskPageStepDefs {

    MentorTaskPage mentorTaskPage;
    MentorHomePage mentorHomePage;

    @And("User logged in as mentor on Task page")
    public void userLoggedInAsMentorOnTaskPage() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(LoginPage.OK_BUTTON_LOGIN));
        getDriver().findElement(LoginPage.OK_BUTTON_LOGIN).click();
        getDriver().findElement(MentorHomePage.MENTOR_TASK_NAV).click();
        Assert.assertEquals(MentorHomePage.CREATE_TASK_PAGE, getDriver().getCurrentUrl());
        Thread.sleep(5000);
    }
    @And("User already on task page")
    public void userAlreadyOnTaskPage() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(MentorHomePage.CREATE_TASK_PAGE, getDriver().getCurrentUrl());
    }
    @Then("All navbar menu of mentor task page is displayed")
    public void allMenuOfMentorTaskPageIsDisplayed(){
        getDriver().findElement(MentorHomePage.MENTOR_HOME_NAV).isDisplayed();
        getDriver().findElement(MentorHomePage.MENTOR_TASK_NAV).isDisplayed();
        getDriver().findElement(MentorHomePage.MENTOR_FORUM_NAV).isDisplayed();
        getDriver().findElement(MentorHomePage.MENTOR_PROFILE_NAV).isDisplayed();
//        getDriver().findElement(MentorTaskPage.CREATE_TASK_HEADER).isDisplayed();
//        getDriver().findElement(MentorTaskPage.TASK_TITLE).isDisplayed();
//        getDriver().findElement(MentorTaskPage.TASK_DESCRIPTION).isDisplayed();
//        getDriver().findElement(MentorTaskPage.TASK_DUE_DATE).isDisplayed();
//        getDriver().findElement(MentorTaskPage.TASK_ATTACHMENT).isDisplayed();
//        getDriver().findElement(MentorTaskPage.TASK_IMAGE).isDisplayed();
//        getDriver().findElement(MentorTaskPage.TASK_ADD_BUTTON).isDisplayed();
    }

    @Then("Create Task title is can be seen")
    public void createTaskTitleIsCanBeSeen() {
        getDriver().findElement(MentorTaskPage.TASK_TITLE).isDisplayed();
    }

    @Then("Give The Task to Mentee can be seen")
    public void giveTheTaskToMenteeCanBeSeen() {
        getDriver().findElement(MentorTaskPage.GIVE_TASK_TO_MENTEE).isDisplayed();
    }

    @Then("Mentor Title and Title field can be seen")
    public void mentorTitleAndTitleFieldCanBeSeen() {
        getDriver().findElement(MentorTaskPage.TASK_TITLE).isDisplayed();
        getDriver().findElement(MentorTaskPage.TASK_TITLE_FIELD).isDisplayed();
    }

    @Then("Mentor Task Description and Description Field can be seen")
    public void mentorTaskDescriptionAndDescriptionFieldCanBeSeen() {
        getDriver().findElement(MentorTaskPage.TASK_DESCRIPTION).isDisplayed();
        getDriver().findElement(MentorTaskPage.TASK_DESCRIPTION_FIELD).isDisplayed();
    }

    @Then("Mentor Task Due Date and Due Date field can be seen")
    public void mentorTaskDueDateAndDueDateFieldCanBeSeen() {
        getDriver().findElement(MentorTaskPage.TASK_DUE_DATE).isDisplayed();
        getDriver().findElement(MentorTaskPage.TASK_DUE_DATE_FIELD).isDisplayed();
    }

    @Then("Mentor Task Attachment and Attachment field can be seen")
    public void mentorTaskAttachmentAndAttachmentFieldCanBeSeen() {
        getDriver().findElement(MentorTaskPage.TASK_ATTACHMENT).isDisplayed();
        getDriver().findElement(MentorTaskPage.TASK_ATTACHMENT_BUTTON).isDisplayed();
    }

    @Then("Mentor Image Attachment and Attachment field can be seen")
    public void mentorImageAttachmentAndAttachmentFieldCanBeSeen() {
        getDriver().findElement(MentorTaskPage.TASK_IMAGE).isDisplayed();
        getDriver().findElement(MentorTaskPage.TASK_IMAGE_BUTTON).isDisplayed();
    }

    @Then("Mentor Add Task Button can be seen")
    public void mentorAddTaskButtonCanBeSeen() {
        getDriver().findElement(MentorTaskPage.TASK_ADD_BUTTON).isDisplayed();
    }
}

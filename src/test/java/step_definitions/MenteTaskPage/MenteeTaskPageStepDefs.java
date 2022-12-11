package step_definitions.MenteTaskPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mentutor.Page.menteePage.MenteeHomePage;
import mentutor.Page.menteePage.MenteeTaskPage;

import static net.serenitybdd.core.Serenity.getDriver;

public class MenteeTaskPageStepDefs {
    MenteeHomePage menteeHomePage;
    MenteeTaskPage menteeTaskPage;
    @Then("All menu of mentee task page is displayed")
    public void allMenuOfMenteeTaskPageIsDisplayed() throws InterruptedException {
        getDriver().findElement(MenteeHomePage.MENTEE_TASK_NAV).isDisplayed();
        Thread.sleep(5000);
    }
    @And("title on task page is displayed")
    public void titleOnTaskPageIsDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_TASK_TITLE).isDisplayed();
    }
    @And("description title on task page is displayed")
    public void descriptionTitleOnTaskPageIsDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_TASK_DESC_TITLE).isDisplayed();
    }

    @And("card task on task page is displayed")
    public void cardTaskOnTaskPageIsDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_CARD_TASK).isDisplayed();
    }

    @And("title card on task page is displayed")
    public void titleCardOnTaskPageIsDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_CARD_TASK_TITLE).isDisplayed();
    }

    @And("description task on task page in displayed")
    public void descriptionTaskOnTaskPageInDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_DESCRIPTION_CARD_TASK).isDisplayed();
    }

    @And("point card on task page is displayed")
    public void pointCardOnTaskPageIsDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_POINT_TASK).isDisplayed();
    }

    @And("due date card on task page is displayed")
    public void dueDateCardOnTaskPageIsDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_DUE_DATE_TASK).isDisplayed();
    }

    @And("mentee click submit your task")
    public void menteeClickSubmitYourTask() {
        getDriver().findElement(MenteeTaskPage.MENTEE_SUBMIT_YOUR_TASK_BUTTON).click();
    }
    @Then("submit your task pop up window displayed")
    public void submitYourTaskPopUpWindowDisplayed() throws InterruptedException {
        getDriver().findElement(MenteeTaskPage.MENTEE_SUBMIT_CARD).isDisplayed();
        Thread.sleep(5000);
    }
    @And("submit your task title is displayed")
    public void submitYourTaskTitleIsDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_SUBMIT_YOUR_TASK_TITLE).isDisplayed();
    }
    @And("choose file is displayed")
    public void chooseFileIsDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_CHOOSE_FILE).isDisplayed();
    }

    @And("submit button is displayed")
    public void submitButtonIsDisplayed() {
        getDriver().findElement(MenteeTaskPage.MENTEE_SUBMIT_CARD).isDisplayed();
    }


}


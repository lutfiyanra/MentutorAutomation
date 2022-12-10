package step_definitions.MentorrTaskPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mentutor.Page.mentorPage.MentorHomePage;
import mentutor.Page.mentorPage.MentorTaskPage;
import org.junit.Assert;

import static net.serenitybdd.core.Serenity.getDriver;

public class MentorTaskFunctionality {

    MentorTaskPage mentorTaskPage;

    @And("User click on Task Title Field")
    public void userClickOnTaskField(){
        getDriver().findElement(MentorTaskPage.TASK_TITLE_FIELD).click();
    }

    @And("User input {string} as Task Title")
    public void userInputAsTaskTitle(String taskTitle) {
        getDriver().findElement(MentorTaskPage.TASK_TITLE_FIELD).clear();
        getDriver().findElement(MentorTaskPage.TASK_TITLE_FIELD).sendKeys(taskTitle);
    }

    @And("User click on Description Field")
    public void userClickOnDescriptionField() {
        getDriver().findElement(MentorTaskPage.TASK_DESCRIPTION_FIELD).click();
    }

    @And("User input {string} as Task Description")
    public void userInputAsTaskDescription(String taskDueDate) {
        getDriver().findElement(MentorTaskPage.TASK_DESCRIPTION_FIELD).clear();
        getDriver().findElement(MentorTaskPage.TASK_DESCRIPTION_FIELD).sendKeys(taskDueDate);
    }

    @And("User click on Due Date Field")
    public void userClickOnDueDateField() {
        getDriver().findElement(MentorTaskPage.TASK_DUE_DATE_FIELD).click();
    }


    @And("User input {string} as Task Due Date")
    public void userInputAsTaskDueDate(String taskDueDate) {
        getDriver().findElement(MentorTaskPage.TASK_DUE_DATE_FIELD).clear();
        getDriver().findElement(MentorTaskPage.TASK_DUE_DATE_FIELD).sendKeys(taskDueDate);
    }

    @And("User click Add button")
    public void userClickAddButton() {
        getDriver().findElement(MentorTaskPage.TASK_ADD_BUTTON).click();
    }

    @Then("Appear Task Created PopUp Message")
    public void appearTaskCreatedPopUpMessage() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.POPUP_VALID_INPUT).isDisplayed();
        getDriver().findElement(MentorTaskPage.CHECKLISTMARK_VALID_INPUT).isDisplayed();
        getDriver().findElement(MentorTaskPage.TASK_CREATED).isDisplayed();
        Thread.sleep(3000);
    }
    @Then("Appear Invalid Input From Client Error Message")
    public void appearInvalidInputFromClientErrorMessage() {
        getDriver().findElement(MentorTaskPage.POPUP_INVALID_INPUT).isDisplayed();
        getDriver().findElement(MentorTaskPage.CLOSEMARK_INVALID_INPUT).isDisplayed();
        getDriver().findElement(MentorTaskPage.ERROR_INVALID_INPUT).isDisplayed();
    }

    @And("The new task successfully created")
    public void theNewTaskSuccessfullyCreated() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.OK_BUTTON_ON_VALID_INPUT_POPUP).isDisplayed();
        getDriver().findElement(MentorTaskPage.OK_BUTTON_ON_VALID_INPUT_POPUP).click();
        Thread.sleep(5000);
    }

    @And("The new task can not be created")
    public void theNewTaskCanNotBeCreated() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.OK_BUTTON_ON_INVALID_INPUT_POPUP).isDisplayed();
        getDriver().findElement(MentorTaskPage.OK_BUTTON_ON_INVALID_INPUT_POPUP).click();
        Assert.assertEquals(MentorHomePage.CREATE_TASK_PAGE, getDriver().getCurrentUrl());
        Thread.sleep(5000);
    }

    @And("The new task with empty input on Description field can not be created")
    public void theNewTaskWithEmptyInputOnDescriptionFieldCanNotBeCreated() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.OK_BUTTON_ON_INVALID_INPUT_POPUP).isDisplayed();
        getDriver().findElement(MentorTaskPage.OK_BUTTON_ON_INVALID_INPUT_POPUP).click();
        Thread.sleep(5000);
    }

    @And("The new task with empty input on Due Date field can not be created")
    public void theNewTaskWithEmptyInputOnDueDateFieldCanNotBeCreated() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.OK_BUTTON_ON_INVALID_INPUT_POPUP).isDisplayed();
        getDriver().findElement(MentorTaskPage.OK_BUTTON_ON_INVALID_INPUT_POPUP).click();
        Thread.sleep(5000);
    }

    @And("User input document attachment")
    public void userInputFileAttachment() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.CHOOSE_FILE_ATTACHMENT).sendKeys(MentorTaskPage.DOCUMENT_ATTACHMENT+"/angsuran.pdf");
        Thread.sleep(5000);
        //getDriver().findElement(MentorProfilePage.BUTTON_UPLOAD_IMAGE).sendkeys(MentorProfilePage.IMAGE_ATTACHMENT+"/imagestests.jpg");
    }

    @And("User input image attachment")
    public void userInputImageAttachment() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.CHOOSE_IMAGE_ATTACHMENT).sendKeys(MentorTaskPage.IMAGE_ATTACHMENT+"/serenityyy.png");
        Thread.sleep(5000);
    }
}

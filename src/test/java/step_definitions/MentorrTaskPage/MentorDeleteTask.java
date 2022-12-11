package step_definitions.MentorrTaskPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mentutor.Page.mentorPage.MentorHomePage;
import mentutor.Page.mentorPage.MentorTaskPage;
import org.junit.Assert;

import static net.serenitybdd.core.Serenity.getDriver;

public class MentorDeleteTask {
    MentorTaskPage mentorTaskPage;

    @And("User click one of specific task option button")
    public void userClickOneOfTheSpecificTaskOptionButton() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.TASK_OPTION_BUTTON).click();
        Thread.sleep(5000);
    }

    @And("User click Delete button")
    public void userClickDeleteButton() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.TASK_DELETE_BUTTON).click();
        Thread.sleep(5000);
    }
    @And("Delete confirmation dialog box appeared")
    public void deleteConfirmationDialogBoxAppeared() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.TASK_DELETE_DIALOG_BOX).isDisplayed();
        getDriver().findElement(MentorTaskPage.TASK_DELETE_WARNING_ON_DIALOG_BOX).isDisplayed();
        getDriver().findElement(MentorTaskPage.TASK_AREYOUSURE_ON_DIALOG_BOX).isDisplayed();
        getDriver().findElement(MentorTaskPage.TASK_DOYOUWANTTODELETE_ON_DIALOG_BOX).isDisplayed();
        Thread.sleep(5000);
    }

    @And("User choose Yes Delete button on delete confirmation dialog box")
    public void userChooseYesDeleteButtonOnDeleteConfirmationDialogBox() throws InterruptedException {
        getDriver().findElement(MentorTaskPage.TASK_YES_DELETE_BUTTON).click();
        Thread.sleep(5000);
    }

    @Then("Appear Task Successfully Deleted PopUp Message")
    public void appearTaskSuccessfullyDeletedPopUpMessage() {
        getDriver().findElement(MentorTaskPage.TASK_DELETED_POPUP_WINDOW);
        getDriver().findElement(MentorTaskPage.TASK_DELETED_CHECKLIST);
        getDriver().findElement(MentorTaskPage.TASK_SUCCESSFULLY_DELETED);
        getDriver().findElement(MentorTaskPage.TASK_DELETED_OK_BUTTON);
    }

    @And("The selected task successfully deleted")
    public void theSelectedTaskSuccessfullyDeleted() throws InterruptedException {
        Assert.assertEquals(MentorHomePage.CREATE_TASK_PAGE, getDriver().getCurrentUrl());
        Thread.sleep(5000);
    }
}

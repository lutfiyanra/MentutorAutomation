package step_definitions.MenteTaskPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.menteePage.MenteeTaskPage;
import static net.serenitybdd.core.Serenity.getDriver;

public class TaskPageFunctionStepDefs {
    MenteeTaskPage menteeTaskPage;

    @Then("mentee input file pdf on task page")
    public void menteeInputFilePdfOnTaskPage() throws InterruptedException {
        getDriver().findElement(MenteeTaskPage.MENTEE_CHOOSE_FILE)
                .sendKeys(MenteeTaskPage.DOCUMENT_ATTACHMENT+"/saya.pdf");
        Thread.sleep(5000);
    }

    @Then("mentee click send button")
    public void menteeClickSendButton() {
        getDriver().findElement(MenteeTaskPage.MENTEE_SUBMIT_CARD).click();
    }

    @When("mentee click submit your task button")
    public void menteeClickSubmitYourTaskButton() {
        getDriver().findElement(MenteeTaskPage.MENTEE_SUBMIT_YOUR_TASK_BUTTON).click();
    }
}

package step_definitions.MenteeForumPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.menteePage.MenteeForumPage;

import static net.serenitybdd.core.Serenity.getDriver;

public class MenteeForumPageFuncStepDefs {
    MenteeForumPage menteeForumPage;

    @When("mentee input {string} on field status")
    public void menteeInputOnFieldStatus(String inputStatus) throws InterruptedException {
        getDriver().findElement(MenteeForumPage.MENTEE_FIELD_STATUS).sendKeys(inputStatus);
        Thread.sleep(5000);
    }

    @Then("mentee click button send")
    public void menteeClickButtonSend() {
        getDriver().findElement(MenteeForumPage.MENTEE_BUTTON_SEND).click();
    }


}

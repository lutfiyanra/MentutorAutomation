package step_definitions.MenteeHomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.menteePage.MenteeHomePage;
import mentutor.Page.mentorPage.MentorHomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class MenteeNavMenuStepDefs {
    MenteeHomePage menteeHomePage;
    @Then("All menu of mentee homepage is displayed")
    public void allMenuOfMenteeHomepageIsDisplayed() {
        getDriver().findElement(MenteeHomePage.MENTEE_HOME_NAV).isDisplayed();
    }
    @Then("Name of mentee displayed")
    public void nameOfMenteeDisplayed() {
        getDriver().findElement(MenteeHomePage.MENTEE_PROFILE_NAME);
    }
    @When("mentee click button view all your task")
    public void menteeClickButtonViewAllYourTask() {
        getDriver().findElement(MenteeHomePage.MENTEE_VIEW_ALL_TASK).click();
    }
    @Then("mentee will be landed on Task Page")
    public void menteeWillBeLandedOnTaskPage() throws InterruptedException {
        Assert.assertEquals(MenteeHomePage.MENTEE_TASK_PAGE, getDriver().getCurrentUrl());
        Thread.sleep(1000);
    }
    @When("mentee click Task menu")
    public void menteeClickTaskMenu() {
        getDriver().findElement(MenteeHomePage.MENTEE_TASK_NAV).click();
    }
    @When("mentee click Forum menu")
    public void menteeClickForumMenu() {
        getDriver().findElement(MenteeHomePage.MENTEE_FORUM_NAV).click();
    }
    @Then("mentee will be landed on Forum Page")
    public void menteeWillBeLandedOnForumPage() throws InterruptedException {
        Assert.assertEquals(MenteeHomePage.MENTEE_FORUM_PAGE, getDriver().getCurrentUrl());
        Thread.sleep(1000);
    }
    @When("mentee click Profile menu")
    public void menteeClickProfileMenu() {
        getDriver().findElement(MenteeHomePage.MENTEE_PROFILE_NAV).click();
    }
    @Then("mentee will be landed on Profile Page")
    public void menteeWillBeLandedOnProfilePage() throws InterruptedException{
        Thread.sleep(5000);
        Assert.assertEquals(MenteeHomePage.MENTEE_PROFILE_PAGE, getDriver().getCurrentUrl());
    }
    @Then("status of mentee displayed")
    public void statusOfMenteeDisplayed() {
        getDriver().findElement(MenteeHomePage.MENTEE_PROFILE_STATUS);
    }
    @Then("title on logged in displayed")
    public void titleOnLoggedInDisplayed() {
        getDriver().findElement(MenteeHomePage.MENTEE_HOME_TITLE);
    }
    @Then("description title on logged in displayed")
    public void descriptionTitleOnLoggedInDisplayed() {
        getDriver().findElement(MenteeHomePage.MENTEE_HOME_TITLE_DESC);
    }

    @Then("photo profile on logged in displayed")
    public void photoProfileOnLoggedInDisplayed() {
        getDriver().findElement(MenteeHomePage.MENTEE_PHOTO_PROFILE);
    }
}

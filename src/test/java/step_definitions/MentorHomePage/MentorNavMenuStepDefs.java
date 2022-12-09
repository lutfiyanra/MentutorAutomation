package step_definitions.MentorHomePage;

import com.sun.glass.events.WheelEvent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.mentorPage.MentorHomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class MentorNavMenuStepDefs {

    MentorHomePage mentorHomePage;

    @When("User wait until all element successfully loaded")
    public void userWaitUntilAllElementSuccessfullyLoaded(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("All menu of mentor homepage is displayed")
    public void allMenuOfMentorHomepageIsDisplayed() {
        getDriver().findElement(MentorHomePage.MENTOR_HOME_NAV).isDisplayed();
    }

    @Then("Name of mentor displayed")
    public void nameOfMentorDisplayed() {
        getDriver().findElement(MentorHomePage.MENTOR_PROFILE_NAV);
    }

    @Then("Role of user displayed")
    public void roleOfUserDisplayed() {
        getDriver().findElement(MentorHomePage.PROFILE_ROLE);
    }

    @When("User click Task menu")
    public void userClickTaskMenu() {
        getDriver().findElement(MentorHomePage.MENTOR_TASK_NAV).click();
    }

    @Then("User will be landed on Create Task Page")
    public void userWillBeLandedOnCreateTaskPage() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(MentorHomePage.CREATE_TASK_PAGE, getDriver().getCurrentUrl());
    }

    @When("User click Forum menu")
    public void userClickForumMenu() {
        getDriver().findElement(MentorHomePage.MENTOR_FORUM_NAV).click();
    }

    @Then("User will be landed on Forum Page")
    public void userWillBeLandedOnForumPage() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(MentorHomePage.MENTOR_FORUM_PAGE, getDriver().getCurrentUrl());
    }

    @When("User click Profile menu")
    public void userClickProfileMenu() {
        getDriver().findElement(MentorHomePage.MENTOR_PROFILE_NAV).click();
    }

    @Then("User will be landed on Mentor Profile Page")
    public void userWillBeLandedOnMentorProfilePage() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(MentorHomePage.MENTOR_PROFILE_PAGE, getDriver().getCurrentUrl());
    }

    @When("User click View All Task menu")
    public void userClickViewAllTaskMenu() {
//        Assert.assertEquals(MentorHomePage.);
        getDriver().findElement(MentorHomePage.MENTOR_VIEW_ALL_TASK).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("User will be landed on Task Menu")
    public void userWillBeLandedOnTaskMenu() throws InterruptedException {
        Assert.assertEquals(MentorHomePage.CREATE_TASK_PAGE, getDriver().getCurrentUrl());
        Thread.sleep(1000);
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
}
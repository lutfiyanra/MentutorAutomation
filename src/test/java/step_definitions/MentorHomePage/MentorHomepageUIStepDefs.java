package step_definitions.MentorHomePage;

import io.cucumber.java.en.Then;
import mentutor.Page.mentorPage.MentorHomePage;
import mentutor.Page.mentorPage.MentorTaskPage;

import static net.serenitybdd.core.Serenity.getDriver;

public class MentorHomepageUIStepDefs {

    @Then("Hero image on mentor homepage can be seen")
    public void heroImageOnMentorHomepageCanBeSeen() {
        getDriver().findElement(MentorHomePage.IMAGE_HERO).isDisplayed();
    }

    @Then("Title text beside image hero on mentor homepage can be seen")
    public void titleTextBesideImageHeroOnMentorHomepageCanBeSeen() {
        getDriver().findElement(MentorHomePage.TEXT_BESIDE_IMAGE_HERO).isDisplayed();
    }

    @Then("Description text beside image hero on mentor homepage can be seen")
    public void descriptionTextBesideImageHeroOnMentorHomepageCanBeSeen() {
        getDriver().findElement(MentorHomePage.DESCRIPTION_IMAGE_HERO).isDisplayed();
    }

    @Then("View all task on mentor homepage is displayed")
    public void viewAllTaskOnMentorHomepageIsDisplayed() {
        getDriver().findElement(MentorHomePage.MENTOR_VIEW_ALL_TASK).isDisplayed();
    }

    @Then("Your created task title on mentor homepage is displayed")
    public void yourCreatedTaskTitleOnMentorHomepageIsDisplayed() {
        getDriver().findElement(MentorHomePage.YOUR_CREATED_TASK).isDisplayed();
    }

    @Then("Single list of task created on mentor homepage is displayed")
    public void singleListOfTaskCreatedOnMentorHomepageIsDisplayed() {
        getDriver().findElement(MentorHomePage.SINGLE_TASK_CARD_CREATED).isDisplayed();
    }
}

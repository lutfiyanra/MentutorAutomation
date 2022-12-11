package step_definitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mentutor.Page.adminPage.AdminInputMember;
import org.junit.Assert;

import static net.serenitybdd.core.Serenity.getDriver;

public class AdminMemberClassStepDefs {
    @Given("User already on member page")
    public void userAlreadyOnMemberPage() {
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_ICON).click();
        Assert.assertEquals(AdminInputMember.INPUT_MEMBER_PAGE, getDriver().getCurrentUrl());
    }

    @Given("User input fill name by {string}")
    public void userInputFillNameBy(String namemember) {
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_NAME).clear();
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_NAME).sendKeys(namemember);
    }

    @Then("User input email member by {string} and password by {string}")
    public void userInputEmailMemberByAndPasswordBy(String emailmember, String passwordmember) {
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_EMAIL).clear();
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_EMAIL).sendKeys(emailmember);
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_CLASS_PASSWORD).clear();
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_CLASS_PASSWORD).sendKeys(passwordmember);
    }

    @Then("User click choose a role")
    public void userClickChooseARole() {
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_ROLE_DROPDOWN).click();
    }

    @Then("User select mentor")
    public void userSelectMentor() {
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_ROLE_MENTOR).click();
    }

    @Then("User click choose a class")
    public void userClickChooseAClass() {
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_CLASS_DROPDOWN).click();
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_CLASS_LIST).click();
    }

    @And("User click add member")
    public void userClickAddMember() {
        getDriver().findElement(AdminInputMember.ADD_MEMBER).click();
    }
    @And("User Confirm add member")
    public void userConfirmAddMember() {
        getDriver().findElement(AdminInputMember.CONFIRM_ADD_MEMBER).click();
    }
    @And("User Logout")
    public void userLogout() {
        getDriver().findElement(AdminInputMember.LOGOUT).click();
        getDriver().findElement(AdminInputMember.LOGOUT_CANCEL).click();
    }


    @Then("User select mentee")
    public void userSelectMentee() {
        getDriver().findElement(AdminInputMember.INPUT_MEMBER_ROLE_MENTEE).click();
    }

    @And("User Logout OK")
    public void userLogoutOK() {
        getDriver().findElement(AdminInputMember.LOGOUT).click();
        getDriver().findElement(AdminInputMember.LOGOUT_OK).click();
        getDriver().findElement(AdminInputMember.LOGOUT_CONFIRM).click();
    }
}

package step_definitions.AdminMemberPage;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mentutor.Page.adminPage.AdminInputMember;

import static net.serenitybdd.core.Serenity.getDriver;

public class AdminMemberPageStepDefs {
    AdminInputMember adminInputMember;
    @Given("User click icon input member on admin home page")
    public void userClickIconInputMemberOnAdminHomePage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.ICON_INPUT_MEMBER).click();
        Thread.sleep(2000);
    }

    @And("Displayed input member page")
    public void displayedInputMemberPage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.HEADER_INPUT_MEMBER).isDisplayed();
    }

    @And("Displayed title member page")
    public void displayedTitleMemberPage() {
        getDriver().findElement(AdminInputMember.HEADER_INPUT_MEMBER).isDisplayed();
    }
    @Then("Displayed description title member page")
    public void displayedDescriptionTitleMemberPage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.DESCRIPTION_HEADER).isDisplayed();
        Thread.sleep(2000);
    }

    @And("Displayed card input member page")
    public void displayedCardInputMemberPage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.CARD_INPUT_MEMBER).isDisplayed();
        Thread.sleep(2000);
    }
    @And("Displayed name title input member page")
    public void displayedNameTitleInputMemberPage() {
        getDriver().findElement(AdminInputMember.NAME_TITLE_FIELD).isDisplayed();
    }
    @And("Displayed email title input member page")
    public void displayedEmailTitleInputMemberPage() {
        getDriver().findElement(AdminInputMember.EMAIL_TITLE_FIELD).isDisplayed();
    }
    @And("Displayed role title input member page")
    public void displayedRoleTitleInputMemberPage() {
        getDriver().findElement(AdminInputMember.ROLE_DROPDOWN).isDisplayed();
    }
    @And("Displayed class title input member page")
    public void displayedClassTitleInputMemberPage() {
        getDriver().findElement(AdminInputMember.CLASS_DROPDOWN).isDisplayed();
    }
    @Then("Displayed button add input member page")
    public void displayedButtonAddInputMemberPage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.PASS_TITLE_FIELD).isDisplayed();
        Thread.sleep(2000);
    }
}

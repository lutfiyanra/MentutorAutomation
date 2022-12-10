package step_definitions.AdminMemberPage;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mentutor.Page.adminPage.AdminInputMember;

import static net.serenitybdd.core.Serenity.getDriver;

public class AdminMemberFunctionStepDefs {

    AdminInputMember adminInputMember;

    @Then("User click name field on on input member page")
    public void userClickNameFieldOnOnInputMemberPage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.NAME_FIELD).click();
        Thread.sleep(2000);
    }
    @Then("User click email field on on input member page")
    public void userClickEmailFieldOnOnInputMemberPage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.EMAIL_FIELD).click();
        Thread.sleep(2000);
    }

    @Then("User click role dropdown on on input member page")
    public void userClickRoleDropdownOnOnInputMemberPage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.ROLE_DROPDOWN).click();
        Thread.sleep(2000);
    }
    @Then("User click class dropdown on on input member page")
    public void userClickClassDropdownOnOnInputMemberPage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.CLASS_DROPDOWN).click();
        Thread.sleep(2000);
    }
    @Then("User click password field on on input member page")
    public void userClickPasswordFieldOnOnInputMemberPage() throws InterruptedException {
        getDriver().findElement(AdminInputMember.PASS_FIELD).click();
        Thread.sleep(2000);
    }
}

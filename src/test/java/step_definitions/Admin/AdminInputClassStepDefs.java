package step_definitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mentutor.Page.adminPage.AdminInputClass;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class AdminInputClassStepDefs {
    //skenario 1
    @Then("User Input Class icon")
    public void userInputClassIcon() throws InterruptedException{
        getDriver().findElement(AdminInputClass.INPUT_CLASS_ICON).click();
        Assert.assertEquals(AdminInputClass.INPUTCLASSPAGE, getDriver().getCurrentUrl());
    }

    @Given("User Input Class {string}")
    public void userInputClass (String clas) {
        getDriver().findElement(AdminInputClass.INPUT_CLASS).clear();
        getDriver().findElement(AdminInputClass.INPUT_CLASS).sendKeys(clas);
    }

    @And("User Click add")
    public void userClickAdd() { getDriver().findElement(AdminInputClass.ADD_INPUT_CLASS).click();
    }

    @And("User Confirm")
    public void userConfirm() { getDriver().findElement(AdminInputClass.CONFIRM_INPUT_CLASS).click();
    }
//skenario 2
    @Then("User click three dots buttom input class")
    public void userClickThreeDotsButtomInputClass() throws InterruptedException { new WebDriverWait(getDriver(),
            Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(AdminInputClass.THREE_DOT_INPUT_CLASS));
        getDriver().findElement(AdminInputClass.THREE_DOT_INPUT_CLASS).click();
    }
    @Then("User click Edit Class")
    public void userClickEditClass() { new WebDriverWait(getDriver(),
            Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(AdminInputClass.EDIT_INPUT_CLASS));
        getDriver().findElement(AdminInputClass.EDIT_INPUT_CLASS).click();
    }

    @And("User close edit Class")
    public void userCloseEditClass() {  new WebDriverWait(getDriver(),
        Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(AdminInputClass.EDIT_CLOSE_POP_UP));
        getDriver().findElement(AdminInputClass.EDIT_CLOSE_POP_UP).click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("User click Delete Class")
    public void userClickDeleteClass() { new WebDriverWait(getDriver(),
            Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(AdminInputClass.DELETE_INPUT_CLASS));
        getDriver().findElement(AdminInputClass.DELETE_INPUT_CLASS).click();
    }

    @And("User select Cancel Delete")
    public void userSelectCancelDelete() {
        new WebDriverWait(getDriver(),
                Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(AdminInputClass.DELETE_YES_DELETE));
        getDriver().findElement(AdminInputClass.DELETE_YES_DELETE).click();
        getDriver().findElement(AdminInputClass.DELETE_YES_DELETE_CONFIRM).click();
    }

    @And("User select Yes Delete Class")
    public void userSelectYesDeleteClass() {
        new WebDriverWait(getDriver(),
                Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(AdminInputClass.DELETE_CANCEL));
        getDriver().findElement(AdminInputClass.DELETE_CANCEL).click();
    }

    @Then("Click dropdown status")
    public void clickDropdownStatus() {
        getDriver().findElement(AdminInputClass.DROPDOWN_STATUS_EDIT_INPUT_CLASS).click();
    }

    @Then("Click active status")
    public void clickActiveStatus() {
        {getDriver().findElement(AdminInputClass.EDIT_INPUT_CLASS_ACTIVE).click();}
    }

    @Then("Click submitt Edit Class")
    public void clickSubmittEditClass() {
        getDriver().findElement(AdminInputClass.EDIT_INPUT_CLASS_SUBMITT).click();
    }

    @Then("Click confirm Edit Class")
    public void clickConfirmEditClass() {
        getDriver().findElement(AdminInputClass.EDIT_INPUT_CLASS_CONFIRM).click();
    }

    @Then("Click non_active status")
    public void clickNon_activeStatus() {
        getDriver().findElement(AdminInputClass.EDIT_INPUT_CLASS_NON_ACTIVE).click();
    }


}

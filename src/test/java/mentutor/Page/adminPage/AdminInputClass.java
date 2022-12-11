package mentutor.Page.adminPage;

import org.openqa.selenium.By;

public class AdminInputClass {
    public static final String INPUTCLASSPAGE = "https://mentutor.vercel.app/inputclass";
    public static final By INPUT_CLASS_ICON = By.cssSelector("#nav-input > .hidden");
    public static final By INPUT_CLASS = By.id("input-class");
    public static final By ADD_INPUT_CLASS = By.cssSelector("#btn-addClass");
    public static final By CONFIRM_INPUT_CLASS = By.cssSelector(".swal2-confirm");
    public static final By THREE_DOT_INPUT_CLASS = By.cssSelector(".mb-7 > div:nth-of-type(2) path:nth-of-type(1)");
    public static final By DROPDOWN_INPUT_CLASS = By.cssSelector(".mb-7 > div:nth-of-type(2) .dropdown-content");
    public static final By EDIT_INPUT_CLASS = By.id("edit-click");
    public static final By DELETE_INPUT_CLASS = By.id("delete-click");
    public static final By EDIT_CLOSE_POP_UP = By.xpath("//label[.='✕']");
    public static final By DELETE_YES_DELETE = By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']");
    public static final By DELETE_YES_DELETE_CONFIRM = By.cssSelector(".swal2-confirm");
    public static final By DELETE_CANCEL = By.xpath("//button[@class='swal2-cancel swal2-styled']");
    public static final By EDIT_INPUT_CLASS_FIELD = By.cssSelector ("[value='Jalan Automate API Testing']");
    public static final By DROPDOWN_STATUS_EDIT_INPUT_CLASS = By.cssSelector("#dropdown-status");
    public static final By EDIT_INPUT_CLASS_ACTIVE = By.cssSelector("#active");
    public static final By EDIT_INPUT_CLASS_NON_ACTIVE = By.cssSelector("#non_active");
    public static final By EDIT_INPUT_CLASS_SUBMITT = By.cssSelector("#btn-submitEditClass");
    public static final By EDIT_INPUT_CLASS_CONFIRM = By.cssSelector(".swal2-confirm");
    
}

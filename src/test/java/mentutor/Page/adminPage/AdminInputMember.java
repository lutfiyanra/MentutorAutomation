package mentutor.Page.adminPage;

import org.openqa.selenium.By;

public class AdminInputMember {
    public static final String INPUT_MEMBER_PAGE = "https://mentutor.vercel.app/inputmember";
    public static final By INPUT_MEMBER_ICON = By.cssSelector("#nav-member > .hidden");
    public static final By INPUT_MEMBER_NAME = By.id("input-fullname");
    public static final By INPUT_MEMBER_EMAIL = By.id("input-email");
    public static final By INPUT_MEMBER_ROLE_DROPDOWN = By.cssSelector("#dropdown-role");
    public static final By INPUT_MEMBER_ROLE_MENTOR = By.cssSelector("#mentor");
    public static final By INPUT_MEMBER_ROLE_MENTEE = By.cssSelector("#mentee");
    public static final By INPUT_MEMBER_CLASS_DROPDOWN = By.cssSelector("#dropdown-class");
    public static final By INPUT_MEMBER_CLASS_LIST = By.cssSelector("[value='14']");
    public static final By INPUT_MEMBER_CLASS_PASSWORD = By.id("input-password");
    public static final By ADD_MEMBER = By.cssSelector("#btn-addMember");
    public static final By CONFIRM_ADD_MEMBER = By.cssSelector(".swal2-confirm");
    public static final By LOGOUT = By.cssSelector("#btn-logout > .hidden");
    public static final By LOGOUT_OK = By.cssSelector(".swal2-confirm");
    public static final By LOGOUT_CANCEL = By.cssSelector(".swal2-cancel");
    public static final By LOGOUT_CONFIRM = By.cssSelector(".swal2-confirm");
}

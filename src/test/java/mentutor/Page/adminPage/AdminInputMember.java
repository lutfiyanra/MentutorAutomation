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

    public static final String ADMINHOMEPAGE = "https://mentutor.vercel.app/homeadmin";

    public static final By ICON_INPUT_MEMBER = By.id("nav-member");
    public static final By HEADER_INPUT_MEMBER = By.xpath("//h1[@class='text-putih text-lg md:text-2xl font-medium']");
    public static final By DESCRIPTION_HEADER = By.xpath("//p[@class='text-abu font-light text-[8px] md:text-sm ']");
    public static final By CARD_INPUT_MEMBER = By.xpath("//form[@class='w-full lg:w-[35rem] h-auto  bg-card rounded-[20px] text-xs md:text-lg p-5 md:p-10 ']");
    public static final By NAME_TITLE_FIELD = By.xpath("//p[.='Name']");
    public static final By EMAIL_TITLE_FIELD = By.xpath("//h1[.='Email']");
    public static final By ROLE_TITLE_FIELD = By.xpath("//h1[.='Role']");
    public static final By CLASS_TITLE_FIELD = By.xpath("//p[.='Class']");
    public static final By PASS_TITLE_FIELD = By.xpath("//p[.='Password']");
    public static final By NAME_FIELD = By.id("input-fullname");
    public static final By EMAIL_FIELD = By.id("input-email");
    public static final By ROLE_DROPDOWN =By.id("dropdown-role");
    public static final By CLASS_DROPDOWN = By.id("dropdown-class");
    public static final By PASS_FIELD = By.id("input-password");
    public static final By BUTTON_ADD_MEMBER = By.id("btn-addMember");
}

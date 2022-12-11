package mentutor.Page.adminPage;

import org.openqa.selenium.By;

public class AdminHomePage {
    public static final String ADMINHOMEPAGE = "https://mentutor.vercel.app/homeadmin";
    public static final By THREE_DOT_HOME_PAGE  = By.cssSelector("[index='0'] [stroke='currentColor']");
    public static final By EDIT_HOME_PAGE = By.cssSelector("[index='0'] .px-4");
    public static final By DELETE_HOME_PAGE = By.cssSelector("[index='0'] #delete-click");
    public static final By YES_DELETE_HOME_PAGE = By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']");
    public static final By CANCEL_DELETE_HOME_PAGE = By.cssSelector(".swal2-cancel");
    public static final By CLOSE_EDIT_PROFILE_USER = By.cssSelector(".btn-sm");
    public static final By SUBMITT_EDIT_PROFILE_USER = By.cssSelector("#btn-submitAdmin");
    public static final By INPUT_FULL_NAME_EDIT_PROFILE_USER = By.id("input-fullname");
    public static final By INPUT_EMAIL_EDIT_PROFILE_USER = By.id("input-email");
    public static final By INPUT_PASSWORD_PROFILE_USER = By.id("input-password");
    public static final By INPUT_CLASS_EDIT_PROFILE_USER = By.cssSelector("#dropdown-class");
    public static final By SELECT_INPUT_CLASS_EDIT_PROFILE_USER = By.cssSelector("[value='228']");
    public static final By SUCCESS_UPDATE_EDIT_PROFILE_USER = By.cssSelector(".swal2-confirm");
    public static final By HOME_ICON = By.cssSelector("[d='M946.5 505L534.6 93.4a31.93 31.93 0 0 0-45.2 0L77.5 505c-12 12-18.8 28.3-18.8 45.3 0 35.3 28.7 64 64 64h43.4V908c0 17.7 14.3 32 32 32H448V716h112v224h265.9c17.7 0 32-14.3 32-32V614.3h43.4c17 0 33.3-6.7 45.3-18.8 24.9-25 24.9-65.5-.1-90.5z']");

}

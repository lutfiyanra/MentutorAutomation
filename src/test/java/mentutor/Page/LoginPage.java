package mentutor.Page;

import mentutor.model.Roles;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LoginPage {

    // Admin


    // Mentor
    public static final String LOGIN_URL  = "https://mentutor.vercel.app/";

    public static final By LOGIN_IMAGE = By.cssSelector("#gbr-login");
    public static final By LOGIN_TITLE_PAGE = By.xpath("//h1[@class='font-semibold text-4xl mb-10']");
    public static final By EMAIL_TITLE_PAGE = By.xpath("//p[.='Email']");
    public static final By EMAIL_FIELD = By.id("input-email");
    public static final By PASSWORD_TITLE_PAGE = By.xpath("//p[.='Password']");
    public static final By PASSWORD_FIELD = By.id("input-password");
    public static final By LOGIN_BTN = By.id("btn-login");
    public static final By OK_BUTTON_LOGIN = By.cssSelector(".swal2-confirm");
    public static final By TEXT_UNDER_LOGIN_BUTTON = By.cssSelector(".text-gray-500");
    public static final By ERROR_LOGIN = By.xpath("//button[@class='swal2-confirm swal2-styled']");
    public static final By ERROR_EMAIL_REQUIRED = By.xpath("//p[.='Email is required']");
    public static final By ERROR_PASSWORD_REQUIRED = By.xpath("//p[.='Password is required']");

    // Mentee

}

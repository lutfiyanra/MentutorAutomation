package mentutor.Page.menteePage;

import mentutor.model.PageNavigation;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.core.Serenity.getDriver;

public class MenteeHomePage {
    PageNavigation pageNav;

    public static final String MENTEE_HOME_PAGE = "https://mentutor.vercel.app/homementee";
    public static final String MENTEE_TASK_PAGE = "https://mentutor.vercel.app/task";
    public static final String MENTEE_FORUM_PAGE = "https://mentutor.vercel.app/forummentee";
    public static final String MENTEE_PROFILE_PAGE = "https://mentutor.vercel.app/profilementee";

    public static final By MENTEE_PROFILE_NAME = By.id("name-profile");
    public static final By MENTEE_VIEW_ALL_TASK = By.xpath("//p[@id='view-task']");
    public static final By MENTEE_PROFILE_STATUS = By.xpath("//p[@class='text-abu font-normal text-[8px] md:text-xs']");
    public static final By MENTEE_HOME_TITLE = By.xpath("//h1[@class='text-putih text-lg md:text-3xl font-medium']");
    public static final By MENTEE_HOME_TITLE_DESC = By.xpath("//p[@class='text-abu font-light text-[8px] md:text-sm']");
    public static final By MENTEE_PHOTO_PROFILE = By.id("gbr-hero");
    public static final By MENTEE_HOME_NAV = By.xpath("//h3[.='Home']");
    public static final By MENTEE_TASK_NAV = By.xpath("//h3[contains(.,'Task')]");
    public static final By MENTEE_FORUM_NAV = By.xpath("//h3[.='Forum']");
    public static final By MENTEE_PROFILE_NAV = By.xpath("//h3[.='Profile']");


    @Step("Mentee check navigation menu visibility")
    public void userCheckNavigationMenuVisibility(){
        getDriver().findElement(MENTEE_HOME_NAV).isDisplayed();
        getDriver().findElement(MENTEE_TASK_NAV).isDisplayed();
        getDriver().findElement(MENTEE_FORUM_NAV).isDisplayed();
        getDriver().findElement(MENTEE_PROFILE_NAV).isDisplayed();
    }

    @Step("Mentee click Task menu")
    public void menteeClickTaskMenu(){
        getDriver().findElement(MENTEE_TASK_NAV).click();
    }
    @Step("Mentee click Forum menu")
    public void menteeClickForumMenu(){
        getDriver().findElement(MENTEE_FORUM_NAV).click();
    }
//    @Step("Mentee click Profile menu")
//    public void menteeClickProfileMenu(){
//        getDriver().findElement(MENTEE_PROFILE_NAV).click();
//    }
    @Step("Mentee click view all task menu")
    public void menteeClickViewAllTaskMenu(){
        getDriver().findElement(MENTEE_VIEW_ALL_TASK);
    }
}

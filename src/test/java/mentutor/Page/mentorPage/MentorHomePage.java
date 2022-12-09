package mentutor.Page.mentorPage;

import mentutor.model.PageNavigation;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.apache.commons.io.FileUtils.waitFor;

public class MentorHomePage {

//    @Managed
//    private WebDriver getDriver;
//    WebDriver driver = getDriver();
    PageNavigation pageNav;

    public static final String MENTORHOMEPAGE = "https://mentutor.vercel.app/homementor";
    public static final String CREATE_TASK_PAGE = "https://mentutor.vercel.app/inputtask";
    public static final String MENTOR_FORUM_PAGE = "https://mentutor.vercel.app/forummentor";
    public static final String MENTOR_PROFILE_PAGE = "https://mentutor.vercel.app/profilementor";
//    public static final By MENTOR_HOME_NAV = By.cssSelector("#nav-homemntor > .hidden");
//    public static final By MENTOR_TASK_NAV = By.xpath("//h3[.='Task']");
//    public static final By MENTOR_FORUM_NAV = By.xpath("//h3[.='Forum']");
//    public static final By MENTOR_PROFILE_NAV = By.xpath("//h3[.='Profile']");
//    public static final By PROFILE_NAME = By.xpath("//h1[@id='profile-name']");
    public static final By PROFILE_ROLE = By.xpath("//p[@class='text-abu font-light text-[8px] md:text-xs']");
    public static final By MENTOR_VIEW_ALL_TASK = By.xpath("//p[@id='view-task']");

    public static final By MENTOR_HOME_NAV = By.id("nav-homemntor");
    public static final By MENTOR_TASK_NAV = By.id("nav-inputtask");
    public static final By MENTOR_FORUM_NAV = By.id("nav-forummentor");
    public static final By MENTOR_PROFILE_NAV = By.id("nav-profile");

    @Step("Mentor check navigation menu visibility")
    public void userCheckNavigationMenuVisibility(){
        getDriver().findElement(MENTOR_HOME_NAV).isDisplayed();
        getDriver().findElement(MENTOR_TASK_NAV).isDisplayed();
        getDriver().findElement(MENTOR_FORUM_NAV).isDisplayed();
        getDriver().findElement(MENTOR_PROFILE_NAV).isDisplayed();
//        driver.findElement(MENTOR_TASK_NAV).isDisplayed();
//        driver.findElement(MENTOR_FORUM_NAV).isDisplayed();
//        driver.findElement(MENTOR_PROFILE_NAV).isDisplayed();
//        driver.findElement(PROFILE_NAME).isDisplayed();
//        driver.findElement(PROFILE_ROLE).isDisplayed();
//        driver.findElement(MENTOR_VIEW_ALL_TASK).isDisplayed();
    }


    @Step("Mentor click Task menu")
    public void mentorClickTaskMenu(){
        getDriver().findElement(MENTOR_TASK_NAV).click();
    }
    @Step("Mentor click Forum menu")
    public void mentorClickForumMenu(){
        getDriver().findElement(MENTOR_FORUM_NAV).click();
    }
    @Step("Mentor click Profile menu")
    public void mentorClickProfileMenu(){
        getDriver().findElement(MENTOR_PROFILE_NAV).click();
    }
    @Step("Mentor click view all task menu")
    public void mentorClickViewAllTaskMenu(){
        getDriver().findElement(MENTOR_VIEW_ALL_TASK);
    }

}

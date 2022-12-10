package mentutor.Page.menteePage;

import mentutor.model.PageNavigation;
import org.openqa.selenium.By;

public class MenteeEditProfile {
    PageNavigation pageNavigation;

    public static final By MENTEE_PROFILE_TITLE = By.xpath("//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']");
    public static final By MENTEE_PROFILE_TITLE_DESCRIPTION = By.xpath("//p[@class='text-abu font-light text-[8px] md:text-sm']");
    public static final By MENTEE_PROFILE_IMAGE = By.cssSelector(".mr-9");
    public static final By MENTEE_PROFILE_CARD = By.cssSelector(".h-auto");
    public static final By MENTEE_BUTTON_EDIT = By.cssSelector(".h-8");

}

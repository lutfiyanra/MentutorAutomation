package mentutor.Page.menteePage;

import mentutor.model.PageNavigation;
import org.openqa.selenium.By;

public class MenteeForumPage {
    PageNavigation pageNavigation;
    public static final By MENTEE_FORUM_TITLE = By.xpath("//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']");
    public static final By MENTEE_FORUM_TITLE_DESCRIPTION = By.xpath("//p[@class='text-abu font-light text-[8px] md:text-sm']");
    public static final By MENTEE_FORUM_CARD = By.xpath("//form[@class=' w-[18rem] md:w-[32rem] lg:w-[52rem] h-auto bg-card py-4 px-4  lg:p-10 rounded-[10px]']");
    public static final By MENTEE_PROFILE_FORUM_CARD = By.xpath("//img[@alt='avatar']");
    public static final By MENTEE_FIELD_STATUS = By.id("input-status");
    public static final By MENTEE_FIELD_COMMENT = By.cssSelector(".pb-9 div:nth-of-type(1) #Input-comment");
    public static final By MENTEE_BUTTON_SEND_COMMENT = By.cssSelector(".pb-9 div:nth-of-type(1) #btn-sendComment");
    public static final By MENTEE_BUTTON_LOAD_MORE_COMMENTS = By.cssSelector(".pb-9 div:nth-of-type(1) #btn-sendComment");
    public static final By MENTEE_BUTTON_HIDDEN_COMMENTS = By.cssSelector(".pb-9 div:nth-of-type(1) #btn-hidecomments");
    public static final By MENTEE_BUTTON_UPLOAD_IMAGES = By.id("btn-upload-gbr");
    public static final By MENTEE_BUTTON_SEND = By.id("btn-send");

}

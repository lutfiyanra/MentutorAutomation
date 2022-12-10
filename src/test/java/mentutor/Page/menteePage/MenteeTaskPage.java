package mentutor.Page.menteePage;

import mentutor.model.PageNavigation;
import org.openqa.selenium.By;

public class MenteeTaskPage {
    PageNavigation pageNavigation;

    public static final By MENTEE_TASK_TITLE = By.xpath("//h1[@class='text-putih text-lg lg:text-2xl font-medium ']");
    public static final By MENTEE_TASK_DESC_TITLE = By.xpath("//p[@class='text-abu text-xs font-light mb-8']");
    public static final By MENTEE_CARD_TASK = By.cssSelector(".pb-9 > div:nth-of-type(1)");
    public static final By MENTEE_CARD_TASK_TITLE = By.cssSelector(".pb-9 > div:nth-of-type(1) .text-putih");
    public static final By MENTEE_DESCRIPTION_CARD_TASK = By.cssSelector(".pb-9 > div:nth-of-type(1) > .text-abu");
    public static final By MENTEE_DUE_DATE_TASK = By.cssSelector(".pb-9 > div:nth-of-type(1) > .items-start > .text-button");
    public static final By MENTEE_POINT_TASK = By.cssSelector(".pb-9 > div:nth-of-type(1) > .mt-4 > .text-xs");
    public static final By MENTEE_SUBMIT_YOUR_TASK_BUTTON = By.xpath("//div[@class='pb-9']/div[1]//label[@id='btn-submitTask']");
    public static final By MENTEE_SUBMIT_CARD = By.cssSelector(".font-normal");
    public static final By MENTEE_SUBMIT_YOUR_TASK_TITLE = By.xpath("//h3[@class='font-medium text-lg text-putih mb-3']");
    public static final By MENTEE_CHOOSE_FILE = By.id("uploadfile-btn");
    public static final String DIR = System.getProperty("user.dir");
    public static final String DOCUMENT_ATTACHMENT = DIR+"/src/test/resources/attachments/documents";
    public static final String IMAGES_ATTACHMENT = DIR+"/src/test/resources/attachments/images";
}

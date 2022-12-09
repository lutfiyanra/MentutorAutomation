package mentutor.Page.mentorPage;

import org.openqa.selenium.By;

public class MentorTaskPage {


    public static final By CREATE_TASK_HEADER = By.xpath("//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-1']");
    public static final By TITLE_BESIDE_HERO = By.cssSelector(".font-medium.text-sm");
    public static final By DESCRIPTION_BESIDE_HERO = By.cssSelector(".mt-2");
    public static final By GIVE_TASK_TO_MENTEE= By.xpath("//p[@class='text-abu text-xs']");
    public static final By TASK_TITLE = By.xpath("//p[@class='text-putih font-normal text-base break-words']");
    public static final By TASK_TITLE_FIELD = By.cssSelector("[placeholder='task title']");
    public static final By TASK_DESCRIPTION = By.xpath("//p[.='Description']");
    public static final By TASK_DESCRIPTION_FIELD = By.xpath("//textarea[@id='input-desc']");
    public static final By TASK_DUE_DATE = By.xpath("//p[.='Due Date']");
    public static final By TASK_DUE_DATE_FIELD = By.xpath("//input[@id='input-date']");
    public static final By TASK_ATTACHMENT = By.xpath("//p[.='Attachment']");
    public static final By TASK_ATTACHMENT_BUTTON = By.cssSelector("#uploadfile-btn");
    public static final By TASK_IMAGE = By.xpath("//p[.='Images']");
    public static final By TASK_IMAGE_BUTTON = By.xpath("//input[@id='uploadimage-btn']");
    public static final By TASK_ADD_BUTTON = By.xpath("//button[@id='input-file']");



}

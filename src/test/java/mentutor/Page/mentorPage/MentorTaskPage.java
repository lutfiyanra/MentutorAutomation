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
    public static final By POPUP_INVALID_INPUT = By.cssSelector(".swal2-popup");
    public static final By CLOSEMARK_INVALID_INPUT = By.cssSelector(".swal2-x-mark");
    public static final By POPUP_VALID_INPUT = By.cssSelector(".swal2-popup");

    public static final By CHECKLISTMARK_VALID_INPUT = By.cssSelector(".swal2-success-ring");
    public static final By TASK_CREATED = By.cssSelector(".swal2-title");
    public static final By ERROR_INVALID_INPUT = By.cssSelector(".swal2-title");
    public static final By OK_BUTTON_ON_INVALID_INPUT_POPUP = By.cssSelector(".swal2-confirm");
    public static final By OK_BUTTON_ON_VALID_INPUT_POPUP = By.cssSelector(".swal2-confirm");
    public static final By CHOOSE_FILE_ATTACHMENT = By.xpath("//input[@id='uploadfile-btn']");
    public static final By CHOOSE_IMAGE_ATTACHMENT = By.xpath("//input[@id='uploadimage-btn']");
    public static final String DIR = System.getProperty("user.dir");
    public static String DOCUMENT_ATTACHMENT = DIR+"/src/test/resources/attachments/documents";
    public static String IMAGE_ATTACHMENT = DIR+"/src/test/resources/attachments/images";
    public static final By TASK_OPTION_BUTTON = By.cssSelector(".relative > form:nth-of-type(1) path:nth-of-type(1)");
    public static final By TASK_DELETE_BUTTON = By.xpath("//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//a[.='Delete']");
    public static final By TASK_DELETE_DIALOG_BOX = By.xpath("//div[@class='swal2-popup swal2-modal swal2-icon-warning swal2-show']");
    public static final By TASK_DELETE_WARNING_ON_DIALOG_BOX = By.xpath("//div[@class='swal2-icon swal2-warning swal2-icon-show']");
    public static final By TASK_AREYOUSURE_ON_DIALOG_BOX = By.cssSelector(".swal2-title");
    public static final By TASK_DOYOUWANTTODELETE_ON_DIALOG_BOX = By.cssSelector(".swal2-html-container");
    public static final By TASK_YES_DELETE_BUTTON = By.cssSelector(".swal2-confirm");

    public static final By TASK_DELETED_POPUP_WINDOW = By.cssSelector(".swal2-popup");
    public static final By TASK_DELETED_CHECKLIST = By.cssSelector(".swal2-success-ring");
    public static final By TASK_SUCCESSFULLY_DELETED = By.cssSelector(".swal2-html-container");
    public static final By TASK_DELETED_OK_BUTTON =By.cssSelector(".swal2-confirm");


    }


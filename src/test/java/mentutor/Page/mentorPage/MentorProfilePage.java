package mentutor.Page.mentorPage;

import org.openqa.selenium.By;

public class MentorProfilePage {

    //PROFILE PAGE
    public static final By MENTOR_PAGE = By.xpath("//div[@class='pb-9 flex flex-col items-center']");
    public static final By PROFILE_ICON = By.id("nav-profile");
    public static final By EDIT_ICON = By.cssSelector("[d='M880 836H144c-17.7 0-32 14.3-32 32v36c0 4.4 3.6 8 8 8h784c4.4 0 8-3.6 8-8v-36c0-17.7-14.3-32-32-32zm-622.3-84c2 0 4-.2 6-.5L431.9 722c2-.4 3.9-1.3 5.3-2.8l423.9-423.9a9.96 9.96 0 0 0 0-14.1L694.9 114.9c-1.9-1.9-4.4-2.9-7.1-2.9s-5.2 1-7.1 2.9L256.8 538.8c-1.5 1.5-2.4 3.3-2.8 5.3l-29.5 168.2a33.5 33.5 0 0 0 9.4 29.8c6.6 6.4 14.9 9.9 23.8 9.9z']");
    public static final By PROFILE_NAME = By.cssSelector("h3:nth-of-type(1)");
    public static final By PROFILENAME_ROLE = By.cssSelector("h3:nth-of-type(2)");
    public static final By PROFILE_CLASS = By.cssSelector("h3:nth-of-type(3)");
    public static final By PROFILE_EDIT = By.xpath("//div[@class='modal-box w-11/12 max-w-3xl bg-card']");
    public static final By EDIT_NAME = By.id(("input-fullname"));
    public static final By EDIT_EMAIL = By.id("input-email");
    public static final By EDIT_PASSWORD = By.id("input-password");
    public static final By PROFILE_SUBMIT_BUTTON = By.id("btn-submitMentee");
    public static final By UPLOAD_BUTTON = By.id(("btn-upload-gbr"));
    public static final By IMAGE_PROFILE = By.xpath("//div[@class='flex flex-col lg:flex-row  justify-center items-center sm:flex-auto']/img[@src='/assets/toys-3.5453ac10.png']");
    public static final By HEADER_PROFILE = By.xpath("//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']");


}

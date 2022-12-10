package mentutor.Page.mentorPage;

import org.openqa.selenium.By;

public class MentorForumPage {

    //FORUM PAGE

    public static final By FORUM_ICON = By.cssSelector("[d='M349.1 334.7c-11.2-4-29.5-4.2-37.6-7.3-5.6-2.2-14.5-4.6-17.4-8.1-2.9-3.5-2.9-28.5-2.9-28.5s7-6.6 9.9-14c2.9-7.3 4.8-27.5 4.8-27.5s6.6 2.8 9.2-10.4c2.2-11.4 6.4-17.4 5.3-25.8-1.2-8.4-5.8-6.4-5.8-6.4s5.8-8.5 5.8-37.4c0-29.8-22.5-59.1-64.6-59.1-42 0-64.7 29.4-64.7 59.1 0 28.9 5.7 37.4 5.7 37.4s-4.7-2-5.8 6.4c-1.2 8.4 3 14.4 5.3 25.8 2.6 13.3 9.2 10.4 9.2 10.4s1.9 20.1 4.8 27.5c2.9 7.4 9.9 14 9.9 14s0 25-2.9 28.5-11.8 5.9-17.4 8c-8 3.1-26.3 3.5-37.6 7.5-11.2 4-45.8 22.2-45.8 67.2h278.3c.1-45.1-34.5-63.3-45.7-67.3z']");
    public static final By HEADER_FORUM = By.xpath("//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']");
    public static final By CARD_FORUM = By.xpath("//div[.='Jalan Ahmad Lutfi acbdeMenteeBelajar yuu!!Load More CommentsHide']");
    public static final By TITLE_CARD_FORUM = By.xpath("//h1[.='Jalan Ahmad Lutfi acbde']");
    public static final By COMMENT_FIELD = By.id("Input-comment");
    public static final By SHOWCOMMNET_BUTTON = By.id("btn-showcomments");
    public static final By HIDE_BUTTON = By.id("btn-hidecomments");
    public static final By FORUM_SUBMIT_BUTTON = By.id("btn-sendComment");
    public static final By FORUM_CARD1 = By.cssSelector(".space-y-6 > div:nth-of-type(1)");
    public static final By FORUM_CARD2 = By.cssSelector(".space-y-6 > div:nth-of-type(2)");
    public static final By FORUM_CARD3 = By.cssSelector(".space-y-6 > div:nth-of-type(3)");
    public static final By IMAGE_PROFILE_CARD =By.xpath("//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[1]//img[@src='/assets/toys-2.1898dd97.png']");
    public static final By NAME_ROLE_FORUMCARD = By.xpath("//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[1]//p[@class='text-abu font-normal text-xs']");
    public static final By DESCRIPTION_TITLE_FORUM = By.xpath("//p[@class='text-abu font-light text-[8px] md:text-sm']");
    public static final By NAME_FORUM =By.xpath("//h3[.='Forum']");
    public static final By CONTENT_COMMENT = By.cssSelector(".space-y-6 > div:nth-of-type(1) > .text-abu");

}

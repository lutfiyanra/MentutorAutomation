package step_definitions;//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import mentutor.model.PageNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static net.serenitybdd.core.Serenity.getDriver;

public class Hooks {

//    public static WebDriver webDriver;
    @Before
    public void openBrowser(){
//        System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        webDriver= new ChromeDriver();
//        webDriver.get(PageNavigation.LOGIN_URL);
//        webDriver.manage().window().maximize();
    }
//    @After
    public void closeBrowser(){
        getDriver().close();
        getDriver().quit();
    }
}

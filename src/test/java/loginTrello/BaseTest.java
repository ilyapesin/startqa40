package loginTrello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    static WebDriver wd;
    @BeforeSuite(alwaysRun = true)
    public void precondition(){
        wd=new ChromeDriver();
        wd.navigate().to("https://trello.com/home");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }
    @AfterSuite
    public void postcondition(){
        wd.quit();
    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }
    public void type(By locator, String text) {

        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

    }
}

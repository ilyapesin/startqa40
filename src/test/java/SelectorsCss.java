import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectorsCss {

    WebDriver wd;
    @BeforeClass
    public void precondition(){
        wd=new ChromeDriver();
        wd.navigate().to("https://demoqa.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterClass
    public void postcondition(){

        wd.quit();
    }
    @Test
    public void cssTest(){
        wd.findElement(By.cssSelector("h5"));
        wd.findElement(By.cssSelector(".card-body"));
        wd.findElement(By.cssSelector("#close-fixedban"));
        wd.findElement(By.className("card-body"));
    }
}

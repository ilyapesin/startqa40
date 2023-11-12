import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathLesson {
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
    public void xpathTest(){
        System.out.println(wd.findElement(By.xpath("//div/h5")).getText());
        System.out.println(wd.findElement(By.xpath("//*[text()='Elements']")).getText());
        System.out.println(wd.findElement(By.xpath("//*[contains(text(),'ements')]")).getText());
        System.out.println(wd.findElement(By.xpath("//*[contains(text(),'ements') and contains(text(),'El')]")).getText());
        System.out.println(wd.findElement(By.xpath("//div[@class='card-body']/h5")).getText());
        System.out.println(wd.findElement(By.xpath("//div[contains(@class,'body')]/h5")).getText());
        System.out.println(wd.findElement(By.xpath("//div[@class]/h5")).getText());
        System.out.println(wd.findElement(By.xpath("//h5/../h5")).getText());
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstTest {
    @Test

    public void openGoogleTest(){
        WebDriver wd=new ChromeDriver();
        wd.navigate().to("https://demoqa.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> list=wd.findElements(By.xpath("//h5"));
        for(WebElement el:list)
        {
            System.out.println(el.getText());
        }
        wd.quit();
    }
}

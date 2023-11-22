package loginTrello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        click(By.xpath("//a[contains(@data-uuid, 'login')]"));
        type(By.xpath("//input[@id='username']"), "pesinilya@gmail.com");
        click(By.xpath("//button[@id='login-submit']"));
        type(By.xpath("//*[@id='password']"), "Vp12345$");
        click(By.xpath("//button[@id='login-submit']"));
        String boardText = wd.findElement(By.xpath("//span[text()='Boards']")).getText();
        Assert.assertEquals(boardText, "Boards", "text not Boards");

    }
}

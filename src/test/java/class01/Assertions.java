package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assertions {
    /*
    ------test 1 -------
    got to hrms -> enter user name Admin -> enter no password
    -> verify that the message is "Password can not be empty"
     */
    public static WebDriver driver;
    @BeforeMethod
    public  void OpenAndLaunchBrowser(){

        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
    @Test
    public void VerifyPasswordError(){
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();

        // get the text
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String actualErrorMsg = errorMsg.getText();
        String expectedErrorMsg = "Password cannot be empty";
        Assert.assertEquals(actualErrorMsg,expectedErrorMsg);

        // verify that password text box is displayed
        

    }
}

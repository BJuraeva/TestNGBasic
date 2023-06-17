package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssertion {
    /*
    1. got to  HRMS
    2. enter username
    3. enter wrong password
    4. click on login
    5. verify that the error message Invalid credentials is displayed
    6.also confirm that the error massage is Displayed
     */


    public static WebDriver driver;
    // I will put in pre-condition for my test case in the Before Method
    @BeforeMethod(alwaysRun = true)
    public  void openBrotherAndNavigate(){
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    // post condition
    @AfterMethod (alwaysRun = true)
    public void closeBrowser(){
        //driver.quit();
    }
    // test case 1
    @Test(groups = "smoke")
    public void verifyTheError(){
        // send user name
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");

        // send password
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("abracadabra");

        // click on login
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();

        // get the error message
        WebElement errorMsg = driver.findElement(By.id("spanMessage"));

        String  actualErrorMsg = errorMsg.getText();
        String expectedErrorMsg = "Invalid credentials";

        // comparing two String, which assertion to use
        Assert.assertEquals(actualErrorMsg,expectedErrorMsg);
        System.out.println("Check that assert number 2 is running or not?");

        // check if error msg is displayed or not
        boolean errorMsgIsDisplayed = errorMsg.isDisplayed();
        Assert.assertTrue(errorMsgIsDisplayed);

    }
}

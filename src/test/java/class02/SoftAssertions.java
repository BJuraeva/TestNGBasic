package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.CommonMethods;

import java.time.Duration;
//    precondition

//    login into the syntax HRMS APP
//    verify that the Welcome message is displayed
//    verify that the message is  "Welcome Admin"
public class SoftAssertions extends CommonMethods {

    @BeforeMethod (alwaysRun = true)
    public void OpenBrowserAndNavigate(){
        openBrowserAndNavigateToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");
    }

    // post conditions
    @AfterMethod(alwaysRun = true)
    public void quitBrowser(){
        // driver.quit();
    }

    @Test (groups = "regression") // in order to run @before/@after method we need tu put (alwaysRun = true)
    public void verifyTheWelcomeMessage(){

        // send username
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");

        // send password
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        // click login
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        // get the mesaage
        WebElement welcomeMsg = driver.findElement(By.id("welcome"));

        // verify is displayed
        boolean isDisplayed = welcomeMsg.isDisplayed();
        SoftAssert soft= new SoftAssert();
        // isDisplayed=false; // soft assert will fail
        soft.assertTrue(isDisplayed);

        // verify the message is welcome admin
        String actualWelcomeText = welcomeMsg.getText();
        String expectedWelcomeText="Welcome Admin";
        soft.assertEquals(actualWelcomeText,expectedWelcomeText);

        // assert all the assertions that have been made
        soft.assertAll();

    }
}

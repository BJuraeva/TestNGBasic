package review;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class annotation3 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before TEST");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after TEST");
    }
}

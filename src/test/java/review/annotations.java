package review;

import org.testng.annotations.*;

public class annotations {
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass (){
        System.out.println("I am after class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod (){
        System.out.println("I am after method");
    }
    @Test
    public void testA(){
        System.out.println("I am test A");
    }
    @Test
    public void testB(){
        System.out.println("I am test B");
    }
}

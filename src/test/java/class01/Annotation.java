package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
    // we do not need main method in here
    @Test
    public void afirstTestCase(){
        System.out.println("First test case");
    }
    @Test
    public void bSecondTestCase(){
        System.out.println("Second test case");
    }
    @Test
    public void cThirdTestCase(){
        System.out.println("Third test case");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
}
/*
output:I am before method
Hello I am the first test case
I am after method
I am before method
I am the second second test case
I am after method
I am before method
I am the third test case
I am after method
 */

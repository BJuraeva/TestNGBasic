package review;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions {
    @Test
    public void hardAssert (){
        // i am getting this info from the WebElement on a Website
        String actualName = "Barno";
        String actualDesignation = "softwareEngineer";

        Assert.assertEquals(actualName,"Barno");
        System.out.println("Hello I am here");
        Assert.assertEquals(actualDesignation,"softwareEngineer");

        // verify that they are correct but never use if condition whenever testing will show incorrect
        /*if (actualName.equals("Barno")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }*/
    }
    @Test
    public void softAssert () {
        // i am getting this info from the WebElement on a Website
        String actualName = "Barnojon";
        String actualDesignation = "softwareEngineer";

        // declare the instance
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualName,"Barno");
        System.out.println("hello i am here");
        soft.assertEquals(actualDesignation,"softwareEngineer");
        soft.assertAll();
    }
}

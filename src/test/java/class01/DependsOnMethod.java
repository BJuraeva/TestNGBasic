package class01;

import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void Login(){
        //System.out.println(10/0); // will fail
        System.out.println("I am testing login page");
    }
    @Test(dependsOnMethods = {"Login"}) // depend to the first method
    public void TestTheDashBoardPage(){
        System.out.println("I am testing dashboard page");
    }
}

package review;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false) // if (enabled = true)-> the code will be executed
    public void hello(){
        System.out.println("helloooooooooooooo");
    }
    @Test
    public void funcA(){
        System.out.println((5+6)); // passed if we put 10/0 => not execute
    }
    @Test(dependsOnMethods = "funcA")
    public void funcB(){
        System.out.println("I am depend on funcA");
    }
}

package class01;

import org.testng.annotations.Test;

public class EnableDisable {
    @Test(enabled = false) // test is not run
    public void Atest(){
        System.out.println("i am test A");
    }
    @Test // by default this test is enabled =true
    public void Btest(){
        System.out.println("i am test B");
    }
    @Test (enabled = false)
    public void Ctest(){
        System.out.println("i am test C");
    }
}

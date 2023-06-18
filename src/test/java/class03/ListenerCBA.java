package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerCBA implements ITestListener {
    /*
    ----------Task 2 ------------
    link the listener implementation to the class01
    Priority, EnableDisable
     */
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("SUCCESS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("FAIL");
    }
}

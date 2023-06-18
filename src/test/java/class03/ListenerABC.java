package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerABC implements ITestListener {
    /*
    ------ Task 1 -----------
    implement 2 method
    1. to be executed whenever the testcase passes (logic should be written to print message SUCCESS on screen)
    2. to be executed whenever the testcase failed (logic should be written to print message FAIL on screen)
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

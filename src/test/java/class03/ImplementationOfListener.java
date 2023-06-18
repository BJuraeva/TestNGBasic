package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementationOfListener implements ITestListener {
    @Override
    public void  onTestSuccess(ITestResult result) {
        System.out.println("Test case passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case failed");
    }


}

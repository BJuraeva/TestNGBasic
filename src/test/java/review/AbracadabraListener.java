package review;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class AbracadabraListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("test success "+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("test failed "+result.getName());
    }
}

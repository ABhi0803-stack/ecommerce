package Mainproject.Testcomponents;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  // Replace with your actual WebDriver initialization
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;

public class TestListener implements ITestListener {

    private WebDriver driver = new ChromeDriver(); // Initialize your WebDriver (replace with your setup)
    private ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        // Start a new test in Extent Report
        test = ExtentReportManager.createInstance().createTest(result.getName());
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test Failed");
        String screenshotPath = takeScreenshot(result.getName());
        test.addScreenCaptureFromPath(screenshotPath);  // Attach screenshot to the report
        System.out.println("Test Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test Skipped");
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Execution Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Flush the reports after test execution
        ExtentReportManager.flushReports();
        System.out.println("Test Execution Finished: " + context.getName());
    }

    private String takeScreenshot(String testName) {
        // Capture screenshot and save it to the specified location
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "./screenshots/" + testName + ".png";
        
        try {
            // Save the screenshot in the "screenshots" folder or any other desired location
            FileUtils.copyFile(screenshot, new File(screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return screenshotPath;
    }
}

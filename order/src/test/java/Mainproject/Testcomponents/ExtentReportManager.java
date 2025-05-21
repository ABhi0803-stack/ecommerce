package Mainproject.Testcomponents;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;  // Spark Reporter

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        if (extent == null) {
            // Specify the path of the report
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./extent-spark-report.html");
            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);  // Attaching Spark Reporter
        }
        return extent;
    }

    public static void flushReports() {
        if (extent != null) {
            extent.flush();  // Write the results to the report
        }
    }
}

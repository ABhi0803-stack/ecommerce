package Mainproject.Testcomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseTest {

    public WebDriver driver;
    String browser = "chrome";  // Hardcoded browser type

    @BeforeClass
    public void setUp() { 
        System.out.println("Test Execution Started");

        // Initialize the browser based on the hardcoded value
        launchApp(browser);
    }

    public void launchApp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();  // Directly initialize ChromeDriver
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();  // Directly initialize EdgeDriver
        } else {
            System.out.println("Unsupported browser: " + browser);
        }

        // Add a check for null driver initialization
        if (driver == null) {
            System.out.println("Driver not initialized properly.");
        } else {
            System.out.println("Driver initialized successfully.");
        }
    }

    @AfterClass
    public void cleanUp() {
        if (driver != null) {
            driver.quit();  // Close the browser and quit the WebDriver session
        }
        System.out.println("Test Execution Finished");
    }
    
    // Method to get the driver instance
    public WebDriver getDriver() {
        return driver;
    }
}

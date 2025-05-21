package bases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest{

	protected WebDriver driver;
    protected String baseUrl = "https://automationexercise.com/login";

    @BeforeClass
    public void setUp() {
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
<<<<<<< HEAD
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
=======
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
>>>>>>> 8cb7b80429f12b509a6d81fd6d4b7cd0869b1368
        driver.get(baseUrl);
    }
   

    
}

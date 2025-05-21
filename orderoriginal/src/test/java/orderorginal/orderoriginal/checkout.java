package orderorginal.orderoriginal;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class checkout {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		String email = "abhis1406@gmail.com";
		String password = "Abhi@1998";

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://buyer-app-preprod-v2.ondc.org/login");
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("button_btn_back__bqoNg")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.MuiBox-root.css-ayc40e\r\n")));
		WebElement element = driver.findElement(By.xpath("//*[text()='560102']"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//*[text()='Cart']"));
		element1.click();

		driver.findElement(By.xpath("//button[text()='Checkout']")).click();

		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//button[contains(@class, 'MuiButton-root') and contains(@class, 'MuiButton-contained') and text()='Continue']"))
				.click();
		Actions actions = new Actions(driver);
		By elementLocator1 = By.xpath("//div[@class='jss189']");
		By elementLocator3 = By.xpath(
				"//button[contains(@class, 'MuiButton-root') and contains(@class, 'MuiButton-contained') and contains(@class, 'MuiButton-containedPrimary') and text()='Proceed to Buy']");
		actions.moveToElement(driver.findElement(elementLocator1)).perform();
		driver.findElement(By.xpath("//div[text()='My billing and shipping address are the same']")).click();
		driver.findElement(By.cssSelector("svg[width='356']")).click();
		actions.moveToElement(driver.findElement(elementLocator3)).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Proceed to Buy']")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement iframe = wait2.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='razorpay-checkout-frame']")));

		driver.switchTo().frame(iframe);

		WebElement paymenttype = driver.findElement(By.xpath("//div[@data-value='netbanking']"));
		paymenttype.click();
			WebElement bankselect = driver.findElement(By.xpath("//div[@data-value='CNRB']"));
			bankselect.click();
			String mainWindowHandle = driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			allWindowHandles.remove(mainWindowHandle);
			String newWindowHandle = allWindowHandles.iterator().next();
			driver.switchTo().window(newWindowHandle);
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
			By succes = By.xpath("//button[@class='success']");
			wait3.until(ExpectedConditions.elementToBeClickable(succes));
			WebElement elementInNewWindow = driver.findElement(By.xpath("//button[@class='success']"));
			elementInNewWindow.click();
			driver.switchTo().window(mainWindowHandle);			
			WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
			By orderpage = By.xpath("//div[@class='MuiGrid-root MuiGrid-container jss209 css-1d3bbye']");
			wait4.until(ExpectedConditions.elementToBeClickable(orderpage));
			driver.findElement(By.xpath("//button[text()='View summary']")).click();
			driver.quit();
			// Thread.sleep(2000);
			// JavascriptExecutor js = (JavascriptExecutor) driver;

			// js.executeScript("document.body.style.zoom='60%'");
			// Thread.sleep(2000);
			// By forscreen = By.xpath("//span[text()='Order Total']");
			// actions.moveToElement(driver.findElement(forscreen)).perform();

			// takeScreenshot(driver, "main_window_screenshot.png");

		}

	}

//	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {

	// TakesScreenshot screenshot = (TakesScreenshot) driver;

	// File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

	// File destinationFile = new File(fileName);
	// Files.copy(sourceFile, destinationFile);

	// System.out.println("Screenshot saved as: " +
	// destinationFile.getAbsolutePath());
	// }


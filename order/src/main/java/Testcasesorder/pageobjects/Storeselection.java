package Testcasesorder.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orderflow.Absractcomponents.Abstractdata;

public class Storeselection extends Abstractdata {

	WebDriver driver;

	public Storeselection(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void scrollapage() {

		int scrollPosition = 500;
		int maxScrollPosition = 5500;
		int increment = 500;

		while (scrollPosition <= maxScrollPosition) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"document.querySelector('.globalStyles_background__iRmc6').scrollTop = " + scrollPosition + ";");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			scrollPosition += increment;
		}
	}

	@FindBy(xpath = "//div[@class='jss110']/div[@class='MuiTypography-root MuiTypography-body jss113 css-1ti4s1m']")
	List<WebElement> storelist;

	public void selectstore(String sname) throws InterruptedException {
		for (WebElement fullstore : storelist) {
			// System.out.println(fullstore.getText().trim());
			String abhi = fullstore.getText().trim();
			if (abhi.contains(sname)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement element = driver.findElement(By
						.xpath("//div[contains(@class, 'MuiTypography-root') and contains(text(), '" + sname + "')]"));
				js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", element);
				By storeby = By
						.xpath("//div[contains(@class, 'MuiTypography-root') and contains(text(), '" + sname + "')]");
				waitforelementtovisible(storeby);
				Thread.sleep(1000);
				By storeclick = By.xpath("//div[@class='jss110']//div[text()='" + sname + "']");
				driver.findElement(storeclick).click();
				break;
			}

		}

	}

}

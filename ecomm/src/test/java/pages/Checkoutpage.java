package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkoutpage {

    private WebDriver driver;

    // Constructor
    public Checkoutpage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By proceedToCheckoutBtn = By.xpath("//a[normalize-space()='Proceed To Checkout']");
    private By placeOrderBtn = By.linkText("Place Order");

    // Action Method
    public void placeOrder() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click on Proceed To Checkout
        WebElement proceedCheckout = wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtn));
        proceedCheckout.click();

        // Wait for Place Order to be visible
        WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrderBtn));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrder);

        // Optional small wait to stabilize scrolling
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on Place Order
        placeOrder.click();
    }
}

package store.demoqa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class emptyCartMsg {

	public static void main(String[] args) throws InterruptedException {
		// Create Firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
						
		// Open store.demoqa.com
		driver.get("http://store.demoqa.com/");
		
		// Add item to cart
		// Find iPhone
		driver.findElement(By.name("s")).sendKeys("iPhone 4s 16GB");
		driver.findElement(By.name("s")).sendKeys(Keys.RETURN);
		
		// Add iPhone to Cart
		driver.findElement(By.linkText("Apple iPhone 4S 16GB SIM-Free – Black")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fancy_notification")).findElement(By.className("go_to_checkout")).click();
		
		
		// Empty Cart
		driver.findElement(By.className("wpsc_product_remove")).findElement(By.name("submit")).click();
		
		
		// Verify message
		String emptyCartMessage = driver.findElement(By.className("entry-content")).getText();
		Object messageIsCorrect = emptyCartMessage.contains("Oops, there is nothing in your cart.");
		System.out.println(messageIsCorrect);
		
		// Close browser
		driver.close();		

	}

}

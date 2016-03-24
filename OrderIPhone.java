package store.demoqa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderIPhone {

	public static void main(String[] args) throws InterruptedException {

		// Create Firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		// Open store.demoqa.com
		driver.get("http://store.demoqa.com/");
		
		// Find iPhone
		driver.findElement(By.name("s")).sendKeys("iPhone 4s 16GB");
		driver.findElement(By.name("s")).sendKeys(Keys.RETURN);
		
		// Add iPhone to Cart
		driver.findElement(By.linkText("Apple iPhone 4S 16GB SIM-Free – Black")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fancy_notification")).findElement(By.className("go_to_checkout")).click();
		
		// Checkout
		driver.findElement(By.className("step2")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("current_country")).sendKeys("USA");
		driver.findElement(By.name("collected_data[15]")).sendKeys("TX");
		driver.findElement(By.name("wpsc_submit_zipcode")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("wpsc_checkout_form_9")).sendKeys("sjbeachler@hotmail.com");
		driver.findElement(By.id("wpsc_checkout_form_2")).sendKeys("Steven");
		driver.findElement(By.id("wpsc_checkout_form_3")).sendKeys("Beachler");
		driver.findElement(By.id("wpsc_checkout_form_4")).sendKeys("11800 Domain Blvd #300");
		driver.findElement(By.id("wpsc_checkout_form_5")).sendKeys("Austin");
		driver.findElement(By.id("wpsc_checkout_form_6")).sendKeys("TX");		
		driver.findElement(By.id("wpsc_checkout_form_7")).sendKeys("USA");
		driver.findElement(By.id("wpsc_checkout_form_8")).sendKeys("78758");
		driver.findElement(By.id("wpsc_checkout_form_18")).sendKeys("512-297-1977");
		driver.findElement(By.id("shippingSameBilling")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("wpsc_make_purchase")).click();
		Thread.sleep(5000); 
		
		// Verify Price
		String resultText = driver.findElement(By.className("wpsc-transaction-results-wrap")).getText();
		Object priceIsRight = resultText.contains("Total: $282.00");
		System.out.println(priceIsRight);
		
		// Close browser
		driver.close();
	}

}

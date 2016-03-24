package store.demoqa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyInfoUpdate {

	public static void main(String[] args) throws InterruptedException {
		
		String nicknameOne = "sjbeachler";
		String nicknameTwo = "stevenjb";
		
		// Create Firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
				
		// Open store.demoqa.com
		driver.get("http://store.demoqa.com/");
				
		// Log In
		driver.findElement(By.id("account")).click();
		driver.findElement(By.id("log")).clear();
		driver.findElement(By.id("log")).sendKeys("sjbeachler");
		driver.findElement(By.id("pwd")).clear();
		driver.findElement(By.id("pwd")).sendKeys("i#lX7NXrOxW3c9fs");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("wp-admin-bar-my-account")).click();
		
		// Read Info
		String originalNickname = driver.findElement(By.id("nickname")).getAttribute("value");
		//System.out.println(originalNickname);
		
		// Update and Save Info
		driver.findElement(By.id("nickname")).clear();
		
		String newNickname;
		if (originalNickname.equals(nicknameOne))
		{
			newNickname = nicknameTwo;
		}
		
		else
		{	
			newNickname = nicknameOne;
		}
		
		driver.findElement(By.id("nickname")).sendKeys(newNickname);
		driver.findElement(By.id("submit")).click();
		
		// Logout
		driver.get("http://store.demoqa.com/tools-qa/?action=logout");
		driver.findElement(By.linkText("log out")).click();
		
		// Open store.demoqa.com
		driver.get("http://store.demoqa.com/");
		
		// Login
		driver.findElement(By.id("account")).click();
		driver.findElement(By.id("log")).clear();
		driver.findElement(By.id("log")).sendKeys("sjbeachler");
		driver.findElement(By.id("pwd")).clear();
		driver.findElement(By.id("pwd")).sendKeys("i#lX7NXrOxW3c9fs");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("wp-admin-bar-my-account")).click();
		Thread.sleep(2000);
		
		// Verify Updated Info
		String currentNickname = driver.findElement(By.id("nickname")).getAttribute("value");
		//System.out.println(currentNickname);
		
		Object isNicknameUpdated = currentNickname.equals(newNickname);
		System.out.println(isNicknameUpdated);
		
		// Close browser
		driver.close();
		
	}

}

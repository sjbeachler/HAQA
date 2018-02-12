/**
 * Page Object encapsulates the Home Page
 */
package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
 public class AccountPage {
 
    private static WebElement element = null;
 
 public static WebElement editProfileLink(WebDriver driver){
 
 //   element = driver.findElement(By.id("wp-admin-bar-my-account"));
	 
	element = driver.findElement(By.xpath("//*[text()[contains(.,'Edit My Profile')]]"));
    
    return element;
 
    }
 
 public static void hoverOverProfile(WebDriver driver) {
	  
	 Actions action = new Actions(driver);
	  
	 element = driver.findElement(By.id("wp-admin-bar-my-account"));
	 action.moveToElement(element).perform();
//	 element.click();
	}
 
 public static WebElement myProfile(WebDriver driver){
	 
 //   element = driver.findElement(By.id("wp-admin-bar-my-account"));
	 
	element = driver.findElement(By.className("ab-item"));
    
    return element;
 
    }
 
 }


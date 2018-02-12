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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
 public class HomePage {
 
    private static WebElement element = null;
 
 public static WebElement searchBox(WebDriver driver){
 
    element = driver.findElement(By.className("search"));
 
    return element;
 
    }
 
 public static WebElement myAccountButton(WebDriver driver){
	 
	    element = driver.findElement(By.className("account_icon"));
	 
	    return element;
	 
	    }
 
 
}


/**
 * Page Object encapsulates the Home Page
 */
package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
 public class ItemPage {
 
    private static WebElement element = null;
 
 public static WebElement goToCartButton(WebDriver driver){
 
    element = driver.findElement(By.xpath("//*[@title='Checkout']"));
 
    return element;
 
    }
 
 public static WebElement addToCartButton(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@name='Buy']"));
	 
	    return element;
	 
	    }
 
}


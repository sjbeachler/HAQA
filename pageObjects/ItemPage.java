/**
 * Page Object encapsulates the Home Page
 */
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 
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


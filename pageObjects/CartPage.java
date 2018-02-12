/**
 * Page Object encapsulates the Home Page
 */
package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 
 public class CartPage {
 
    private static WebElement element = null;
 
 public static WebElement continueButton(WebDriver driver){
 
    element = driver.findElement(By.className("step2"));
 
    return element;
 
    }
 
 public static List<WebElement> lineItems(WebDriver driver){
	 
	    List<WebElement> elements = driver.findElements(By.className("product_row"));
	    System.out.println("size " + elements.size());
	    return elements;
	 
	    }

public static WebElement removeFromCartButton(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//input[@value='Remove' and @type='submit']"));
	  
	    return element;
	 
	    }

public static String cartEmptyMessage(WebDriver driver){
	
	String emptyCartMessage = driver.findElement(By.className("entry-content")).getText();
		
	System.out.println(emptyCartMessage);
    return emptyCartMessage;
 
    }

}


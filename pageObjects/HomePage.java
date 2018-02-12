
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
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


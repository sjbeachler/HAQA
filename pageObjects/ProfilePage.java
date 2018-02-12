
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


 
 public class ProfilePage {
 
    private static WebElement element = null;
 
 public static WebElement adminColorScheme(WebDriver driver){
 
    element = driver.findElement(By.id("color-picker"));
 
    return element;
 
    }
 
 public static WebElement toolbarBox(WebDriver driver){
	 
	    element = driver.findElement(By.id("admin_bar_front"));
	 
	    return element;
	 
	    }
 
 public static WebElement firstNameField(WebDriver driver){
	 
	    element = driver.findElement(By.id("first_name"));
	 
	    return element;
	 
	    }
 
 public static WebElement lastNameField(WebDriver driver){
	 
	    element = driver.findElement(By.id("last_name"));
	 
	    return element;
	 
	    }
 
 public static WebElement nicknameField(WebDriver driver){
	 
	    element = driver.findElement(By.id("nickname"));
	 
	    return element;
	 
	    }
 
 public static WebElement publicNameField(WebDriver driver){
	 
	    element = driver.findElement(By.id("display_name"));
	 
	    return element;
	 
	    }
 
 public static WebElement emailField(WebDriver driver){
	 
	    element = driver.findElement(By.id("email"));
	 
	    return element;
	 
	    }
 
 public static WebElement websiteField(WebDriver driver){
	 
	    element = driver.findElement(By.id("url"));
	 
	    return element;
	 
	    }
 
 public static WebElement bioInfoField(WebDriver driver){
	 
	    element = driver.findElement(By.id("description"));
	 
	    return element;
	 
	    }
 
 public static WebElement updateProfileButton(WebDriver driver){
	 
	    element = driver.findElement(By.id("submit"));
	 
	    return element;
	 
	    }
 
 public static WebElement logoutLink(WebDriver driver){
	 
	    element = driver.findElement(By.id("wp-admin-bar-logout"));
	 
	    return element;
	 
	    }
 
 public static void hoverOverProfile(WebDriver driver) {
	  
	 Actions action = new Actions(driver);
	  
	 element = driver.findElement(By.id("wp-admin-bar-my-account"));
	 action.moveToElement(element).perform();
	}
 
 
}


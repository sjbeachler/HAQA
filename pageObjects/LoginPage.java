
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


 
 public class LoginPage {
 
    private static WebElement element = null;
 
 public static WebElement usernameField(WebDriver driver){
 
    element = driver.findElement(By.id("log"));
 
    return element;
 
    }
 
 public static WebElement passwordField(WebDriver driver){
	 
	    element = driver.findElement(By.id("pwd"));
	 
	    return element;
	 
	    }
 
 public static WebElement rememberMeBox(WebDriver driver){
	 
	    element = driver.findElement(By.id("rememberme"));
	 
	    return element;
	 
	    }
 
 public static WebElement loginButton(WebDriver driver){
	 
	    element = driver.findElement(By.id("login"));
	 
	    return element;
	 
	    }
 
 
}


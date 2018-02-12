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


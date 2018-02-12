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

 
 public class CheckoutPage {
 
    private static WebElement element = null;
 
	
 public static WebElement currentCountryField(WebDriver driver){
 
    element = driver.findElement(By.id("current_country"));
 
    return element;
 
    }
 
 public static WebElement stateField(WebDriver driver){
	 
	    element = driver.findElement(By.name("collected_data[15]"));
	 
	    return element;
	 
	    }
 
 public static WebElement zipcodeField(WebDriver driver){
	 
	    element = driver.findElement(By.name("wpsc_submit_zipcode"));
	 
	    return element;
	 
	    }
 
 public static WebElement emailField(WebDriver driver){
	 
	    element = driver.findElement(By.id("wpsc_checkout_form_9"));
	 
	    return element;
	 
	    }
 
 public static WebElement firstNameField(WebDriver driver){
	 
	    element = driver.findElement(By.id("wpsc_checkout_form_2"));
	 
	    return element;
	 
	    }
 
 public static WebElement lastNameField(WebDriver driver){
	 
	    element = driver.findElement(By.id("wpsc_checkout_form_3"));
	 
	    return element;
	 
	    }
 
 public static WebElement streetAddressField(WebDriver driver){
	 
	    element = driver.findElement(By.id("wpsc_checkout_form_4"));
	 
	    return element;
	 
	    }
 
 public static WebElement cityField(WebDriver driver){
	 
	    element = driver.findElement(By.id("wpsc_checkout_form_5"));
	 
	    return element;
	 
	    }
 
 public static WebElement stateAbbreviationField(WebDriver driver){
	 
	    element = driver.findElement(By.id("wpsc_checkout_form_6"));
	 
	    return element;
	 
	    }
 
 public static WebElement countryField(WebDriver driver){
	 
	    element = driver.findElement(By.id("wpsc_checkout_form_7"));
	 
	    return element;
	 
	    }
 
 public static WebElement zipField(WebDriver driver){
	 
	    element = driver.findElement(By.id("wpsc_checkout_form_8"));
	 
	    return element;
	 
	    }
 
 public static WebElement phoneNumberField(WebDriver driver){
	 
	    element = driver.findElement(By.id("wpsc_checkout_form_18"));
	 
	    return element;
	 
	    }
 
 public static WebElement shippingSameButton(WebDriver driver){
	 
	    element = driver.findElement(By.id("shippingSameBilling"));
	 
	    return element;
	 
	    }
 
 public static WebElement purchaseButton(WebDriver driver){
	 
	    element = driver.findElement(By.className("wpsc_make_purchase"));
	 
	    return element;
	 
	    }
 
 public static WebElement calculateShippingButton(WebDriver driver){
	 
	    element = driver.findElement(By.name("wpsc_submit_zipcode"));
	 
	    return element;
	 
	    }
}


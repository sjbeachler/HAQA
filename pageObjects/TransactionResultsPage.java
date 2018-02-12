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

 
 public class TransactionResultsPage {
 
    private static WebElement element = null;
 
 public static String totalText(WebDriver driver){
 
   	String resultText = driver.findElement(By.xpath("//*[text()[contains(.,'Total:')]]")).getText();
   	
    return resultText;
 
    }
 
}


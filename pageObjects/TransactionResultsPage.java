
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


 
 public class TransactionResultsPage {
 
    private static WebElement element = null;
 
 public static String totalText(WebDriver driver){
 
   	String resultText = driver.findElement(By.xpath("//*[text()[contains(.,'Total:')]]")).getText();
   	
    return resultText;
 
    }
 
}


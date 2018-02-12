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

 
 public class SearchResults {
 
    private static WebElement element = null;
 
 public static WebElement searchResultsPanel(WebDriver driver){
 
    element = driver.findElement(By.xpath("//*[@id=\"grid_view_products_page_container\"]/div")); 
 
    return element;
 
    }
 
 public static WebElement searchResultsItem(WebDriver driver){
	 
	    element = driver.findElement(By.className("product_grid_item")); 
	 
	    return element;
	 
	    }
 
 public static WebElement searchResultsItemDescription(WebDriver driver){
	 
	    element = driver.findElement(By.className("prodtitle")); 
	 
	    return element;
	 
	    }
 
 public static WebElement addCartButton(WebDriver driver){
	 
	    element = driver.findElement(By.className("wpsc_buy_button")); 
	 
	    return element;
	 
	    }
}


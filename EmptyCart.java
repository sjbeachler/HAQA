package store.demoqa.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
 
// Import package pageObject.*
 
import pageObjects.HomePage;
import pageObjects.SearchResults;
import pageObjects.ItemPage;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.TransactionResultsPage;
import pageObjects.LoginPage;
import pageObjects.ProfilePage;
import pageObjects.AccountPage;
 
public class EmptyCart {
 
private static WebDriver driver = null;
 
public static void main(String[] args) {
 
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://www.store.demoqa.com");

    HomePage.searchBox(driver).sendKeys("iPhone 4s");
	HomePage.searchBox(driver).sendKeys(Keys.RETURN);

	SearchResults.searchResultsItemDescription(driver).findElement(By.xpath("//a[@title='Apple iPhone 4S 16GB SIM-Free – Black']")).click();
	
	ItemPage.addToCartButton(driver).click();
	ItemPage.goToCartButton(driver).click();
	
/* Add second item to verify remove all works for multiple items

    HomePage.searchBox(driver).sendKeys("iPhone 5");
	HomePage.searchBox(driver).sendKeys(Keys.RETURN);

	searchResults.searchResultsItemDescription(driver).findElement(By.xpath("//a[@title='iPhone 5']")).click();
	
	ItemPage.addToCartButton(driver).click();
	ItemPage.goToCartButton(driver).click();

*/    
    

do	{
	   System.out.println("pass");
	   CartPage.removeFromCartButton(driver).click();
	} while (CartPage.lineItems(driver).size() > 0);
	
	Assert.assertEquals("Oops, there is nothing in your cart.", CartPage.cartEmptyMessage(driver));
	
    driver.quit();

	}

}
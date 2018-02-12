package store.demoqa.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
// Import package pageObject.*
 
import pageObjects.HomePage;
import pageObjects.SearchResults;
import pageObjects.ItemPage;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.TransactionResultsPage;
 
public class SubmitCart {
 
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
	
	CartPage.continueButton(driver).click();
	
	CheckoutPage.currentCountryField(driver).sendKeys("USA");
	CheckoutPage.calculateShippingButton(driver).click();
	CheckoutPage.emailField(driver).sendKeys("sjbeachler@hotmail.com");
	CheckoutPage.firstNameField(driver).sendKeys("Steven");
	CheckoutPage.lastNameField(driver).sendKeys("Beachler");
	CheckoutPage.streetAddressField(driver).sendKeys("11800 Domain Blvd #300");
	CheckoutPage.cityField(driver).sendKeys("Austin");
	CheckoutPage.zipField(driver).sendKeys("78758");
	CheckoutPage.countryField(driver).sendKeys("USA");
	CheckoutPage.phoneNumberField(driver).sendKeys("512-297-1977");
	CheckoutPage.stateAbbreviationField(driver).sendKeys("TX");
	CheckoutPage.shippingSameButton(driver).click();
	CheckoutPage.purchaseButton(driver).click();
	
	String totalText = TransactionResultsPage.totalText(driver);
	
	Assert.assertEquals("Total: $282.00", totalText.substring(totalText.length()-14));

    driver.quit();
 
     }
 
}
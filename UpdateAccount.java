package store.demoqa.tests;

import java.util.concurrent.TimeUnit;
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
 
public class UpdateAccount {
 
private static WebDriver driver = null;
 
public static void main(String[] args) {
 
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://www.store.demoqa.com");
	
    String nicknameOne = "sjbeachler";
	String nicknameTwo = "stevenjb";
	String newNickname;
	
    HomePage.myAccountButton(driver).click();
    
    LoginPage.usernameField(driver).sendKeys("sjbeachler");
    LoginPage.passwordField(driver).sendKeys("i#lX7NXrOxW3c9fs");
    LoginPage.loginButton(driver).click();
    
	AccountPage.hoverOverProfile(driver);
	AccountPage.editProfileLink(driver).click();
		
    String originalNickname = ProfilePage.nicknameField(driver).getAttribute("value");
    
	if (originalNickname.equals(nicknameOne))
		{
		newNickname = nicknameTwo;
		}
	
	else
		{	
		newNickname = nicknameOne;
		}
	
	System.out.println(newNickname);
	
	ProfilePage.nicknameField(driver).clear();
	ProfilePage.nicknameField(driver).sendKeys(newNickname);
	ProfilePage.updateProfileButton(driver).click();
	ProfilePage.hoverOverProfile(driver);
	ProfilePage.logoutLink(driver).click();

    driver.get("http://www.store.demoqa.com");
	
	
    HomePage.myAccountButton(driver).click();
    
    LoginPage.usernameField(driver).sendKeys("sjbeachler");
    LoginPage.passwordField(driver).sendKeys("i#lX7NXrOxW3c9fs");
    LoginPage.loginButton(driver).click();
    
	AccountPage.hoverOverProfile(driver);
	AccountPage.editProfileLink(driver).click();
	
	String currentNickname = ProfilePage.nicknameField(driver).getAttribute("value");
	System.out.println("current " + currentNickname + " new " + newNickname);
	
	Assert.assertEquals(currentNickname, newNickname);

    driver.quit();

	}

}
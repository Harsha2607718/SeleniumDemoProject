package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{

	@Test (priority=1,groups= {"regression"},retryAnalyzer=retry.Retry.class)
	public void verifyUserLoginWithValidCredentials() throws IOException {
		//String username="admin";
		//String password="admin";
		String user=ExcelUtility.readStringData(1, 0, "LoginPage");
		String pin=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);//to call the methods inside LoginPage
		loginpage.enterUsername(user);
		loginpage.enterPassword(pin);
		loginpage.clickSignIn();
		boolean homepage=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepage);//Hard Assert-->classname.methodname
	}
	
	@Test
	public void verifyUserLoginWithCorrectUnameAndIncorrectPassword() throws IOException {
		//String username="admin";
		//String password="manager";
		String user=ExcelUtility.readStringData(2, 0, "LoginPage");
		String pin=ExcelUtility.readStringData(2, 1, "LoginPage");		System.out.println("username:" + user + " password:" + pin);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(user);
		loginpage.enterPassword(pin);
		loginpage.clickSignIn();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);//Hard Assert-->classname.methodname
	}
	
	@Test
	public void verifyUserLoginWithIncorrectUnameAndCorrectPassword() throws IOException {
		//String username="harsha";
		//String password="admin";
		String user=ExcelUtility.readStringData(3, 0, "LoginPage");
		String pin=ExcelUtility.readStringData(3, 1, "LoginPage");
		System.out.println("username:" + user + " password:" + pin);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(user);
		loginpage.enterPassword(pin);
		loginpage.clickSignIn();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);//Hard Assert-->classname.methodname
	}
	
	@Test
	public void verifyUserLoginWithIncorrectUnameAndIncorrectPassword() throws IOException {
		//String username="harsha";
		//String password="manager";
		String user=ExcelUtility.readStringData(4, 0, "LoginPage");
		String pin=ExcelUtility.readStringData(4, 1, "LoginPage");
		System.out.println("username:" + user + " password:" + pin);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(user);
		loginpage.enterPassword(pin);
		loginpage.clickSignIn();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);//Hard Assert-->classname.methodname
	}
	
}

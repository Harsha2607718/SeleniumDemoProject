package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class LoginPage{
	
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	
	@FindBy(name = "username")WebElement usernamelocator;
	@FindBy(name = "password")WebElement passwordlocator;
	@FindBy(xpath = "//button[@type='submit']")WebElement signinbutton;
	@FindBy(xpath = "//p[text()='Dashboard']")WebElement dashboardlocator;
	@FindBy(xpath = "//div[contains(@class,'alert-danger')]")WebElement alertlocator;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//1st parameter:local driver,2nd parameter:current class' instance driver.initElements() --> to initialize webelements
	}

	public void enterUsername(String username) {
		usernamelocator.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordlocator.sendKeys(password);
	}
	
	public void clickSignIn() {
		signinbutton.click();
	}
	
	
	/*
	 * public void dropDownCountry() {
	 * pageutility.selectByVisibleTextMethod(alertlocator, null);
	 * fileuploadutility.fileUploadUsingRobotClass(alertlocator, Constant.APPLE); }
	 */
	
	
	public boolean isHomePageDisplayed() {
		return dashboardlocator.isDisplayed();
	}
	
	public boolean isAlertDisplayed() {
		return alertlocator.isDisplayed();
		
	}
}

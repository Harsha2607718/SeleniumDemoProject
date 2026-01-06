package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base{
	
	@Test
	public void login() {
		String username="admin";
		String password="admin";
		WebElement usernamelocator=driver.findElement(By.name("username"));
		usernamelocator.sendKeys(username);
		WebElement passwordlocator=driver.findElement(By.name("password"));
		passwordlocator.sendKeys(password);
		WebElement signinbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		signinbutton.click();
	}
	
	@Test
	public void incorrectLogin1() {
		String username="admin";
		String password="admins1";
		WebElement usernamelocator=driver.findElement(By.name("username"));
		usernamelocator.sendKeys(username);
		WebElement passwordlocator=driver.findElement(By.name("password"));
		passwordlocator.sendKeys(password);
		WebElement signinbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		signinbutton.click();
	}
	
	@Test
	public void incorrectLogin2() {
		String username="harsha";
		String password="admin";
		WebElement usernamelocator=driver.findElement(By.name("username"));
		usernamelocator.sendKeys(username);
		WebElement passwordlocator=driver.findElement(By.name("password"));
		passwordlocator.sendKeys(password);
		WebElement signinbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		signinbutton.click();
	}
	
	@Test
	public void incorrectLogin3() {
		String username="harsha";
		String password="123admin";
		WebElement usernamelocator=driver.findElement(By.name("username"));
		usernamelocator.sendKeys(username);
		WebElement passwordlocator=driver.findElement(By.name("password"));
		passwordlocator.sendKeys(password);
		WebElement signinbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		signinbutton.click();
	}
}

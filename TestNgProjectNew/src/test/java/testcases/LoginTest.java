package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseClass{
	
	
	@Test
	public void LoginFailureTest() {
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys("abc@xyz.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("suba101@");
		
		WebElement rememberMe = driver.findElement(By.id("remember-me"));
		rememberMe.click();
		
		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		loginBtn.click();
		
		//WebElement errMessage = driver.findElement(By.id("msg_box"));
		//System.out.println("The error message is"+errMessage.getText());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("Total number of links are"+links.size());	
	    
	 
		
	}

}

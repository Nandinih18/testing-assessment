package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver2) {
		driver=driver2;
	}
	
	//targets
	private By username=By.id("customer-email");
	private By password=By.id("customer-password");
	private By signinbtn=By.className("submit-login-btn");
	
	//Login action
	
	public void login() {
		this.setUsername();
		this.setPassword();
		this.clickOnSignin();
	}

	
	public void setUsername() {
		driver.findElement(username).sendKeys("mercury");
	}


	public void setPassword() {
		driver.findElement(password).sendKeys("mercury");
	}

	public void clickOnSignin() {
		driver.findElement(signinbtn).click();
	}
	
}
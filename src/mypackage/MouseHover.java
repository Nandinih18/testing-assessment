package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Screenshot.takepicture(driver,"img1");
		Actions action=new Actions(driver);
		WebElement electronics=driver.findElement(By.linkText("Best Sellers"));
		action.moveToElement(electronics).build().perform();
		Screenshot.takepicture(driver,"img2");
		electronics.click();
		Thread.sleep(3000);
		
		WebElement samsung=driver.findElement(By.linkText("Pet Supplies"));
		action.moveToElement(samsung).build().perform();
		Screenshot.takepicture(driver , "img3");
		Thread.sleep(3000);
		
		samsung.click();
		Screenshot.takepicture(driver , "img4");
		
	}

}

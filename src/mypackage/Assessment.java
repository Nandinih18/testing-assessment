package mypackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		Actions action=new Actions(driver);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Screenshot.takepicture(driver,"img1");
		Thread.sleep(3000);
		
		WebElement watches=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[4]/div/span/div/div/div/div/div[3]/h2/a/span"));
		action.moveToElement(watches).build().perform();
		watches.click();
		
		Thread.sleep(3000);
		driver.close();
		Set<String> childwindows = driver.getWindowHandles();

		for (String win : childwindows) {
			if (!parent.equals(win)) {
				driver.switchTo().window(win);
				driver.manage().window().maximize();
				Screenshot.takepicture(driver,"img2");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);

	}

}

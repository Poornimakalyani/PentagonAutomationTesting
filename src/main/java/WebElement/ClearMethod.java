package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement Username = driver.findElement(By.id("username"));
		WebElement Password = driver.findElement(By.id("password"));
		Username.clear();
		Thread.sleep(1000);
		Username.sendKeys("Poornima");
		Thread.sleep(2000);
		Password.clear();
		Thread.sleep(1000);
		Password.sendKeys("8088591818");
		Thread.sleep(1000);
		driver.quit();
		

	}

}

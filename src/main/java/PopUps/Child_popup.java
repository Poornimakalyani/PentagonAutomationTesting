package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		//parent page
		driver.findElement(By.name("field-keywords")).sendKeys("mobiles", Keys.ENTER);
		Thread.sleep(1000);
		//parent To child page
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Blue']")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		//removing control from parent page
		child.remove(parent);
		//Shifting control to child page
		for(String windowControl:child) {
			driver.switchTo().window(windowControl);
			driver.findElement(By.linkText("Visit the Apple Store")).click();
			driver.quit();
		}
		

	}

}

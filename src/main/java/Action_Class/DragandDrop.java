package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trello.com/");
		Actions a = new Actions(driver);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("poornimakln08@gmail.com");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("8088591818");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("(//div[text()='Selenium'])[1]")).click();
		/*
		 * WebElement source = driver.findElement(By.linkText("Kickoff meeting"));
		 * WebElement destination =driver.findElement(By.
		 * xpath("//h2[text()='Doing']/../../..//button[text()='Add a card']"));
		 * a.dragAndDrop(source, destination).perform();
		 */
		
		
		  WebElement source = driver.findElement(By.linkText("progress"));
		  WebElement destiny = driver.findElement(By.xpath("//h2[text()='Doing']/../../..//button[text()='Add a card']"));
		  a.dragAndDrop(source, destiny).perform();
		 
		
		/*
		 * WebElement startpoint = driver.findElement(By.linkText("AutomationTesting"));
		 * WebElement endpoint = driver.findElement(By.
		 * xpath("//h2[text()='Doing']/../../..//button[text()='Add a card']"));
		 * a.dragAndDrop(startpoint, endpoint).perform();
		 */
		 
	
		/*
		 * WebElement src = driver.findElement(By.linkText("AutomationTesting"));
		 * Thread.sleep(2000); WebElement desti = driver.findElement(By.
		 * xpath("//h2[text()='Done']/../../..//button[text()='Add a card']"));
		 * a.dragAndDrop(src, desti).perform();
		 */
		
		

	}

}

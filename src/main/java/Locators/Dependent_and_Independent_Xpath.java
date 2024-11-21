package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependent_and_Independent_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("apple");
		
		driver.findElement(By.xpath("//p[text()='Apple']/../../..//button[text()='ADD']")).click();

	}

}

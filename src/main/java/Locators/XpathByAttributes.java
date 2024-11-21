package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		// X -path by Attributes
		//driver.findElement(By.xpath("))
		
		
		//X-Path by text functions
		
		driver.findElement(By.xpath("//span[text()=\"Shopping cart\"]")).click();
		
		

	}

}

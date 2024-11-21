package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		System.out.println(text);
		

	}

}

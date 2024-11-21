package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/Testing/Sibling.html");
		Thread.sleep(2000);
		//String text = driver.findElement(By.xpath("//td[text()='Max']/preceding-sibling::td")).getText();
		//System.out.println(text);
		String text = driver.findElement(By.xpath("//td[text()='Baghera']/following-sibling::td")).getText();
		System.out.println(text);
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_Partialtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Linktext
		//driver.findElement(By.linkText("Register")).click();
		
		//Partiallinktext
		driver.findElement(By.partialLinkText("BOOKS")).click();
		

	}

}

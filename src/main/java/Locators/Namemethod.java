package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");//rightclick inspect then clickon 
		//arrow drag which feild ur filling click on it copy value of name tag
		driver.findElement(By.name("websubmit")).click();
		

	}

}

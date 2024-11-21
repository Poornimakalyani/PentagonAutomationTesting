package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		// By using this mobile number cant fetch bcz of more iframe
		//driver.findElement(By.id("regEmail")).sendKeys("8088591818");
		//this is used to fetch mobile number
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("8088591818");
		driver.switchTo().defaultContent();

	}

}

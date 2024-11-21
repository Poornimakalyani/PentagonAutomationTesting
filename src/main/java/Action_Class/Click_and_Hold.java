package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_Hold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Actions a = new Actions(driver);

		// passing text into password text feild
		driver.findElement(By.id("password")).sendKeys("Poornima");

		// 1st approch of identifying the eyeicon
		//WebElement eyeicon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		//a.clickAndHold(eyeicon).perform();

        //2nd approch Mouseovermethod
		
		a.moveByOffset(1184, 317).clickAndHold().perform();
		
		//closing the browser
		driver.quit();

	}

}
